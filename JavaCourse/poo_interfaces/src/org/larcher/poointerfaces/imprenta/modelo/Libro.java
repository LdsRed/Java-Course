package org.larcher.poointerfaces.imprenta.modelo;

import java.util.ArrayList;
import java.util.List;

public class Libro implements Imprimible {

    private List<Imprimible> paginas;
    private String titulo;
    private Persona autor;
    private Genero genero;

    public Libro(String titulo, Persona autor, Genero genero) {
        this.paginas = new ArrayList<>();
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
    }


    public Libro addPagina(Hoja pagina){
        this.paginas.add(pagina);
        return this;
    }

    @Override
    public String imprimir() {
        StringBuilder sb = new StringBuilder("Titulo: ");
        sb.append(this.titulo).append("\n")
                .append("Autor: ").append(this.autor).append("\n")
                .append("Genero: ").append(this.genero).append("\n");

        for (Imprimible pag : this.paginas) {
            sb.append(pag.imprimir()).append("\n");
        }
        return sb.toString();

    }
}
