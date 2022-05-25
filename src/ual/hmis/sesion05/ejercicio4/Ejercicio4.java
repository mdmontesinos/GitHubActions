package ual.hmis.sesion05.ejercicio4;

import java.time.temporal.ValueRange;
import java.util.List;
import java.util.Vector;

public class Ejercicio4 {
	List<Double> notas;
	List<String> calificaciones;

	public void calculaCalificaciones(List<Double> notas){
		
		calificaciones = new Vector<String>();
		this.notas = notas;
		
		for (Double nota : notas) {
			
			calificaciones.add(calificacion(nota));
		}
	}

	public String calificacion(double nota) {

		if (0 <= nota && nota < 5) {
			return "Suspenso";
		}
		else if (5 <= nota && nota < 7) {
			return "Aprobado";
		}
		else if (7 <= nota && nota < 9) {
			return "Notable";
		}
		else if (9 <= nota && nota < 10) {
			return "Sobresaliente";
		}
		else if (nota == 10) {
			return "Matricula";
		}
		else {
			return "Error en la nota";
		}
	}
}

