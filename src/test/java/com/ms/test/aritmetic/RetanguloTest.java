package com.ms.test.aritmetic;

import static org.junit.Assert.*;

import org.junit.Test;

public class RetanguloTest {
	
	private Retangulo retangulo;

	@Test
	public void testCalcularArea() {
		retangulo = new Retangulo(10, 2);
		assertEquals(20, retangulo.calcularArea());
	}
	
	@Test
	public void testCalcularPerimetro() {
		retangulo = new Retangulo(10, 2);
		assertEquals(24, retangulo.calcularPerimetro());
	}

}
