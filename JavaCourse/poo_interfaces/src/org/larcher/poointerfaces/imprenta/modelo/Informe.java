package org.larcher.poointerfaces.imprenta.modelo;

public class Informe extends Hoja implements Imprimible{

    private Persona author;
    private Persona revisor;

    public Informe(Persona author, Persona revisor, String contenido) {
        super(contenido);
        this.author = author;
        this.revisor = revisor;

    }

    @Override
    public String imprimir() {
        return "Informe escrito por: "  + author + "\nRevisado por: " + revisor + "\n" + this.contenido;
    }
}
