package trabajofinal.web.servlets;

import trabajofinal.web.models.AccionesComprador;
import trabajofinal.web.models.Comprador;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/nuevocomprador")
public class InsertarServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String n, s, q, c;

        n = req.getParameter("name");
        s = req.getParameter("surname");
        q = req.getParameter("quantity");
        c = req.getParameter("category");

        boolean flag = true;

        if (n == "" || s == "" || q == "" || c == "") {
            flag = false;
        } else {
            Comprador nuevoComprador = new Comprador();
            nuevoComprador.setNombre(n);
            nuevoComprador.setApellido(s);
            nuevoComprador.setCantidad(Integer.parseInt(q));
            nuevoComprador.setTipoentrada(c);
            if (AccionesComprador.registrarComprador(nuevoComprador) != 1) {
                flag = false;
            }
        }

        if (flag) {
            resp.sendRedirect("exito.jsp");
        } else {
            resp.sendRedirect("error.jsp");
        }
    }
}
