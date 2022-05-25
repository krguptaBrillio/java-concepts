package com.brillio.logics;

public class Demo2 {

	public static void main(String[] args) {
		
		int marks=85;
		
			if(marks>=90)
			{
				System.out.println("Grade A");
			}
		
			else if(marks>=80  && marks<90)	
				{
				System.out.println("Grade B");
				}
		
			else if(marks>=60  && marks<80)	
			{
			System.out.println("Grade C");
			}
		
			else if(marks>=45  && marks<60)	
			{
			System.out.println("Grade D");
			}
		
		else 
			{
			System.out.println("Grade F");
			}
		
	}

}
