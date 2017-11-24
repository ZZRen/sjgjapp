package com.sjgj.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class test9 {
public static void main(String[] args) {
	
	System.out.println(Test("A"));

}
public static String Test(String str){
	Map<String, String> a1= new TreeMap<>();
	a1.put("A", "0");
	a1.put("B", "A");
	a1.put("C", "A");
	a1.put("D", "A");
	a1.put("E", "B");
	a1.put("F", "C");
	a1.put("G", "C");
	a1.put("H", "C");
	a1.put("I", "D");
	Map<String, String> a2= new TreeMap<>();
	a2.put("A", "0");
	a2.put("B", "A");
	a2.put("C", "A");
	a2.put("D", "A");
	a2.put("E", "B");
	a2.put("F", "C");
	a2.put("G", "C");
	a2.put("H", "C");
	a2.put("I", "D");
	
			for (Entry<String, String> entry :a1.entrySet()) {
				if (str.equals(entry.getKey())) {
					a2.remove(entry.getKey());
					for (Entry<String, String> entry1 :a1.entrySet()) {
						
						if (entry1.getValue().equals(entry.getKey())) {
							a2.remove(entry1.getKey());
						}
						else {
							
						}
						
					}
				}
				else {
					
				}
			}
	
		String result=new String();
	for (Entry<String, String> entry :a2.entrySet()) {
		result=result+entry.getKey();
	}
	return result;
	
}
}
