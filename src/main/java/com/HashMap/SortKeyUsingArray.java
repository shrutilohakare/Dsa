package com.HashMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SortKeyUsingArray {
 
	static Map<String, Integer> map=new HashMap<>();
	
	public static void sortByKeys() {
		ArrayList<String> sortedKeys=new ArrayList<String>(map.keySet());
		
		//Display the TreeMap which is naturally sorted
		
		for(String x:sortedKeys) {
			System.out.println(map.get(x));
		}
		
	}
	public static void main(String[] args) {
		map.put("jayant", 80);
		map.put("Abhishek",90);
		map.put("Anushka", 80);
		map.put("Amit", 75);
		map.put("Danish",40);
		
		sortByKeys();

	}

}
