package trabajofinal.web.models;

import java.io.Serializable;

public class Comprador implements Serializable {
    private int id, cantidad;
    private String nombre, apellido, tipoentrada;

    public Comprador() {
    }

    public int getId() {
        return id;
    }

    public void setId(int nuevoId) {
        this.id = nuevoId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String nuevoApellido) {
        this.apellido = nuevoApellido;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int i) {
        this.cantidad = i;
    }

    public String getTipoentrada() {
        return tipoentrada;
    }

    public void setTipoentrada(String nuevoTipoentrada) {
        this.tipoentrada = nuevoTipoentrada;
    }
}