package com.brillio.employee;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee.companyName="Brillio";//static variable

		//create 2 obj ref for 2 employees
		//create memory; create emp array
		Employee emp1=new Employee();
		Employee emp2=new Employee();
		
		
		emp1.empId= 101;
		emp1.empName= "Sam";
		emp1.empSal= 2000;
		
		emp2.empId= 102;
		emp2.empName= "John";
		emp2.empSal= 3000;
		
	//pass by reference	with static method			
	
/*	Employee.displayEmpDetails(emp1);
	Employee.displayEmpDetails(emp2);
	*/
		
	
		
		//pass by reference	with non-static method		
	
		emp1.displayEmployeeDetails();	
		emp2.displayEmployeeDetails();
	
	
	
	}

}
