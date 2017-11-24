package com.sjgj.test;

import java.util.ArrayList;
import java.util.List;

public class test5 {
public static void main(String[] args) {
		
		String[] parms = new String[] {"select * from table", "select * from table limit 1000", "select * from (select * from table limit 10000) sub_qry","select * from (select * from (select * from table limit 10000) limit n )"};
		String[] refTest = refTest(parms);
		for (int i = 0; i < refTest.length; i++) {
			System.out.println(refTest[i]);
		}
		
	}
	public static String [] refTest(String[] cas){
		
		List<String> a=new ArrayList<>();
		for (String string : cas) {
			if (!string.contains("limit")) {
				a.add("yes");
			}
			else {
				String[] split = string.split("limit");
				if ((split[(split.length)-1]).contains(")")) {
					a.add("yes");
				}
				else {
					a.add("no");
				}
			}
		}
		String[] result = (String[])a.toArray(new String[a.size()]);
		return result;
	}
	}

