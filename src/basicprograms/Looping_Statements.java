package basicprograms;

public class Looping_Statements {

	public static void main(String[] args) {

		//While loop example  (Printing integers and Strings)
		
		int i=1;    	//Initialization
		
		while(i<=15)    //Condition
		{
			System.out.println(i);
			i++;        //Increment/Decrement 
			
		}
		
		
		//Example 2
		
		int j =1;		
		
		while(j<=10)
		{
			System.out.println("hello");
			j++;
			
		}
		
		
		//Example 2   Printing even numbers from 1 to 10
		
		int k=1;
		
		while(k<=10)
		{
			if(k%2==0)
			{
			System.out.println(k);
			}
			
			k++;
			
		}
		
		
		
		//Do while loop example
		
		int m=1;
		
		do 
		{ 
			System.out.println(m);
			m++;
			
		}while(m<=18);
		
		
		
		//Example 2
		
		int n=25;
		
		do
		{
			
			System.out.println(n);
			n--;
		}while(n>=0);
		
		
		
	}

}
