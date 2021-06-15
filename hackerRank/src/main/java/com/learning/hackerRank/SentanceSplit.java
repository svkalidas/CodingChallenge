package com.learning.hackerRank;

import java.util.Scanner;

public class SentanceSplit {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String input = scan.nextLine();

		if (input != null && !input.isEmpty()) {

			String[] splits = input.split(" ");

			String result = "";
			boolean flag = false;

			for (String word : splits) {
				

				if (word.contains("\"")) {
					if(word.indexOf("\"") == 0 && word.lastIndexOf("\"") != 0) {
						System.out.println(word);
						continue;
					}else {
						if (flag) {
							result = result+" "+word;
							System.out.println(result);
						}
						flag = flag ? false : true;
					}
				}

				if (flag) {
					result = result.isEmpty()?result+word : result + " "+word;
				} else {
					if(result.isEmpty()) {
						System.out.println(word);
					}else {
						result = "";
					}
				}
			}
			if(!result.isEmpty()) {
				System.out.println(result);
			}
			
		}
	}
}
