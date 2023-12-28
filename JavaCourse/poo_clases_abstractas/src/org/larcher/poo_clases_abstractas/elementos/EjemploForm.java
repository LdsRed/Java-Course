package org.larcher.poo_clases_abstractas.elementos;

import org.larcher.poo_clases_abstractas.elementos.select.Options;

public class EjemploForm {

	public static void main(String[] args) {
	
		InputForm username = new InputForm("username");
		InputForm password = new InputForm("clave","password");
		InputForm email = new InputForm("email", "email");
		InputForm edad = new InputForm("edad", "number");
		
		
		TextAreaForm experiencia = new TextAreaForm("exp", 5, 9);
		
		SelectForm language = new SelectForm("Language");
		
		Options java = new  Options("1", "java");
		
		language.addOption(java);
		language.addOption(new Options("2", "python"));
		language.addOption(new Options("3", "Javascript"));
		language.addOption(new Options("4", "Typescript"));
		language.addOption(new Options("5", "Rust"));
		
		
		
		username.setValor("raul");
		password.setValor("anunaki2023");
		email.setValor("losanunakisvanaconquistarelmundo@gmail.com");
		edad.setValor("28");
		experiencia.setValor("...mas de 50 años de experiencia...");
		java.setSelected(true);
	}
}
