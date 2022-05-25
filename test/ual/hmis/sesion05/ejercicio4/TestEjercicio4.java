package ual.hmis.sesion05.ejercicio4;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;
import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.MethodSource;

class TestEjercicio4 {
	
	static Ejercicio4 e4;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		e4 = new Ejercicio4();
	}

	@ParameterizedTest(name = "{index} => CalculaCalificaciones({0}) debe ser {1}")
	@MethodSource("parametrosTest")
	void testCalculaCalificaciones(List<Double> notas, List<String> calificaciones) {
		
		e4.calculaCalificaciones(notas);
		
		assertArrayEquals(calificaciones.toArray(), e4.calificaciones.toArray());
		assertArrayEquals(notas.toArray(), e4.notas.toArray());
	}

	@ParameterizedTest(name = "{index} => calificacion({0}) debe ser {1}")
	@CsvFileSource(files = "test/ual/hmis/sesion05/ejercicio4/datosTestCalificacionEjercicio4.csv")
	void testCalificacion(Double nota, String calificacion) {
		
		String resultado = e4.calificacion(nota);
		
		assertEquals(calificacion, resultado);
	}
	
	static Stream<Arguments> parametrosTest(){
		
		return Stream.of(
				Arguments.of(new Vector<Double>(), new Vector<String>()),
				Arguments.of(Arrays.asList(0.0, 10.1, -3.0, 4.9, 5.0, 6.5, 6.9, 7.0, 8.9, 9.9, 10.0, -0.1), 
						Arrays.asList("Suspenso", "Error en la nota", "Error en la nota", "Suspenso", "Aprobado", "Aprobado", "Aprobado", "Notable", "Notable", "Sobresaliente", "Matricula", "Error en la nota"))
		);
	}

}
