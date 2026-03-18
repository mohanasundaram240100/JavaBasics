package basicprograms;

import java.util.Scanner;

public class swapping {
	
	public static void main(String[] args) {

		
	//Using third variable	
		
	int myval = 15;
	int otherval = 25;
	
	System.out.println("Before swapping: " + myval + " " + otherval);
	
	int temp;
	temp=myval;
	myval=otherval;
	otherval=temp;
		
	System.out.println("After swapping: " + myval + " "+ otherval);
	

	//===================================================================	
	
	
	//Without using third variable
	
	int first=15;
	int second=30;
	
	System.out.println("Before swapping: " + first + " " + second);
	
	first=first-second;
	second=first+second;
	first=second-first;
	
	System.out.println("After swapping: " + first + " " + second);
	
	//using user input from system
	
	System.out.println("Enter first num: " + "Enter second number: ");
	Scanner scanner =new Scanner(System.in);
	first = scanner.nextInt();
	
	}
}
