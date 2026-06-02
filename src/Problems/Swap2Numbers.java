package Problems;

public class Swap2Numbers {

	public static void main(String[] args) {

		//Using 3rd variable
		
		int a=10;
		int b=20;
		
		System.out.println("Before Swapping: " + (a + " " + b));
		
		int c = a;  // Store a's value in c
		
		a = b;      // Assign b's value to a
		b = c;      // Assign c's value (original a) to b
		
		System.out.println("After Swapping: " + (a + " " + b));
		
		
		
		//Without using 3rd variable
		
		 a=20;
		 b=30;
		a = a + b;  // a now contains the sum of a and b
		b = a - b;  // b now contains the original value of a
		a = a - b;  // a now contains the original value of b

		System.out.println("After Swapping: " + (a + " " + b));

	}

}