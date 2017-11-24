package com.sjgj.test;

import java.util.ArrayList;
import java.util.List;

public class test6 {
public static void main(String[] args) {
	
	String[] parms = new String[] {"A", "B", "C","D","E","F","G","H"};
	int [] weight=new int[]{7,5,3,2,6,1,4,9};
	int N=1;
	System.out.println(topNsort(parms, weight, N));
	
}
public static String topNsort(String[]s,int[] weight,int N){
	List<Integer> a2=new ArrayList<>();
	  String result=new String();
	for (int i = 0; i < s.length; i++) {
		a2.add((weight[i]+i+1));
	}
	Integer[] a3 = a2.toArray(new Integer[a2.size()]);
	 if (N>s.length) {
		 String temp;
		 int aa;
	        for(int i=0;i<a3.length-1;i++){
	            for(int j=0;j<a3.length-i-1;j++){
	                if(a3[j+1]<a3[j]){
	                    temp = s[j];
	                    s[j]=s[j+1];
	                    s[j+1]=temp;
	                    aa=a3[j];
	                    a3[j]=a3[j+1];
	                    a3[j+1]=aa;
	                }
	              
	            }
	        }
	      
	        for (int i = 0; i < s.length; i++) {
	        	result=result+s[i];
			}
	}
	 else {
		 String temp;
		 int aa;
	        for(int i=0;i<a3.length-1;i++){
	            for(int j=0;j<a3.length-i-1;j++){
	                if(a3[j+1]<a3[j]){
	                    temp = s[j];
	                    s[j]=s[j+1];
	                    s[j+1]=temp;
	                    aa=a3[j];
	                    a3[j]=a3[j+1];
	                    a3[j+1]=aa;
	                }
	              
	            }
	        }
	      
	        for (int i = 0; i<N; i++) {
	        	result=result+s[i];
			}
	}
    
	return result;
}
}
