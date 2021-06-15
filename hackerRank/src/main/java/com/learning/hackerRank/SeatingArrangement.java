package com.learning.hackerRank;

import java.math.BigDecimal;
import java.util.Scanner;

public class SeatingArrangement {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int testCases = scan.nextInt();
		
		int[] seatNumbers = new int[testCases];
		
		for(int i = 0; i<testCases;i++ ) {
			seatNumbers[i] = scan.nextInt();
		}
		
		for(int seatNo : seatNumbers) {
			
			int limit = seatNo % 12 != 0 ? (seatNo + (12 - (seatNo%12))) : seatNo;
			
			String seatType = (((seatNo-2)/3d)+1)%1 == 0 ?" MS" : (((seatNo-1)/6d)+1)%1 == 0 || (((seatNo-6)/6d)+1)%1 == 0 ?" WS":" AS";
			 
			System.out.println(( limit - seatNo + (limit - 12)  + 1 )+ seatType );
		}
		
	}
	
	
}
