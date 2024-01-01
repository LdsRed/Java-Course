package org.larcher.project_catalog.modelo;
import java.util.Date;


public class Libro extends Producto implements IProducto, ILibro{


    private Date fechaPublicacion = new Date();

    private String author;
    private String titulo;
    private String editorial;

    public Libro(int precio, String author, String titulo, String editorial) {
        super(precio);
        this.author = author;
        this.titulo = titulo;
        this.editorial = editorial;
    }




    @Override
    public double getPrecioVenta() {
        return getPrecio() * 0.85;
    }

    @Override
    public Date getFechaPublicacion() {
        return this.fechaPublicacion;
    }

    @Override
    public String getAutor() {
        return this.author;
    }

    @Override
    public String getTitulo() {
        return this.titulo;
    }

    @Override
    public String getEditorial() {
        return this.editorial;
    }
}
