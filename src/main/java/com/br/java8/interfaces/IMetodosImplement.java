package com.br.java8.interfaces;

import java.util.ArrayList;
import java.util.List;

import com.br.java8.domain.Funcionario;

public class IMetodosImplement implements IMetodos{
	
	public List<Funcionario> listaFuncionarios(){
		List<Funcionario> lista = new ArrayList<Funcionario>();
		lista.add(new Funcionario(1,"Fernanda", 1145));
		lista.add(new Funcionario(2,"Clara", 5000));
		lista.add(new Funcionario(3,"Alisson", 9000));
		lista.add(new Funcionario(4,"Gemina", 1900));
		lista.add(new Funcionario(5,"Letícia", 12000));
		lista.add(new Funcionario(6,"Astolfo", 7000));
		lista.add(new Funcionario(7,"Astolfo", 6000));
		lista.add(new Funcionario(8,"Astolfo", 5000));
		lista.add(new Funcionario(9,"Gemina", 2000));
		return lista;
	}

}
