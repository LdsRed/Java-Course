package org.larcher.poo_clases_abstractas.elementos;

public abstract class ElementoForm {
	
	
	protected String valor;
	protected String nombre; 
	
	
	public ElementoForm() {

	}

	
	public ElementoForm(String valor) {
		super();
		this.valor = valor;
	}

	

	public ElementoForm(String valor, String nombre) {
		super();
		this.valor = valor;
		this.nombre = nombre;
	}



	public void setValor(String valor) {
		this.valor = valor;
	}


	public abstract String dibujarHtml();

}
