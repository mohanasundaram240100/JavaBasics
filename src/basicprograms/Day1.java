package basicprograms;


public class Day1 {
	
	public static void main (String[] args) {
		
		String Name="Mohanasundaram";
		int Age=26;
		char initial='P';
		double deci=77.7;
		
		System.out.println(Name);
		
		int num1=1, num2=2;
		
		boolean isRaining=true;
		
		if(isRaining) 
		{
			System.out.println("Bring an umbrella");
			
		} else {
			
			System.out.println("Nothing");
		}
		
		String[] carsName= {"Benz", "Volvo", "Audi"};
		for(int i=0;i<carsName.length;i++) {
			System.out.println(carsName[i]);
			
		}
		
		
	}
	
	public class temp1{
		
		static void method1() {
		System.out.println("mytempmetod");	
			
		}
		
		public static void main(String[] args) {
			
			method1();
		}
	}
	
	
	public class temp2{
		
		static void dummymethod(String names) {
			
			System.out.println(names + "klhs");
			
		}
		
		public static void main (String[] args) {
			
			dummymethod("Test1");
		}
	}
	
	public class returns{
		
		public static int mynums(int a) {
			return a+2;
			
		}
		
		
		public static void main(String[] args) {
			
			System.out.println(mynums(1));
		}
	}	

}
