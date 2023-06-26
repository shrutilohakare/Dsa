package com.HashMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortByLambda {
	
	public static void main(String[] args) {
		
		Map<String,Integer> map=new HashMap<>();
		map.put("M", 38);
		map.put("L", 46);
		map.put("P", 55);
		map.put("E", 69);
		map.put("Q", 77);
		map.put("V", 3);
		
		List<Entry<String,Integer>> entries=new ArrayList<>(map.entrySet());
		Collections.sort(entries, (o1,o2)->o1.getKey().compareTo(o2.getKey()));
		
		for(Entry<String,Integer>entry:entries) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
	}
	}
