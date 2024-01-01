package org.larcher.poointerfaces.imprenta.modelo;

import java.util.ArrayList;
import java.util.List;

public class Curriculum extends Hoja implements Imprimible{
    private Persona persona;
    private String Carrera;
    private List<String> experiencia;

    public Curriculum(Persona persona, String carrera, String contenido) {
        super(contenido);
        this.persona = persona;
        this.Carrera = carrera;
        this.experiencia = new ArrayList<>();
    }


    public Curriculum addExperiencia(String experiencia){
        this.experiencia.add(experiencia);
        return this;
    }


    @Override
    public String imprimir() {

        StringBuilder sb = new StringBuilder("Nombre: ");
        sb.append(persona).append("\n")
                .append("Resumen: ").append(this.contenido).append("\n")
                .append("Profesion: ").append(Carrera).append("\n")
                .append("Experiencia: ").append("\n");
        for (String exp : experiencia) {
            sb.append("-").append(exp).append("\n");
        }
        return sb.toString();
    }
}
