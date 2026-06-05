package basicprograms;

public class findDuplicatesinArray {
	
	public static void main (String[] args) {

		String[] name= {"Mohan", "Kannan", "Sohan", "Mohan", "Mohan"};
		boolean flag=false;
		
		for(int i=0;i<name.length;i++)
		{
			for(int j=i+1;j<name.length;j++)
			{
				if(name[i]==name[j])
				{
					System.out.println("Duplicate element is: "+name[i]);
					flag=true;
				}
			}
		}
		
		if(!flag)
		{
			System.out.println("No duplicate elements found.");
		}
		
		
	}

}
