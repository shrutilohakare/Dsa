package com.HashMap;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortExample {
	
	//This map stores unsorted values
	static Map<String,Integer> map=new HashMap<>();
  
	public static void sortByKey() {
   //TreeMap to store value of hashmap-great for searching and sorting
		TreeMap<String,Integer>sorted =new TreeMap<>();
		
		sorted.putAll(map);
		
		for(Map.Entry<String,Integer>entry:sorted.entrySet()){
			System.out.println("key "+entry.getKey()+"  value "+entry.getValue());
		}
}
	public static void main(String[] args) {
		map.put("B", 89);
		map.put("z", 85);
		map.put("O", 99);
		map.put("S", 79);
		map.put("u", 70);
		sortByKey();
	}
}
