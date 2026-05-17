package OOPS;

public class constructors 
{
	int id;
	String name;
	int age;
	
	constructors(int id1, String name1, int age1)
	{
		id=id1;
		name=name1;
		age=age1;
	}
	
	void print()
	{
		System.out.println(id + " " + name + " " + age);
	}

}
