package com.ms.test.pilha;

import java.util.ArrayList;
import java.util.List;

public class Pilha {
	
	private int limite = 5;
	private List<Livro> pilha = new ArrayList<>();
	
	public void push(Livro livro) {
		if(pilha.size() >= limite) {
			throw new ArrayStoreException();
		}
		if(!livro.getTitulo().startsWith("A") &&
				!livro.getTitulo().startsWith("O") ) {
			return;
		}
		pilha.add(livro);
		
	}
	
	public Livro pop() {
		Livro livro = pilha.get(pilha.size() -1);
		pilha.remove(pilha.size() -1);
		return livro;
	}
	
	public int count() {
		return pilha.size();
	}

}
