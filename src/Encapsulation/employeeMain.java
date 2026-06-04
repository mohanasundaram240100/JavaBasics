package Encapsulation;

public class employeeMain {
	
	public static void main (String[] args) {
		
		employee emp = new employee();
		emp.setName("Mohan");
		emp.setAge(26);
		
		System.out.println("Employee name is: "+emp.getName());
		System.out.println("Employee age is: "+emp.getAge());
		
	}

}
