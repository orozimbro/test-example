package com.ms.test.pilha;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PilhaTest {
	
	private Pilha pilha;
	
	@Before
	public void setUp() {
		pilha = new Pilha();
		
	}

	@Test(timeout=100) // define um timeout maximo de espera
	public void testRetiraUltimoLivro() {
		Livro livro1 = new Livro("A Fortaleza");
		Livro livro2 = new Livro("A Emboscada");
		Livro livro3 = new Livro("O Naufrago");
		
		pilha.push(livro1);
		pilha.push(livro2);
		pilha.push(livro3);
		
		assertEquals(livro3, pilha.pop());
	}
	
	@Test(expected = ArrayStoreException.class)
	public void testNaoAddLivroAlemLimite() {
		Livro livro1 = new Livro("A Fortaleza");
		Livro livro2 = new Livro("A Emboscada");
		Livro livro3 = new Livro("O Naufrago");
		Livro livro4 = new Livro("O Palhaço");
		Livro livro5 = new Livro("A Lua");
		Livro livro6 = new Livro("O Sol");
		
		pilha.push(livro1);
		pilha.push(livro2);
		pilha.push(livro3);
		pilha.push(livro4);
		pilha.push(livro5);
		pilha.push(livro6);
	}
	
	@Test
	public void testNaoAddLivroForaPadraoNome() {
		Livro livro1 = new Livro("A Fortaleza");
		Livro livro2 = new Livro("Homem de Ferro");
		
		pilha.push(livro1);
		pilha.push(livro2);
		
		assertEquals(1, pilha.count());
		assertEquals(livro1, pilha.pop());		
	}
	
	@Test
	public void testHashCode() {
		Livro livro = new Livro();
		assertNotNull(livro.hashCode());
		livro.setTitulo("A Fortaleza");
		assertNotNull(livro.hashCode());
	}
	
	@Test
	public void testEquals() {
		Livro livro1 = new Livro();
		Livro livro2 = null;
		assertFalse(livro1.equals(livro2));
		livro2 = new Livro();
		assertTrue(livro1.equals(livro2));
		livro1.setTitulo("A Lua");
		assertFalse(livro1.equals(livro2));
		livro1.setTitulo(null);
		assertTrue(livro1.equals(livro2));
		livro1.setTitulo("A Lua");
		livro2.setTitulo("O Sol");
		assertFalse(livro1.equals(livro2));
		livro2.setTitulo("A Lua");
		assertTrue(livro1.equals(livro2));
		assertFalse(livro1.equals(new String("O Sol")));
		livro1.setTitulo(null);
		assertFalse(livro1.equals(livro2));
	}

}
