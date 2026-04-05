package basicprograms;

public class StringMethods {

	public static void main(String[] args) {

		// String Methods
		
		String Name = "Mohanasundaram";
		
		String Name1 = new String("Mohanasundaram");
		
		System.out.println(Name1);
		
		//Length methods
		
		String Name2 = "ksljahkgah";
		int length = Name2.length();
		System.out.println(length);
		
		String Name3 = "ksljadsafkjhhkgah";
		System.out.println(Name3.length());
		
		
		
		//Concatenation methods
		
		String Name4 = "qwreteuytuyiouewrpyiw";
		String Name5 = "Dummy String";
		
		System.out.println(Name4 + Name5);
		
		System.out.println(Name4.concat(Name5));
		
		
		//Trim methods
		
		String dum = "  fsdkjhsdf  ";
		System.out.println(dum);
		
		String trimed = dum.trim();
		System.out.println(trimed);
		
		
		//charAt() methods (returns the character based on index)
		
		String characters = "dsfladfslalsjfgijg";
		System.out.println(characters.charAt(1));
		
		
		
		//contains() methods  (returns true if the string contains the specified sequence of char values)
		
		String str1 = "This is a dummy string";
		String str2 = "This";
		
		System.out.println(str1.contains(str2));
		
		
		//equals() and equalsIgnoreCase() methods (compares the string with the specified object and returns true if they are equal)
		
		
		String str5 = "Welcome";
		String str6 = "Welcome";
		
		System.out.println(str5==str6);
		System.out.println(str5.equals(str6));
		
		System.out.println(str5.equalsIgnoreCase("WelcomE"));  //It ignores the case sensitivity of the string and returns true if they are equal
		
		
		//replace() methods (replaces each substring of this string that matches the literal target sequence with the specified literal replacement sequence)
		
		String drums = "lkahsflkjahsl;fkhsa;gjl;sagoiwueotw";
		
		String replaced = drums.replace('l', 'Y');
		System.out.println(replaced);
		
		System.out.println(drums.replaceAll("a", "Mohan"));
		
		
		//substring() methods (extract the substring from the main string)
		
		
		String sub = "This is a dummy string";
		String substring = sub.substring(0,9);
		
		System.out.println(substring);
		
		
		//toUpperCase() and toLowerCase() methods (converts all the characters in the string to upper case or lower case)
		
		String upper = "dsgblkdhshds";
		System.out.println(upper.toUpperCase());
		
		String lower = "DSGBLKDHSIHDS";
		System.out.println(lower.toLowerCase());
		
		
		
		
		
		
	}

}
