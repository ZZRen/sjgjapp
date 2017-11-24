package com.sjgj.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class test1 {
	public static void main(String[] args) {
		
		String[] parms = new String[] {"a", "b", "a","a","b","c"};
//		String[] parms1 = new String[]{};
		System.out.println(getAlias(parms));
		
	}
	public static String getAlias(String[] parms){
		String back=new String();
		List<String> list =new ArrayList<>();
			Map<String,Integer> map =new HashMap<>();
			for (String string : parms) {
				
				if (list.contains(string)) {
					map.put(string,map.get(string)+1);
					list.add(string+map.get(string));
				}
				else {
					list.add(string);
					map.put(string,0);
				}
		}
		for (int i = 0; i < list.size(); i++) {
			if (i==0) {
				back=back+list.get(i);
			}
			else{
				back=back+","+list.get(i);
			}
		}
		
		return back;
		
	}
}
