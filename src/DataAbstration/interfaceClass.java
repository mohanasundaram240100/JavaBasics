package DataAbstration;

import DataAbstration.demo;
import DataAbstration.interfaceClass;

interface demo
{
	//These variables are by default static and final
	
	static String name = "Mohan";   
	final static int Age=26;
	
	
	//Abstract methods is having only declaration and no implementation. These methods are by default public and abstract.
	
	
	void test();   //abstract method
	abstract void test1(); //abstract method

	
	default void test2() //Default method is having implementation and it is not abstract. It is introduced in java 8. It can be overridden by the implementing class.
	{
		System.out.println("This is a default method");
	}
	
	static void test3() //Static method is having implementation and it is not abstract. It is introduced in java 8. It cannot be overridden by the implementing class.
	{
		System.out.println("This is a static method");
	}
	
	
}





public class interfaceClass implements demo
{
	@Override
	public void test()
	{
		System.out.println("This is a abstract method");
	}
	
	@Override
	public void test1()
	{
		System.out.println("This is another abstract method");
	}
	
	public static void main (String[] args)
	{
		interfaceClass obj = new interfaceClass();
		obj.test();
		obj.test1();
		obj.test2();
		demo.test3();
	}
}
