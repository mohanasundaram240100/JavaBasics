package Conditional_Statements;

import static java.util.Scanner.*;

import java.util.Scanner;

public class ifStatements {
	
	public static void main (String[] args) {
		
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age = sc.nextInt();

		if(age>=18)
		{
			System.out.println("You are eligible to vote");
		}
		else
		{
			System.out.println("You are not eligible to vote");
			
		}
		
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number =sc1.nextInt();
		
		
		if(number%2==0)
		{
			System.out.println("The number is even");
		}
		else
		{
			System.out.println("The number is odd");
			
		}
		
		
		
		
	}

}
