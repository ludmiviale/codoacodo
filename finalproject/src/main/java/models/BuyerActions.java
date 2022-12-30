package models;

import java.sql.*;

public class BuyerActions {
    public static int createBuyer(Buyer b) {
        int state = 0;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/finalproject", "root",
                    "");

            String query = "INSERT INTO Buyers(name, surname, quantity, category) values(?, ?, ?, ?)";

            String name = b.getName();
            String surname = b.getSurname();
            int quantity = b.getQuantity();
            String category = b.getCategory();

            PreparedStatement pst = connection.prepareStatement(query);
            pst.setString(1, name);
            pst.setString(2, surname);
            pst.setInt(3, quantity);
            pst.setString(4, category);

            state = pst.executeUpdate();

            connection.close();

        } catch (Exception e) {
            System.out.println(e);
            System.out.println("ERROR. Algo salió mal");
        }
        return state;
    }

    public static Buyer readBuyerId(int id) {
        Buyer buyer = new Buyer();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/finalproject", "root",
                    "");
            String query = "SELECT * FROM Buyers WHERE id=?";

            PreparedStatement pst = connection.prepareStatement(query);
            pst.setInt(1, id);

            ResultSet getBuyer = pst.executeQuery();

            if (getBuyer.next()) {
                buyer.setId(getBuyer.getInt(1));
                buyer.setName(getBuyer.getString(2));
                buyer.setSurname(getBuyer.getString(3));
                buyer.setQuantity(getBuyer.getInt(4));
                buyer.setCategory(getBuyer.getString(5));
                connection.close();
            }

        } catch (Exception e) {
            System.out.println("ERROR. Algo salió mal");
            System.out.println(e);
        }
        System.out.println(buyer.getId());
        return buyer;
    }

    public static Buyer readSurname(String surname) {
        Buyer buyer = new Buyer();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/finalproject", "root", "");
            String query = "SELECT * FROM Buyers WHERE surname=?";

            PreparedStatement pst = connection.prepareStatement(query);
            pst.setString(1, surname);

            ResultSet getBuyer = pst.executeQuery();

            if (getBuyer.next()) {
                buyer.setId(getBuyer.getInt(1));
                buyer.setName(getBuyer.getString(2));
                buyer.setSurname(getBuyer.getString(3));
                buyer.setQuantity(getBuyer.getInt(4));
                buyer.setCategory(getBuyer.getString(5));
                connection.close();
            }

        } catch (Exception e) {
            System.out.println("ERROR. Algo salió mal");
            System.out.println(e);
        }
        System.out.println(buyer.getId());
        return buyer;
    }
}
