package com.br.java8.domain;

public class Funcionario {
	
	private int codigo;
	private String nome;
	private double salario;
	private char classeSalarial; 
	
	public Funcionario() {
		
	}
	
	public Funcionario(int codigo, String nome, double salario) {
		this.codigo = codigo;
		this.nome = nome;
		this.salario = salario;
	}
	
	public Funcionario(int codigo, String nome, double salario, char classeSalarial) {
		this.codigo = codigo;
		this.nome = nome;
		this.salario = salario;
		this.classeSalarial = classeSalarial;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public char getClasseSalarial() {
		return classeSalarial;
	}

	public void setClasseSalarial(char classeSalarial) {
		this.classeSalarial = classeSalarial;
	}
	
	

}
