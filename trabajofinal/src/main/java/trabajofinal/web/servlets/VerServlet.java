package trabajofinal.web.servlets;

import java.io.IOException;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import trabajofinal.web.models.AccionesComprador;
import trabajofinal.web.models.Comprador;

@WebServlet("/consultarComprador")
public class VerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String n = req.getParameter("name");

        Comprador registro = AccionesComprador.consultarComprador(n);
        
        req.setAttribute("c", registro);

        RequestDispatcher respuesta = req.getRequestDispatcher("infoComprador.jsp");
        respuesta.forward(req, resp);
    }
}
