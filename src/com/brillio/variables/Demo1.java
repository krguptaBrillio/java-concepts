package com.brillio.variables;

public class Demo1 {
	
	public static int aS =10; //static variable; class variable
	
	public int aNS = 20; //non static variable; instant variable
	public int bNS = 30;
	

	public static void main(String[] args) {
		
		
		Demo1.aS=100; //static memory is constant, value can be changed
		
		System.out.println(Demo1.aS);
		
		
		//for non static variables
		
		Demo1 obj1= new Demo1();  //create object reference of class
		obj1.bNS=70;//can assign any value
		System.out.println(obj1.aNS);
		System.out.println(obj1.bNS);
		
		
		Demo1 obj2= new Demo1();
		//with obj reference we can give diff value to same declared variable
		obj2.bNS=300;  //can assign any value
		System.out.println(obj2.aNS);
		System.out.println(obj2.bNS);
		
		
		

	}

}
