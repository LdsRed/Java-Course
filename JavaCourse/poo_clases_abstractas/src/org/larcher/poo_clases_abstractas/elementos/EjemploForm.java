package org.larcher.poo_clases_abstractas.elementos;

import java.util.ArrayList;
import java.util.List;

import org.larcher.poo_clases_abstractas.elementos.select.Options;
import org.larcher.poo_clases_abstractas.form.validador.EmailValidador;
import org.larcher.poo_clases_abstractas.form.validador.LargoValidador;
import org.larcher.poo_clases_abstractas.form.validador.RequeridoValidador;

public class EjemploForm {

	public static void main(String[] args) {
	
		InputForm username = new InputForm("username");
		username.addValidador(new RequeridoValidador());
		InputForm password = new InputForm("clave","password");
		password.addValidador(new RequeridoValidador())
		.addValidador(new LargoValidador(5, 12));
		
		InputForm email = new InputForm("email", "email");
		email.addValidador(new RequeridoValidador())
		.addValidador(new EmailValidador());
		InputForm edad = new InputForm("edad", "number");
		
		
		TextAreaForm experiencia = new TextAreaForm("exp", 5, 9);
		
		SelectForm language = new SelectForm("Language");
		
		Options java = new  Options("1", "java");
		
		language.addOption(java)
		.addOption(new Options("2", "python"))
		.addOption(new Options("3", "Javascript"))
		.addOption(new Options("4", "Typescript"))
		.addOption(new Options("5", "Rust"));
		
		
		
		username.setValor("raul");
		password.setValor("anunaki2023");
		email.setValor("losanunakisvanaconquistarelmundo@gmail.com");
		edad.setValor("28");
		experiencia.setValor("...mas de 50 años de experiencia...");
		java.setSelected(true);
		
		
		ElementoForm saludar = new ElementoForm() {
			
			@Override
			public String dibujarHtml() {
				return "";//"<input disabled name='"+this.nombre+"' value \"" + this.valor>"
			}
		};
		
		List<ElementoForm> elementos = new ArrayList<>();
		
		elementos.add(username);
		elementos.add(password);
		elementos.add(email);
		elementos.add(edad);
		elementos.add(experiencia);
		
		for(ElementoForm e: elementos) {
			System.out.println(e.dibujarHtml());
			System.out.println("<br>");
		}
		
		elementos.forEach(e -> {
			if(!e.isValid()) {
				e.getErrores().forEach(System.out::println);
			}
		});
		
	}
}
