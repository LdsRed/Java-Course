package org.larcher.poointerfaces.imprenta.modelo;

public abstract class Hoja implements Imprimible {

    protected String contenido;

    public Hoja(String contenido) {
        this.contenido = contenido;
    }

    public abstract String imprimir();
}
