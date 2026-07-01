package basicprograms;

public class reverse_String {
	
	public static void main (String [] args) 
	{
		
		
		String input="Mohanasundaram";
		String rev="";
		
		for (int i=input.length()-1;i>=0;i--)
		{
			rev=rev+input.charAt(i);
		}
		
		System.out.println(rev);
		
		
		StringBuilder sb = new StringBuilder();
		sb.append(input);
		sb.reverse();
		System.out.println(sb);
		
		StringBuffer sbf = new StringBuffer(input);
		sbf.reverse();
		System.out.println(sbf);
	}

}
