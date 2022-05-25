package com.brillio.methods;

import com.brillio.area.Area;

public class Demo1 {
	
	
	public static void main(String[] args) {
		
		
		//calling non static method
		
		Area obj = new Area(); //declaration : create object reference for the class
		
		
		
		int radius=10;
		
		int l=3; int b= 5;
		
		int x= 4; int y=7;
		
		String name= "Kritika";
	
		//call non static method
		double result= obj.areaOfCircle(radius);
		
		
		//call the static method from package brillio.area under Area class
		
// static//		double result=Area.areaOfCircle(radius);

		
		int result1=Area.areaOfRectangle(l,b);
		
		double result2=Area.areaOfTriangle(x, y);
		
		String result3= Area.nameOfAurthor();
				
		System.out.println("Area of circle is:" +result);
		
		System.out.println("Area of rect is:" +result1);
		
		System.out.println("Area of triangle is:" +result2);
	
		System.out.println("Author's name: " +result3);
	}

}
