package com.brillio.loops;

public class Demo2Loops {

	public static void main(String[] args) {
		int[]numbers = {10,20,30,40,50,60,70};

		// print numbers >= 50
	/*	for(int a:numbers ) {
			if(a>=50) {
				System.out.println(a);
			}
		}
	*/	
		// print numbers except 50
		
		for (int b : numbers) {
			if(b!=50) {
				System.out.println(b);	
			}
			
		}
		
		}
}
