package JavaProblems;

public class ReverseString {
	
	public static void main (String[] args) 
	{
		String input = "Mohanaundaram";
		String rev="";
		
		for(int i=input.length()-1;i>=0;i--)
		{
			rev = rev+input.charAt(i);
		}
		System.out.println("Reversed string is: " + rev);

	}
}
