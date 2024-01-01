package org.larcher.poo_clases_abstractas.form.validador;

public class NumeroValidador extends Validador {
	
	protected String message = "El campo %s debe ser un número entero";

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
		try {
			Integer.parseInt(value);
			return true;
		} catch ( NumberFormatException e ) {
			return false;
		}
	}

}
