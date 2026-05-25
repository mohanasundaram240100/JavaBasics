package Inheritance;


class parent
{
	int A=100;
	int B=200;
	
	public void method1()
	{
		System.out.println(A);
		System.out.println(B);
	}
}


class child extends parent
{
	int A=300;
	int B=400;
	
	public void method1()
	{
		System.out.println(A);
		System.out.println(B);
	}
}

public class methodOverriding 
{
	public static void main (String[] args)
	{
		child ch = new child();
		ch.method1();
		
		
		
	}
	
	

}
