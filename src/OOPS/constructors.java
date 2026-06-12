package OOPS;

public class constructors 
{
	//Class variables
	
	int id;
	String name;
	int age;
	
	//Using local variables
	constructors(int id, String name, int age)
	{
		this.id=id;
		this.name=name;
		this.age=age;
	}
	
	void print()
	{
		System.out.println(id + " " + name + " " + age);
	}

}
