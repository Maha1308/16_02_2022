package javaClassObject._02_2022;

public class employee_details {

	
		int employeeIds;
		String employee_name;
		double employee_salary;
		String employee_address;
		
		public employee_details() 
		{
		
	   
		employeeIds= 8976;
		employee_name="Veena";
	    employee_salary= 30987.76;
	    employee_address= "pondicherry";
			
		}
	public void getemployee_details()
	{
		System.out.println(employeeIds);
		System.out.println(employee_name);
		System.out.println(employee_salary);
		System.out.println(employee_address);
		
		
		
	}
		
		
		
	
	public static void main(String[] args) {
		  employee_details employee= new employee_details();
		  employee.getemployee_details();
		  

	}

}
