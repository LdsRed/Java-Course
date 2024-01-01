package org.larcher.poointerfaces.imprenta;

import org.larcher.poointerfaces.imprenta.modelo.*;

public class EjemploImprenta {
    public static void main(String[] args) {


        Curriculum cv = new Curriculum(new Persona("Luis", "Larcher"),
                "Ingeniero de Software", "Resumen");
        cv.addExperiencia("Java 8")
        .addExperiencia("Spring Boot")
        .addExperiencia("Angular")
        .addExperiencia("spring Framework")
        .addExperiencia("JPA")
        .addExperiencia("JDBC")
        .addExperiencia("JSP");

        Informe informe = new Informe(new Persona("Luis", "Larcher"),
                new Persona("Luis", "Larcher"), "Estudio sobre Auth 2.0");

        Libro libro = new Libro("Patrones de diseño",
                new Persona("Erich", " Gamma"), Genero.PROGRAMACION);
        libro.addPagina(new Paginas("Patron Observador"))
                        .addPagina(new Paginas("Patron Singleton"))
                                .addPagina(new Paginas("Patron Factory"))
                                .addPagina(new Paginas("Patron Composite"))
                                .addPagina(new Paginas("Patron Fascada"))
                                .addPagina(new Paginas("Patron Page Object Model"));

        imprimir(cv);
        imprimir(informe);
        imprimir(libro);



    }

    public static void imprimir(Imprimible imprimible){
        System.out.println(imprimible.imprimir());
    }
}
