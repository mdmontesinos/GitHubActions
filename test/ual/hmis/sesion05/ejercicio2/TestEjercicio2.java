package ual.hmis.sesion05.ejercicio2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import ual.hmis.sesion05.ejercicio2.Ejercicio2;

class TestEjercicio2 {
	
	static Ejercicio2 e2;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		e2 = new Ejercicio2();
	}

	@ParameterizedTest(name = "{index} => login({0},{1}) debe ser {2}")
	@CsvSource({"'','',false",
				"'','contraseña',false",
				"'usuario','',false",
				"'aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa', 'contraseña', false",
				"'usuario', 'aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa', false",
				"'user','pass',true"})
	void testLogin(String user, String password, boolean result) {
		
		boolean resultado = e2.login(user, password);
		
		assertEquals(result, resultado);
	}

	@ParameterizedTest(name = "{index} => compruebaLoginEnDB({0},{1}) debe ser {2}")
	@CsvSource({"'user','contraseña',false",
				"'usuario','pass',false",
				"'user','pass',true"})
	void testCompruebaLoginEnBD(String user, String password, boolean result) {
		
		boolean resultado = e2.compruebaLoginEnBD(user, password);
		
		assertEquals(result, resultado);
	}

}
