package com.sjgj.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class test2 {
public static void main(String[] args) {
	String[] parms = new String[] {"20170101 00:02:01", "20170101 05:04:02", "20170101 10:06:03","20170101 15:08:04"};
	
	try {
		String countPeriod = countPeriod(parms);
		System.out.println(countPeriod);
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public static String countPeriod(String[] parms) throws ParseException{
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd HH:mm:ss");
	Date parse1 = sdf.parse(parms[0]);
	Date parse2 = sdf.parse(parms[1]);
//	Date date= new Date();
	long time1 = parse1.getTime();
	long time2 = parse2.getTime();
//	System.out.println(sdf.format(date));
	String period=new String();
	Long time=(time2-time1)/1000;
	System.out.println(time);

	
		Long year=time/31536000;
		Long month=(time%31536000)/2592000;
		Long day=((time%31536000)%2592000)/86400;
		Long hour=(((time%31536000)%2592000)%86400)/3600;
		Long minute=((((time%31536000)%2592000)%86400)%3600)/60;
		Long second=((((time%31536000)%2592000)%86400)%3600)%60;
		if (year!=0) {
			period=period+year+"year";
			if (month!=0) {
				period=period+month+"month";
				if (day!=0) {
					period=period+day+"day";
					if (hour!=0) {
						period=period+hour+"hour";
						if (minute!=0) {
							period=period+minute+"minute";
							if (second!=0) {
								period=period+second+"second";	
								}
								else {
									
								}
						}
						else {
							if (second!=0) {
								period=period+second+"second";	
								}
								else {
									
								}
						}
							
					}
					else {
						if (minute!=0) {
							period=period+minute+"minute";
							if (second!=0) {
								period=period+second+"second";	
								}
								else {
									
								}
						}
						else {
							if (second!=0) {
								period=period+second+"second";	
								}
								else {
									
								}
						}
						
					}
				}
				else {
					if (hour!=0) {
						period=period+hour+"hour";
						if (minute!=0) {
							period=period+minute+"minute";
							if (second!=0) {
								period=period+second+"second";	
								}
								else {
									
								}
						}
						else {
							if (second!=0) {
								period=period+second+"second";	
								}
								else {
									
								}
						}
							
					}
					else {
						if (minute!=0) {
							period=period+minute+"minute";
							if (second!=0) {
								period=period+second+"second";	
								}
								else {
									
								}
						}
						else {
							if (second!=0) {
								period=period+second+"second";	
								}
								else {
									
								}
						}
						
					}
				}
			}
			else {
				if (day!=0) {
					period=period+day+"day";
					if (hour!=0) {
						period=period+hour+"hour";
						if (minute!=0) {
							period=period+minute+"minute";
							if (second!=0) {
								period=period+second+"second";	
								}
								else {
									
								}
						}
						else {
							if (second!=0) {
								period=period+second+"second";	
								}
								else {
									
								}
						}
							
					}
					else {
						if (minute!=0) {
							period=period+minute+"minute";
							if (second!=0) {
								period=period+second+"second";	
								}
								else {
									
								}
						}
						else {
							if (second!=0) {
								period=period+second+"second";	
								}
								else {
									
								}
						}
						
					}
				}
				else {
					if (hour!=0) {
						period=period+hour+"hour";
						if (minute!=0) {
							period=period+minute+"minute";
							if (second!=0) {
								period=period+second+"second";	
								}
								else {
									
								}
						}
						else {
							if (second!=0) {
								period=period+second+"second";	
								}
								else {
									
								}
						}
							
					}
					else {
						if (minute!=0) {
							period=period+minute+"minute";
							if (second!=0) {
								period=period+second+"second";	
								}
								else {
									
								}
						}
						else {
							if (second!=0) {
								period=period+second+"second";	
								}
								else {
									
								}
						}
						
					}
				}
			}
		}
		else {
			if (month!=0) {
				period=period+month+"month";
				if (day!=0) {
					period=period+day+"day";
					if (hour!=0) {
						period=period+hour+"hour";
						if (minute!=0) {
							period=period+minute+"minute";
							if (second!=0) {
								period=period+second+"second";	
								}
								else {
									
								}
						}
						else {
							if (second!=0) {
								period=period+second+"second";	
								}
								else {
									
								}
						}
							
					}
					else {
						if (minute!=0) {
							period=period+minute+"minute";
							if (second!=0) {
								period=period+second+"second";	
								}
								else {
									
								}
						}
						else {
							if (second!=0) {
								period=period+second+"second";	
								}
								else {
									
								}
						}
						
					}
				}
				else {
					if (hour!=0) {
						period=period+hour+"hour";
						if (minute!=0) {
							period=period+minute+"minute";
							if (second!=0) {
								period=period+second+"second";	
								}
								else {
									
								}
						}
						else {
							if (second!=0) {
								period=period+second+"second";	
								}
								else {
									
								}
						}
							
					}
					else {
						if (minute!=0) {
							period=period+minute+"minute";
							if (second!=0) {
								period=period+second+"second";	
								}
								else {
									
								}
						}
						else {
							if (second!=0) {
								period=period+second+"second";	
								}
								else {
									
								}
						}
						
					}
				}
			}
			else {
				if (day!=0) {
					period=period+day+"day";
					if (hour!=0) {
						period=period+hour+"hour";
						if (minute!=0) {
							period=period+minute+"minute";
							if (second!=0) {
								period=period+second+"second";	
								}
								else {
									
								}
						}
						else {
							if (second!=0) {
								period=period+second+"second";	
								}
								else {
									
								}
						}
							
					}
					else {
						if (minute!=0) {
							period=period+minute+"minute";
							if (second!=0) {
								period=period+second+"second";	
								}
								else {
									
								}
						}
						else {
							if (second!=0) {
								period=period+second+"second";	
								}
								else {
									
								}
						}
						
					}
				}
				else {
					if (hour!=0) {
						period=period+hour+"hour";
						if (minute!=0) {
							period=period+minute+"minute";
							if (second!=0) {
								period=period+second+"second";	
								}
								else {
									
								}
						}
						else {
							if (second!=0) {
								period=period+second+"second";	
								}
								else {
									
								}
						}
							
					}
					else {
						if (minute!=0) {
							period=period+minute+"minute";
							if (second!=0) {
								period=period+second+"second";	
								}
								else {
									
								}
						}
						else {
							if (second!=0) {
								period=period+second+"second";	
								}
								else {
									
								}
						}
						
					}
				}
			}
		}
		
	return period;
	
}

}
