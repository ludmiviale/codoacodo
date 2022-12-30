package servlets;

import java.io.IOException;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import models.BuyerActions;
import models.Buyer;

@WebServlet(name = "readSurname", urlPatterns = { "/readSurname" })
public class ReadSurnameServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String n = req.getParameter("surname");

        Buyer buyer = BuyerActions.readSurname(n);

        req.setAttribute("buyer", buyer);

        RequestDispatcher respuesta = req.getRequestDispatcher("/surnamebuyer.jsp");
        respuesta.forward(req, resp);
    }
}
