package basicprograms;

public class Operators {
	
	public static void main (String[] args ) {
		
		
		int a=200;
		float c=30.5f;
		System.out.println(a+c);
	
		// Arithmetic Operators
		System.out.println(a+c);
		System.out.println(a-c);
		System.out.println(a*c);
		System.out.println(a/c);
		
		//Relational Operators
		System.out.println(a>c);
		System.out.println(a<c);
		System.out.println(a==c);
		System.out.println(a!=c);
		
		System.out.println(a>=c);
		System.out.println(a<=c);
		
		
		//Logical Operators
		int x=10;
		int y=20;
		System.out.println(x>y && x<y);
		System.out.println(x>y || x<y);
		System.out.println(!(x>y));
		
		
		//Increment and Decrement Operators
		int i=10;
		System.out.println(i++); //post increment
		System.out.println(i);
		System.out.println(++i); //pre increment
		System.out.println(i);
		
		
		int j=20;
		System.out.println(j--); //post decrement
		System.out.println(j);
		System.out.println(--j); //pre decrement
		System.out.println(j);
		
		
		
		
		
	}

}
