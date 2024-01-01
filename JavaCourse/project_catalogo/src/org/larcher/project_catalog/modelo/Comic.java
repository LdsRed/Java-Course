package org.larcher.project_catalog.modelo;
import java.util.Date;
public class Comic extends Libro{

    private String personaje;


    public Comic(int precio, String author, String titulo, String editorial, String personaje) {
        super(precio, author, titulo, editorial);
        this.personaje = personaje;
    }


    public String getPersonaje() {
        return this.personaje;
    }

    @Override
    public double getPrecioVenta() {
        return this.getPrecio() * 0.85;
    }
}
