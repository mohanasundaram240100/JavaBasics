package basicprograms;

public class Stringoccurence {
	
	
	public static void main (String[] args) {
		
		String input = "Swiss"; //input value
		char toFind = 'S'; //need to find the character
		int present = 0;   //initial value 0
		
		input.toLowerCase();  //converting the case sensitive values to lowercase values
		
		for(int i=0;i<input.length();i++) {
			
			if(input.charAt(i)==toFind);  
			present=present++;
						
		}
		
		System.out.println(present);
		
	}

}
