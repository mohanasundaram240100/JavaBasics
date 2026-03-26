package basicprograms;

public class Single_DimensionArrays {

	
	public static void main (String[] args) {
	
	//Example 1
	//Using memory allocation
		
	int a[]= new int [10];
	a[0]=10;
	a[1]=20;
	a[2]=30;
	a[3]=40;
	a[4]=50;
	
	
	//Example 2
	//Using normal for loop
	
	int b[]= {10,20,30,40,50};	
	
	for(int i=0;i<b.length;i++)
	{
		System.out.println(b[i]);
	}
		
	
	//Example 3
	//Using for each loop
	
	int m[]= {100,200,300,400,500,1000};
	
	for(int n:m)
	{
		System.out.println(n);
	}
	
	
		
	}
	
}
