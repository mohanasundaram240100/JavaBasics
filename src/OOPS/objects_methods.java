package OOPS;

public class objects_methods {
	
	//Class contains variables and methods
	//Object is a instance of class
	
	
	//Variables
	
	String name;
	int age;
	String desig;
	
	//Methods
	
	void employee()
	{
		System.out.println(name);
		System.out.println(age);
		System.out.println(desig);
	}
	
	
	public static void main (String[] args) {
		
		objects_methods emp = new objects_methods();
		emp.name="Mohan";
		emp.age=26;
		emp.desig="Software Engineer";
		//System.out.println(emp.age);
		emp.employee();
		
		
		
		
		
	}

}
