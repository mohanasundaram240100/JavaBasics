package Inheritance;

class A
{
	int a;
	void display()
	{
		System.out.println("This is class A");
	}
}

class B extends A
{
	int b;
	void show()
	{
		System.out.println("This is class B");
	}
}

class C extends B
{
	int c;
	void print()
	{
		System.out.println("This is class C");
	}
}




public class inheritanceDemo {

	public static void main(String[] args) 
	{
		B obj = new B();
		obj.a = 10; // Accessing member of class A
		obj.b = 20; // Accessing member of class B
		obj.display(); // Calling method of class A
		obj.show(); // Calling method of class B
		
		C obj2 = new C();
		obj2.a = 30; // Accessing member of class A
		obj2.b = 40; // Accessing member of class B
		obj2.c = 50; // Accessing member of class C
		obj2.display(); // Calling method of class A
		obj2.show(); // Calling method of class B
		obj2.print(); // Calling method of class C
			
		
		
	}

}
