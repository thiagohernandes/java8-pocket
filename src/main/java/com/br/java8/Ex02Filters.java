package com.br.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.br.java8.domain.Funcionario;
import com.br.java8.interfaces.IMetodosImplement;

public class Ex02Filters {

	public static void main(String...args) {
		
		System.out.println("--------Stream Filter---------");
		List<String> lines = Arrays.asList("spring", "node", "mkyong");

        List<String> result = lines.stream()                // convert list to stream
                .filter(line -> !"mkyong".equals(line))     // we dont like mkyong
                .collect(Collectors.toList());              // collect the output and convert streams to a List

        result.forEach(System.out::println);   
        
        System.out.println("--------Stream Filter, FindAny, orElse---------");
        List<Funcionario> lista = new IMetodosImplement().listaFuncionarios();
        
        Funcionario result1 = lista.stream()                        // Convert to steam
                .filter(x -> "Clara".equals(x.getNome()))        // we want "jack" only
                .findAny()                                      // If 'findAny' then return found
                .orElse(null);                                  // If not found, return null

        System.out.println(result1.getNome());
        
        Funcionario result2 = lista.stream()
                .filter(x -> "ahmook".equals(x.getNome()) && x.getCodigo() == 2)
                .findAny()
                .orElse(null);

        System.out.println(result2 != null ? result2.getNome() : "null mesmo!");
        
        System.out.println("--------Stream Filter, Map---------");
        
        double salario = lista.stream()
                .filter(x -> "Astolfo".equals(x.getNome()))
                .map(Funcionario::getSalario)                       
                .findAny()
                .orElse((double) 0);

        System.out.println("Salário : " + salario);

        List<String> collect = lista.stream()
                .map(Funcionario::getNome)
                .collect(Collectors.toList());

        collect.forEach(System.out::println);
        
        System.out.println("--------Stream Filter, Map witch Transformation---------");
        List<Funcionario> novaListaClasseSalarial = lista.stream().map(temp -> {
										            Funcionario obj = new Funcionario();
										            if (temp.getSalario() <= 1000.00) {
										                obj.setClasseSalarial('A');
										            } else if(temp.getSalario() >= 1000.00 &&
										            		  temp.getSalario() <= 2000.00) {
										            	obj.setClasseSalarial('B');
										            } else {
										            	obj.setClasseSalarial('C');
										            }
										            obj.setNome(temp.getNome());
										            obj.setSalario(temp.getSalario());
										            return obj;
        }).collect(Collectors.toList());

        novaListaClasseSalarial.forEach(funcionario->{
				System.out.println(funcionario.getNome()+" - "+funcionario.getClasseSalarial() +" - "+funcionario.getSalario());
		});
	}
	
}
