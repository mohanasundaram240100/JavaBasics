package basicprograms;

import java.util.Scanner;

public class SystemInput {

	public static void main(String[] args) {
		
		
		//Using Integer value as input from the user
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		
		int num = sc.nextInt();
		
		System.out.println("You entered: " + num);
		
		
			
		//Using String value as input from the user
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		
		String name = scanner.next();
		
		System.out.println("You entered: " + name);

	}

}
