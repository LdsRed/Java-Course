package org.larcher.project_catalog.modelo;

public class TvLcd extends Electronico{



    private int pulgada;

    public TvLcd(int precio, String fabricante, int pulgada) {
        super(precio, fabricante);
        this.pulgada = pulgada;
    }

    public int getPulgada() {
        return this.pulgada;
    }


    @Override
    public double getPrecioVenta() {
        return getPrecio() * 0.85;
    }
}
