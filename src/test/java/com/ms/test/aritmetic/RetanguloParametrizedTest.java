package com.ms.test.aritmetic;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class RetanguloParametrizedTest {
	
	private Retangulo retangulo;
	
	private int base;
	private int altura;
	private int area;
	
	
	@Parameters
	public static Collection<Object[]> parametros(){
		return Arrays.asList(new Object[][] {
			{10,20,200},
			{10,30,300},
			{10,40,400},
			{5,20,100},
			{20,20,400},
			{10,20,200},
			{10,20,200},
			{10,20,200},
			{10,5,50}
		});
		
	}
	
	public RetanguloParametrizedTest(int base, int altura, int area) {
		this.base = base;
		this.altura = altura;
		this.area = area;
	}

	@Test
	public void testCalcularArea() {
		retangulo = new Retangulo(base, altura);
		assertEquals(area, retangulo.calcularArea());
	}
	
	@Test
	public void testCalcularPerimetro() {
		retangulo = new Retangulo(10, 2);
		assertEquals(24, retangulo.calcularPerimetro());
	}

}
