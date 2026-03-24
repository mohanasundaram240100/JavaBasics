package basicprograms;

import java.util.Scanner;

public class Control_Statements {
	
	
	public static void main (String[] args) {
		
		//Hardcoding the value of age
		
		//Example 1
		
		int age=18;
		
		if(age>=18)
		{
			
			System.out.println("Eligible for voting");
		}
		else
		{
			
			System.out.println("Not Eligible for voting");
		}
		
		
		//Taking input from user
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age: ");
		
		int input=sc.nextInt();
		
		if(input>=18)
		{
			System.out.println("Eligible for voting");
		}
		else 
		{
			
			System.out.println("Not Eligible for voting");
		}
		
		
		
		//Example 2
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the number: ");
		
		int num=sc1.nextInt();
		
		if(num%2==0)
		{
			System.out.println("The number is even");
		}
		else 
		{
			
			System.out.println("The number is odd");
		}
		
		
		
		//Example 3
		
		Scanner sc2= new Scanner(System.in);
		System.out.println("Enter the No: ");
		
		int num2=sc2.nextInt();
		
		if(num2>0)
		{
			System.out.println("The number is positive");
		} 
		else if(num2<0)
			
		{
			System.out.println("The number is Negative");
		} 
		else
		{
			System.out.println("The number is Zero");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
