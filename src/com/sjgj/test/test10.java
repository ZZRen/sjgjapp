package com.sjgj.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class test10 {
	public static void main(String[] args) {

		String [] str=new String[]{"100","-1.0023e13","abcd","20170101","20170101 04:00:00","ture","False","0.23%","1.0023e13%","a%"};
		System.out.println(Test(str));
	}
	
	public static String Test(String []str){
		List<String> a=new ArrayList<>();
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyyMMdd HH:mm:ss");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyyMMdd");
		
		for (String string : str) {
			if ("ture".equals(string)||"False".equals(string)) {
				a.add("Boolean");	
			}
			else if (checkdate(string,sdf1)||checkdate(string,sdf2)) {
				a.add("Date");
			}
			else {
				if (string.contains("%")&&(string.indexOf('%')==string.length()-1)) {
					String substring = string.substring(0,string.indexOf('%'));
					if (checknumber(substring)) {
						a.add("Number");
					}
					else {
						a.add("String");
					}
				}
				else {
					if (checknumber(string)) {
						a.add("Number");
					}
					else {
						a.add("String");
					}
				}
			}
		}
		int count=0;
		String result=new String();
		for (String string : a) {
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
	
	public static Boolean checkdate(String a,SimpleDateFormat sdf1){
		
		Boolean flage=true;
		try {
			sdf1.parse(a);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			flage=false;
//			e.printStackTrace();
			
		}

		return flage;
	}
	
	public static Boolean checknumber(String a){
		
		
		Boolean flage=true;
		try {
			Double.parseDouble(a);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			flage=false;
		}
		return flage;
	}
	
	
	
}
