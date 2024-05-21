package Modelo;

import static org.junit.jupiter.api.Assertions.*;
import Modelo.*;

import org.junit.jupiter.api.Test;

class calculadoraTest {

	@Test
	void testSuma() {
		Calculadora calcu = new Calculadora(100,10);
		int resultado = calcu.suma();
		assertEquals(110,resultado);
	}

	@Test
	void testResta() {
		Calculadora calcu = new Calculadora(20,10);
		int resultado = calcu.resta();
		assertEquals(10,resultado);
	}

	@Test
	void testResta2() {
		Calculadora calcu = new Calculadora(20,10);
		boolean resultado = calcu.resta2();
		assertTrue(resultado);
	}

	@Test
	void testDivide2() {
		Calculadora calcu = new Calculadora(10,0);
		Integer resultado = calcu.divide2();
		assertNull(resultado);
	}

	@Test
	void testMultiplica() {
		Calculadora calcu = new Calculadora(10,2);
		int resultado = calcu.multiplica();
		assertEquals(20, resultado);
	}

	@Test
	void testDivide() {
		Calculadora calcu = new Calculadora(10,2);
		int resultado = calcu.divide();
		assertEquals(5, resultado);
	}

}
