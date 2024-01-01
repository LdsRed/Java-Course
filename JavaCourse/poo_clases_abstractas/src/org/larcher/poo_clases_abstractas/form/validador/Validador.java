package org.larcher.poo_clases_abstractas.form.validador;

public abstract class Validador {

	protected String message;
	
	public abstract void setMessage(String message);
	public abstract String getMessage();
	public abstract boolean isValid(String value);
}
