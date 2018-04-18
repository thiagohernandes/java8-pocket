package com.br.java8;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Ex03GroupByCountSortMap {
	
	public static void main(String...args) {
		 //3 apple, 2 banana, others 1
        List<String> items = Arrays.asList("apple", "apple", "banana",
                        				   "apple", "orange", "banana", "papaya");

        Map<String, Long> result =
                items.stream()
                	 .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(result);
        
        // final map sorted
        Map<String, Long> finalMap = new LinkedHashMap<>();

        //Sort a map and add to finalMap
        result.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue()
                        .reversed()).forEachOrdered(e -> finalMap.put(e.getKey(), e.getValue()));

        System.out.println(finalMap);
        
	}

}