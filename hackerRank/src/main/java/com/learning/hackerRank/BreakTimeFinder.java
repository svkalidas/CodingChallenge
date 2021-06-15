package com.learning.hackerRank;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BreakTimeFinder {
	
	public static void main(String[] args) {
		
		if(null instanceof Object) {
			System.out.println("No error");
		}
		
		BigDecimal a = new BigDecimal(2);
		BigDecimal b = new BigDecimal(6);
		
		BigDecimal d = a.divide(b, 6, RoundingMode.HALF_DOWN);
		String[] x = new String[10];
		int[] y = {1,4,7,8,9,4,7,9};
		Arrays.sort(y);
		
		System.out.println(Arrays.toString(y));
		
		//BigDecimal c = a.divide(b).setScale(6);
		
		
		
		BigDecimal big = new BigDecimal((4-0));
		
		long remider = (4-0)%(3-0);
		
		System.out.println("Remider : "+remider);
		
		
		System.out.println(String.format("12,13", ":"));
		
		
		System.out.println(d);
		
		
		System.out.println(a);
		
		List<List<Integer>> inputs = new ArrayList<>();
		
		Integer[] input_1 = {1, 240, 250};
		Integer[] input_2 = {1, 250, 260};
		Integer[] input_3 = {2, 240, 250};
		Integer[] input_4 = {3, 240, 250};
		Integer[] input_5 = {1, 270, 280};
		Integer[] input_6 = {2, 260, 270};
		Integer[] input_7 = {3, 260, 270};
		Integer[] input_8 = {2, 280, 290};
		Integer[] input_9 = {3, 280, 290};
		
		inputs.add(Arrays.asList(input_1));
		inputs.add(Arrays.asList(input_2));
		inputs.add(Arrays.asList(input_3));
		inputs.add(Arrays.asList(input_4));
		inputs.add(Arrays.asList(input_5));
		inputs.add(Arrays.asList(input_6));
		inputs.add(Arrays.asList(input_7));
		inputs.add(Arrays.asList(input_8));
		inputs.add(Arrays.asList(input_9));
		
		System.out.println(findEmpWithLessBreak(inputs, 3));
		
	}

	
	public static List<List<Integer>> findEmpWithLessBreak(List<List<Integer>> employeeLogs, int k){
		
		List<List<Integer>> result = new ArrayList<>(); 
		
		for(List<Integer> a : employeeLogs) {
		}
		
		if(employeeLogs != null && !employeeLogs.isEmpty()) {
			
			Map<Integer, Integer> empOut = new HashMap<>();
			Map<Integer, Integer> empLog = new HashMap<>();
			
			employeeLogs.forEach(input ->{
				
				if(input.size() > 2) {
					
					if(!empLog.containsKey(input.get(0))) {
						empLog.put(input.get(0), input.get(2));
						empOut.put(input.get(0), 0);
					}else {
						Integer lastLog = empLog.get(input.get(0));
						empLog.put(input.get(0), input.get(2));
						if(input.get(1) > lastLog) {
							int breaks = empOut.get(input.get(0)) + 1;
							if(breaks < k) {
								empOut.put(input.get(0), breaks);
							}else {
								empOut.remove(input.get(0));
							}
						}
					}
					
				}
			});
			
			if(!empOut.isEmpty()) {
				empOut.forEach((key, value) ->{
					List<Integer> selectedEmp = new ArrayList<>();
					selectedEmp.add(key);
					selectedEmp.add(value);
					result.add(selectedEmp);
				});
			}
		}
		
		return result;
	}
}
