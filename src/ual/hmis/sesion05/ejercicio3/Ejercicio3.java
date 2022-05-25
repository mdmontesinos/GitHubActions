package ual.hmis.sesion05.ejercicio3;

import java.time.temporal.ValueRange;

public class Ejercicio3 {

	public String enmascarar(String password){
		if (password.length() < 5) {
			return "password demasiado corto";
		}
		
		else if (ValueRange.of(5, 8).isValidIntValue(password.length())) {
			return "********";
		}
		else if (ValueRange.of(12, 40).isValidIntValue(password.length())) {
			return "************";
		}
		else if (password.length() > 40){
			return "password demasiado largo";
		}
		else {
			String resultado = "";
			
			for (int i = 0; i < password.length(); i++) {
				resultado += "*";
			}
			
			return resultado;
		}
	}
}
