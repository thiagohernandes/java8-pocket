package com.br.java8;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.br.java8.domain.Funcionario;
import com.br.java8.interfaces.IMetodosImplement;

public class Ex04GroupByCountSortObject {
	
	public static void main(String...args) {
		
		List<Funcionario> lista = new IMetodosImplement().listaFuncionarios();
		
		Map<String, Long> counting = lista.stream().collect(
	                Collectors.groupingBy(Funcionario::getNome, Collectors.counting()));

	    System.out.println(counting);

	    Map<String, Double> sum = lista.stream().collect(
	                Collectors.groupingBy(Funcionario::getNome, Collectors.summingDouble(Funcionario::getSalario)));

	    System.out.println(sum);
	}

}
