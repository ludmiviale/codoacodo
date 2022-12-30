package servlets;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import models.BuyerActions;
import models.Buyer;

@WebServlet(name = "createbuyer", urlPatterns = { "/createbuyer" })
public class CreateBuyerServlet extends HttpServlet {
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
            Buyer newBuyer = new Buyer();
            newBuyer.setName(n);
            newBuyer.setSurname(s);
            newBuyer.setQuantity(Integer.parseInt(q));
            newBuyer.setCategory(c);
            if (BuyerActions.createBuyer(newBuyer) != 1) {
                flag = false;
            }
        }

        if (flag) {
            resp.sendRedirect("success.jsp");
        } else {
            resp.sendRedirect("error.jsp");
        }
    }
}
