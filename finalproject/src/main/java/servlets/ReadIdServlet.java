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

@WebServlet(name = "readbuyerid", urlPatterns = { "/readbuyerid" })
public class ReadIdServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int i = Integer.parseInt(req.getParameter("id"));

        Buyer buyer = BuyerActions.readBuyerId(i);

        req.setAttribute("buyer", buyer);

        RequestDispatcher rd = req.getRequestDispatcher("/idbuyer.jsp");
        rd.forward(req, resp);
    }
}