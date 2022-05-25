package com.brillio.datatypes;

public class Demo3 {

	public static void main(String[] args) {
		
		int[] numbers= new int[5]; //5*32 bits 
		
		numbers[0]= 10;
		numbers[1]=20;
		numbers[2]=30;
		numbers[3]=40;
		numbers[4]=50;
		
		System.out.println(numbers); //shows memory allocated
		System.out.println(numbers[0]);//10
	//	System.out.println(numbers[5]);//runtime error ,outBound

		System.out.println("_______________");
		
		//create array for 45.6 , 78.3, 90.5
		double[] num= new double[3]; //3*32 bits 
		
		num[0]= 45.6;
		num[1]=78.3;
		num[2]=90.5;
		
		System.out.println(num);
		System.out.println(num[0]);
		
		System.out.println("_______________");
		
		//create stringArray red, green,yellow
		
		String[]st= {"red", "green", "yellow"};
		System.out.println(st[0]);
		
		
	}

}
