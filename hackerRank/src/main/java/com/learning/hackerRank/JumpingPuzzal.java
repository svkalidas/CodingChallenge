package com.learning.hackerRank;

import java.util.ArrayList;
import java.util.List;

public class JumpingPuzzal {

	public static void main(String[] args) {
		
		//28
		String input1 = "0 0 1 0 0 0 0 1 0 0 0 0 1 0 0 0 0 0 1 0 1 0 0 0 1 0 0 1 0 0 0 1 0 1 0 0 0 0 0 0 0 0 1 0 0 1 0 1 0 0";
		//53
		String input2 = "0 1 0 0 0 0 0 1 0 1 0 0 0 1 0 0 1 0 1 0 0 0 0 1 0 0 1 0 0 1 0 1 0 1 0 1 0 0 0 1 0 1 0 0 0 1 0 1 0 1 0 0 0 1 0 1 0 0 0 1 0 1 0 0 0 1 0 0 1 0 1 0 1 0 1 0 1 0 1 0 1 0 0 1 0 1 0 1 0 1 0 0 0 0 0 0 1 0 0 0";
		String[] split = input2.split(" ");
		System.out.println(jumpingOnClouds(split));
	}
	static int jumpingOnClouds(String[] c) {

        int step = 0;
        int jump = 0;
        int length  = c.length - 1;
        List<String> counted = new ArrayList<String>();
        for(int i = 0; i<= length; i++){
            step++;
            if( "0".equals(c[i])){
                counted.add(c[i]);
            }
            if("0".equals(c[i]) && step>2){
                jump++;
                step = 0;
                counted.clear();
            }else if("1".equals(c[i]) &&  i != length ){
                if(counted.size() <=1){
                    jump++;
                }else{
                    jump= jump+2;
                }
                step = 0;
                
            }else if ( i == length && !"1".equals(c[i-1]) && "0".equals(c[i])){
                jump++;
            }
        }
        return jump;
    }
}
