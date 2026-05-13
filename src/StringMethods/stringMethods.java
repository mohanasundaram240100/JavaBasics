package StringMethods;

public class stringMethods {
	
	public static void main (String[] args) {
		
		String name ="Mohanasundaram";
		System.out.println(name.contains("Mohana"));
		
		
		System.out.println(name.charAt(0));
		System.out.println(name.charAt(1));
		System.out.println(name.charAt(2));
		System.out.println(name.charAt(3));
		System.out.println(name.charAt(4));
		System.out.println(name.charAt(5));

		
		System.out.println(name.equals("Mohanasundaram"));
		
		System.out.println(name.equals("mohanasundaram"));
		
		System.out.println(name.equalsIgnoreCase("mohanaSundaram"));
		
		
		System.out.println(name.replace("Mohanasundaram", "Mohan"));
	
	
	
	}
	
	

}
