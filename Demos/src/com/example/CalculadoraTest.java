package com.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	void sumaTest() {
		var c = new Calculadora();
		var rslt = c.suma(1, 2);
		assertEquals(3, rslt);
	}
	@Test
	void suma2Test() {
		var c = new Calculadora();
		var rslt = c.suma(0.1, 0.2);
		assertEquals(0.3, rslt);
	}
	@Test
	void suma3Test() {
		var c = new Calculadora();
		var rslt = c.suma(1, -2);
		assertEquals(-1, rslt);
	}

}
