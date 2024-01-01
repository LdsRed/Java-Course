package org.larcher.poo_clases_abstractas.form.validador;

public class NoNuloValidador extends Validador{

	protected String message = "El campo %s no puede ser nulo"; 

	@Override
	public void setMessage(String message) {
		this.message = message;
		
	}

	@Override
	public String getMessage() {
		return message;
	}

	@Override
	public boolean isValid(String value) {
		
		return (value != null);
	}

}
