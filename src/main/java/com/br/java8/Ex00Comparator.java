package com.br.java8;

import java.util.List;

import com.br.java8.domain.Funcionario;
import com.br.java8.interfaces.IMetodosImplement;

public class Ex00Comparator {

	public static void main(String...args) {
		// *****************************
		// comparator by String
		// *****************************
		List<Funcionario> lista = new IMetodosImplement().listaFuncionarios();
		
		System.out.println("------------ Before Sort ------------");
		for (Funcionario func : lista) {
			System.out.println(func.getNome());
		}
		System.out.println("------------ After Sort by Nome------------");
  	    lista.sort((Funcionario f1, Funcionario f2) -> f1.getNome().compareTo(f2.getNome()));
		lista.forEach((item)->System.out.println(item.getNome()));
		
		// *****************************
		// comparator by float
		// *****************************
		System.out.println("------------ After Sort by Salário------------");
		lista.sort((Funcionario o1, Funcionario o2)-> (int)( o1.getSalario() - o2.getSalario()) );
		lista.forEach((item)->System.out.println(item.getSalario()));
	}
	
}
