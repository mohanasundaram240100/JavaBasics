package basicprograms;

import java.util.Scanner;

public class reverseAinteger {
	
	public static void main (String[] args) {
		
		
		//Formula for reverse a integers
		
		//reversed=reversed*10
		//reversed=reversed+given%10
		//given=given/10
		
		
		int num=0;
		int reverse=0;
		
		System.out.println("Enter number: ");
		
		Scanner scanner =new Scanner(System.in);
		num=scanner.nextInt();
		
		
		while(num !=0) {
			
			reverse=reverse*10;
			reverse=reverse+num%10;
			num=num/10;
			
			System.out.println(reverse);
			
			
		}
		
		
		
	}

}
