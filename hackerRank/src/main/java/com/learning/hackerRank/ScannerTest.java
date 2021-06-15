package com.learning.hackerRank;

import java.util.Calendar;

public class ScannerTest {

	public static void main(String[] args) {
		
		
		byte s = -12;
		long a = 9223372036854775807L;
		Calendar c = Calendar.getInstance();
		c.set(2000, 8, 03);
		System.out.println(c.DAY_OF_MONTH);
		System.out.println(findDay(5, 8, 2015));
	}
	
	   public static String findDay(int month, int day, int year) {
	        Calendar c = Calendar.getInstance();
	        c.set(year,month,day);
	        int day1 = c.DAY_OF_MONTH;
	        System.out.println(day1);
	        if(Calendar.MONDAY== day1){
	            return "MONDAY";
	        }else if(Calendar.TUESDAY == day1){
	            return "TUESDAY";
	        }else if(Calendar.WEDNESDAY == day1){
	            return "WEDNESDAY";
	        }else if(Calendar.THURSDAY == day1){
	            return "THURSDAY";
	        }else if (Calendar.FRIDAY == day1){
	            return "FRIDAY";
	        }else{
	            return "SUNDAY";
	        }
	    }
	}
