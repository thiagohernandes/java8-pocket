package com.br.java8.domain;

import java.math.BigDecimal;

public class Item {

	private String nome;
	private int qtd;
	private BigDecimal valor;
	
	public Item() {
		
	}
	
	public Item(String nome, int qtd, BigDecimal valor) {
		this.nome = nome;
		this.qtd = qtd;
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	
}
