package Polymorphism;

public class ConstructorOverloading {
	
	int x=10, y=20;
	
	ConstructorOverloading()
	{
		System.out.println(x+y);
		
	}
	
	ConstructorOverloading(int x, int y)
	{
		System.out.println(x+y);
		
	}
	
	ConstructorOverloading(int x, double y)
	{
		System.out.println(x+y);
		
	}


}
