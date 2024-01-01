package org.larcher.poo_clases_abstractas.form.validador;

public class EmailValidador extends Validador{

	protected String message = "El campo %s tiene un formato de correo inválido";
	private final static String EMAIL_REGEX = "∧(.+)@(.+)$";
	
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
		return value.matches(EMAIL_REGEX);
	}

}
