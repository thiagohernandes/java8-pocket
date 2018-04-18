package com.br.java8;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.br.java8.domain.Funcionario;
import com.br.java8.interfaces.IMetodosImplement;

public class Ex01ForEach {
	
	public static void main(String...args) {
		
		System.out.println("----------ForEach Map----------");
		Map<String, Integer> items = new HashMap<>();
		items.put("A", 10);
		items.put("B", 20);
		items.put("C", 30);
		items.put("D", 40);
		items.put("E", 50);
		items.put("F", 60);
		
		System.out.println("----------ForEach First One----------");
		items.forEach((k,v)->System.out.println("Item : " + k + " Count : " + v));
		
		System.out.println("----------ForEach First Two----------");
		items.forEach((k,v)->{
			System.out.println("Item : " + k + " Count : " + v);
			if("E".equals(k)){
				System.out.println("Hello E");
			}
		});
		
		System.out.println("----------ForEach First Three----------");
		List<Funcionario> lista = new IMetodosImplement().listaFuncionarios();
		lista.forEach(func->{
					System.out.println(func.getNome()+" - "+func.getSalario());
		});
	}

}
