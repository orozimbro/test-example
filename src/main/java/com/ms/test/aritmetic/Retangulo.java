package com.ms.test.aritmetic;

public class Retangulo {
	
	private int base;
	private int altura;
	
	public Retangulo(int base, int altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	public int calcularArea() {
		return base * altura;
	}
	
	public int calcularPerimetro() {
		return (2 * base) + (2 * altura);
	}

}
