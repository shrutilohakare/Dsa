package com.HashMap;

import java.util.HashMap;
import java.util.Map;

public class SortByLambda {

	public static void main(String[] args) {
		Map<String,Integer> hm=new HashMap<>();
		
		hm.put("k",7);
		hm.put("A",9);
		hm.put("P",6);
		hm.put("L",79);
		hm.put("Q",64);
		hm.put("I",91);
		hm.put("V",55);
		
		hm.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		
		hm.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
    
    
    
	}

}
