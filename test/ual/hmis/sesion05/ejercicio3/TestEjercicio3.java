package ual.hmis.sesion05.ejercicio3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class TestEjercicio3 {

	static Ejercicio3 e3;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		e3 = new Ejercicio3();
	}

	@ParameterizedTest(name = "{index} => enmascarar({0}) debe ser {1}")
	@CsvFileSource(files = "test/ual/hmis/sesion05/ejercicio3/datosEjercicio3.csv")
	void testEnmascarar(String input, String output) {
		
		String resultado = e3.enmascarar(input);
		
		assertEquals(output, resultado);
	}

}
