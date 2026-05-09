package Variables_DataTypes_Operators;

public class Operators {
	
	public static void main (String[] args) {
		
		int a = 182;
		int b = 9071;
		
		//Arithmetic Operators
		
		int result = a+b;
		System.out.println(result);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		//Relational Operators
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a==b);
		System.out.println(a!=b);
		
		
		//Logical Operators
		System.out.println((a>b) && (a<b));
		System.out.println((a>b) || (a<b));
		System.out.println(!(a>b));
		
		
		//Increment and Decrement Operators
		
		int c = 10;
		System.out.println(c++); //Post Increment
		System.out.println(++c); //Pre Increment
		System.out.println(c--); //Post Decrement
		System.out.println(--c); //Pre Decrement
		
		
		
		
	}
	

}
