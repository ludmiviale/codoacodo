package trabajofinal.web.models;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AccionesComprador {
    public static int registrarComprador(Comprador c) {
        int estado = 0;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/trabajo_final_integrador", "root",
                    "");

            String query = "INSERT INTO Compradores(nombre, apellido, cantidad, tipoentrada) values(?, ?, ?, ?)";

            String nombre = c.getNombre();
            String apellido = c.getApellido();
            int cantidad = c.getCantidad();
            String tipoentrada = c.getTipoentrada();

            PreparedStatement pst = conexion.prepareStatement(query);
            pst.setString(1, nombre);
            pst.setString(2, apellido);
            pst.setInt(3, cantidad);
            pst.setString(4, tipoentrada);

            estado = pst.executeUpdate();

            conexion.close();

        } catch (Exception e) {
            System.out.println(e);
            System.out.println("ERROR. Algo salió mal");
        }
        return estado;
    }

    public static int actualizarComprador(Comprador c) {
        int estado = 0;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/trabajo_final_integrador", "root",
                    "");
            String query = "UPDATE Compradores SET nombre=?, apellido=?, cantidad=?, tipoentrada=? WHERE id=?";

            int id = c.getId();
            String nombre = c.getNombre();
            String apellido = c.getApellido();
            int cantidad = c.getCantidad();
            String tipoentrada = c.getTipoentrada();

            PreparedStatement pst = conexion.prepareStatement(query);
            pst.setString(1, nombre);
            pst.setString(2, apellido);
            pst.setInt(3, cantidad);
            pst.setString(4, tipoentrada);
            pst.setInt(5, id);

            estado = pst.executeUpdate();

            conexion.close();

        } catch (Exception e) {
            System.out.println("ERROR. Algo salió mal");
        }
        return estado;
    }

    public static Comprador consultarComprador(String nombreAConsultar) {
        Comprador compradorADevolver = new Comprador();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/trabajo_final_integrador", "root",
                    "");
            String query = "SELECT * FROM Compradores WHERE nombre=?";

            PreparedStatement pst = conexion.prepareStatement(query);
            pst.setString(1, nombreAConsultar);

            ResultSet consultaComprador = pst.executeQuery();

            if (consultaComprador.next()) {
                compradorADevolver.setId(consultaComprador.getInt(1));
                compradorADevolver.setNombre(consultaComprador.getString(2));
                compradorADevolver.setApellido(consultaComprador.getString(3));
                compradorADevolver.setCantidad(consultaComprador.getInt(4));
                compradorADevolver.setTipoentrada(consultaComprador.getString(5));
                conexion.close();
            }

        } catch (Exception e) {
            System.out.println("ERROR. Algo salió mal");
            System.out.println(e);
        }
        System.out.println(compradorADevolver);
        return compradorADevolver;
    }

    public static List<Comprador> consultarTodosComprador() {
        List<Comprador> listaCompradoresADevolver = new ArrayList<Comprador>();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/trabajo_final_integrador", "root",
                    "");
            String query = "SELECT * FROM Compradores";

            PreparedStatement pst = conexion.prepareStatement(query);

            ResultSet consultaComprador = pst.executeQuery();

            while (consultaComprador.next()) {
                Comprador compradorADevolver = new Comprador();
                compradorADevolver.setId(consultaComprador.getInt(1));
                compradorADevolver.setNombre(consultaComprador.getString(2));
                compradorADevolver.setApellido(consultaComprador.getString(3));
                compradorADevolver.setCantidad(consultaComprador.getInt(4));
                compradorADevolver.setTipoentrada(consultaComprador.getString(5));
                listaCompradoresADevolver.add(compradorADevolver);
            }
            conexion.close();

        } catch (Exception e) {
            System.out.println("ERROR. Algo salió mal");
        }
        return listaCompradoresADevolver;
    }

    public static int borrarComprador(int idABorrar) {
        int estado = 0;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/trabajo_final_integrador", "root",
                    "");
            String query = "DELETE FROM Compradores WHERE id=?";

            PreparedStatement pst = conexion.prepareStatement(query);

            pst.setInt(1, idABorrar);

            estado = pst.executeUpdate();

            conexion.close();

        } catch (Exception e) {
            System.out.println("ERROR. Algo salió mal");
        }
        return estado;
    }
}