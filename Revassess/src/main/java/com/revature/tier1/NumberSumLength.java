package com.revature.tier1;

public class NumberSumLength {

	public static boolean checkNumberPowerLength(long num) {
		for(int i = 2; i <= Math.sqrt(i); i++) {
			int j = 2;
			double val = Math.pow(i, j);
			
			while(val <= num) {
				if (val == num) {
					return true;
				}	
				j++;
				val = Math.pow(i, j);
			}
		}
		
		return false;
	}
}
