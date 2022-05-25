package ual.hmis.sesion05.ejercicio5;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;
import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class TestEjercicio5 {

	static Ejercicio5 e5;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		e5 = new Ejercicio5();
	}

	@ParameterizedTest(name = "{index} => listaOrdenadaEstudiantes({0}, {1}) debe ser {2}")
	@MethodSource("parametrosTest")
	void testListaOrdenadaEstudiantes(List<String> A1, List<String> A2, List<String> combinada) {
		
		List<String> resultado = e5.listaOrdenadaEstudiantes(A1, A2);
		
		assertArrayEquals(combinada.toArray(), resultado.toArray());	
	}

	static Stream<Arguments> parametrosTest(){
		
		return Stream.of(
				Arguments.of(new Vector<String>(), new Vector<String>(), new Vector<String>()),
				Arguments.of(new Vector<String>(), Arrays.asList("A", "B"), Arrays.asList("A", "B")),
				Arguments.of(Arrays.asList("A", "B"), new Vector<String>(), Arrays.asList("A", "B")),
				Arguments.of(Arrays.asList("Z"), Arrays.asList("A", "B"), Arrays.asList("A", "B", "Z")),
				Arguments.of(Arrays.asList("A", "B"), Arrays.asList("Z"), Arrays.asList("A", "B", "Z")),
				Arguments.of(Arrays.asList("A"), Arrays.asList("A"), Arrays.asList("A")),
				Arguments.of(Arrays.asList("A", "C", "K", "X"), Arrays.asList("A", "B", "L", "M", "Z"), Arrays.asList("A", "B", "C", "K", "L", "M", "X", "Z"))
		);
	}
}
