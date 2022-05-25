package ual.hmis.sesion05.ejercicio5;

import java.util.List;
import java.util.Vector;

public class Ejercicio5 {

	public List<String> listaOrdenadaEstudiantes (List<String> A1, List<String> A2){
		
		List<String> resultado = new Vector<String>();
		
		if (A1.isEmpty() && A2.isEmpty()) {
			return resultado;
		}
		else if (A1.isEmpty()) {
			return A2;
		}
		else if (A2.isEmpty()) {
			return A1;
		}
		
		int i = 0;
		int j = 0;
		
		
		String elemA1;
		String elemA2;
		
		//Bucle principal para aniadir los elementos ordenados de ambos listas
		while (i < A1.size() && j < A2.size()) {
			
			elemA1 = A1.get(i);
			elemA2 = A2.get(j);
			
			if (elemA1.equals(elemA2)) {
				resultado.add(elemA1);
				i++;
				j++;
			}
			else if (elemA1.compareTo(elemA2) < 0) {
				resultado.add(elemA1);
				i++;
			}
			else {
				resultado.add(elemA2);
				j++;
			}
		}
		
		//Bucles secundarios para aniadir los elementos restantes,
		//cuando alguna de las listas se ha aniadido completamente
		while (i < A1.size()) {
			resultado.add(A1.get(i));
			i++;
		}
		
		while (j < A2.size()) {
			resultado.add(A2.get(j));
			j++;
		}
		
		
		return resultado;
	}
}
