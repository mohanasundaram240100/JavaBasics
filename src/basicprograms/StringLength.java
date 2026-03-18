package basicprograms;

public class StringLength {
	
	public static void main (String[] args) {
		
		
		//Using length() method
		
		String input="Mohanasundaram";
		System.out.println(input.length());
		
		
		//Without using length() method
		
		String input1="Welcome";				//input value
		char[] array =input1.toCharArray(); 	//converting the string value into char array
		
		int length=0; 		//assign the initial length 0
		
		for (char c:array) {      //storing the array values in c 
			length++; 			//incrementing length by 1
		}
		System.out.println(length); //Printing the length
		
	}

}
