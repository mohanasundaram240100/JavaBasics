package Data_Abstration;


interface demo
{
	//These variables are by default static and final
	
	String name = "Mohan";   
	int Age=26;
	
	
	//Abstract methods is having only declaration and no implementation. These methods are by default public and abstract.
	
	void test();   //abstract method
	
	
	default void test1() //Default method is having implementation and it is not abstract. It is introduced in java 8. It can be overridden by the implementing class.
	{
		System.out.println("This is a default method");
	}
	
	static void test2() //Static method is having implementation and it is not abstract. It is introduced in java 8. It cannot be overridden by the implementing class.
	{
		System.out.println("This is a static method");
	}
	
	
}





public class interfaceClass implements demo
{
	public static void main (String[] args)
	{
		void test()   //This is the implementation of the abstract method of the interface.
		{
			System.out.println("This is a test method");
			System.out.println(name);
			System.out.println(Age);
		}
		
		void test1()   //This is the overriding of the default method of the interface.
		{
			System.out.println("This is an overridden default method");
		}
		
		void test2()   //This is the overriding of the static method of the interface. It is not possible to override a static method, so this will be treated as a new method in the implementing class.
		{
			System.out.println("This is an overridden static method");
		}
		
	}
	

}
