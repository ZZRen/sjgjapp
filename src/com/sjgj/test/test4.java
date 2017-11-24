package com.sjgj.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class test4 {
	public static void main(String[] args) {
		System.out.println(numberCombin(3,3));
	}
	public static String numberCombin(int n1,int n2){
		String []p2=new String []{"a","b","c"};
		String []p3=new String []{"d","e","f"};
		String []p4=new String []{"g","h","i"};
		String []p5=new String []{"j","k","l"};
		String []p6=new String []{"m","n","o"};
		String []p7=new String []{"p","q","r","s"};
		String []p8=new String []{"t","u","v"};
		String []p9=new String []{"w","x","y","z"};	
		Map<Integer, String []> map=new HashMap<>();
		map.put(2, p2);
		map.put(3, p3);
		map.put(4, p4);
		map.put(5, p5);
		map.put(6, p6);
		map.put(7, p7);
		map.put(8, p8);
		map.put(9, p9);
		
		if ((n1==0||n1==1)||(n2==0||n2==1)) {
			return null;
		}
		else {
			String []arry1=new String []{};
			String []arry2=new String []{};
			if (n1==n2){
				for (Entry<Integer, String[]> entry : map.entrySet()) {
					if (entry.getKey()==n1) {
						arry1=entry.getValue();
						arry2=entry.getValue();
					}
				
				}
			}
			else {

				for (Entry<Integer, String[]> entry : map.entrySet()) {
					if (entry.getKey()==n1) {
						arry1=entry.getValue();
					}
					else if (entry.getKey()==n2) {
						arry2=entry.getValue();
					}
				}
			}
			String result=new String();
			Set<String> set1=new TreeSet<>();
			for (int i = 0; i < arry1.length; i++) {
				for (int j = 0; j < arry2.length; j++) {
					
						set1.add(arry1[i]+arry2[j]);
				}
			}
			int count=0;
			for (String string : set1) {
				if (count==0) {
					result=result+string;
				}
				else {
					result=result+","+string;
				}
				count++;
			}
			return result;
		}			
	}
}
