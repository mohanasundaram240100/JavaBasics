package OOPS;

public class main_method {
	
	public static void main (String[] args) {
		
		
		dummy_methods dm = new dummy_methods();
		dm.dummy();
		
		dummy_methods dm1 = new dummy_methods();
		String d=dm1.withdata();
		
		dm.withdata();
		System.out.println(dm.withdata());
		
		System.out.println(d);
		
		
		dm.stringData("Mohan", 26);
		
		String name=dm1.withSdata("Mohanasundaram");
		System.out.println(name);
		
		
	}

}
