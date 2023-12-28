package org.larcher.poo_clases_abstractas.elementos;

import java.util.ArrayList;
import java.util.List;

import org.larcher.poo_clases_abstractas.elementos.select.Options;

public class SelectForm extends ElementoForm{

	private List<Options> opciones; 
	
	public SelectForm(String nombre) {
		super(nombre);
		this.opciones = new ArrayList<Options>();
	}
	
	public SelectForm(String nombre, List<Options> opciones) {
		super(nombre);
		this.opciones = opciones;
	}


	public SelectForm addOption(Options option) {
		this.opciones.add(option);
		return this;
	}
	
	
	@Override
	public String dibujarHtml() {
		StringBuilder sb = new StringBuilder("<select ");
		sb.append("name='")
		.append(this.nombre)
		.append("'>");
		
		for(Options option: this.opciones) {
			 sb.append("\noption value='")
			 .append(option.getValor())
			 .append("'");
			 if(option.isSelected()) {
				 sb.append(" selected");
			 }
			 
			 sb.append(">")
			 .append(option.getName())
			 .append("</options>");
		}
		
		sb.append("</select>");
		return sb.toString();
	}

}
