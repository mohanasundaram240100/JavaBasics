package StringMethods;

public class reverseAString {

	public static void main(String[] args) {

		String input = "madam";
		String rev = "";
		
		for (int i=input.length()-1;i>=0;i--)
		{
			rev = rev + input.charAt(i);
			
		}
		
		System.out.println(rev);
		
		if(input.equals(rev))
		{
			System.out.println(rev + " " +"String is Palindrome");
		}
		else
		{
			System.out.println("String is not Palindrome");
		}
		
		
		
		
		
		String input1 = "Mohan";
		String rev1 = "";
		
		char a[] = input1.toCharArray();
		
		for(char x : a)
		{
			rev1 = x+rev1;  
		}
		System.out.println(rev1);
		
		
		 
	}

}
