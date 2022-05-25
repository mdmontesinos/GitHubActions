package ual.hmis.sesion05.ejercicio1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class TestEjercicio1 {
	
	@Test 
	void Error() {
		assertTrue(true);
	}

	@Test
	void EsPar() {

		// Arrange
		Ejercicio1 e1 = new Ejercicio1();

		// Act
		int resultado = e1.transformar(4);

		// Assert
		assertEquals(1, resultado);
	}

	@Test
	void EsMultiploDe3() {

		// Arrange
		Ejercicio1 e1 = new Ejercicio1();

		// Act
		int resultado = e1.transformar(6);

		// Assert
		assertEquals(1, resultado);
	}

	@Test
	void EsMultiploDe5() {

		// Arrange
		Ejercicio1 e1 = new Ejercicio1();

		// Act
		int resultado = e1.transformar(15);

		// Assert
		assertEquals(1, resultado);
	}

	@Test
	void EsResultado7() {

		// Arrange
		Ejercicio1 e1 = new Ejercicio1();

		// Act
		int resultado = e1.transformar(210);

		// Assert
		assertEquals(7, resultado);
	}

	@Test
	void EsNegativo() {

		// Arrange
		Ejercicio1 e1 = new Ejercicio1();

		// Act
		int resultado = e1.transformar(-1);

		// Assert
		assertEquals(-1, resultado);
	}

	@ParameterizedTest(name = "{index} => transformar({0}) debe dar {1}")
	@CsvSource({ "4, 1", "9, 1", "35, 7", "210, 7" })
	void Parametrizado(int input, int expected) {
		// Arrange
		Ejercicio1 e1 = new Ejercicio1();

		// Act
		int resultado = e1.transformar(input);

		// Assert
		assertEquals(expected, resultado);
	}

}
