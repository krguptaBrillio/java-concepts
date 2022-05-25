package com.brillio.employee;

public class Employee {
	
	public int empId;
	public String empName;
	public double empSal;
	public static String companyName; //static if value is same
	

	//static method creation
	
	public static void displayEmpDetails(Employee e) {
		
		System.out.println(e.empId);
		System.out.println(e.empName);
		System.out.println(e.empSal);
		System.out.println(Employee.companyName); //static
		System.out.println("____________________");
	}
	
	
	//non static method
	
     public void displayEmployeeDetails() {
		
		System.out.println(empId);
		System.out.println(empName);
		System.out.println(empSal);
		System.out.println(Employee.companyName); //static
		System.out.println("____________________");
	}
	
	
	
	
}
