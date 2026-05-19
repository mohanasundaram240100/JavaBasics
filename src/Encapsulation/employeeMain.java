package Encapsulation;

public class employeeMain {
	
	public static void main (String[] args) {
		
		employee emp = new employee();
		emp.setname("Mohan");
		emp.setage(26);
		
		System.out.println("Employee name is: "+emp.getname());
		System.out.println("Employee age is: "+emp.getage());
		
	}

}
