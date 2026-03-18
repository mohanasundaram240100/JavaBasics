package basicprograms;


public class reverseString {

	public static void main (String[] args) {

		//Using String Builder or String Buffer method

		String input = "Mohanasundaram";
		StringBuilder reversed =new StringBuilder();
		reversed.append(input);
		reversed.reverse();
		System.out.println(reversed);


		//===================================================


		//Using iteration

		String input1 = "Mohan";
		String reverse = "";

		for (int i=input1.length()-1;i>=0;i--) {
			reverse +=input1.charAt(i);
		}

		System.out.println(reverse);


		//Time complexity of both methods
		// Using StringBuilder or StringBuffer method: O(n)
		// Using iteration method: O(n^2)



	}

}
