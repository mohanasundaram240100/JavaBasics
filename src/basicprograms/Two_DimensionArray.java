package basicprograms;

public class Two_DimensionArray {

	public static void main (String[] args) {
		
		//Example 1
		//Using memory allocation
		
		int a[][]= new int[2][3];
		a[0][0]=100;
		a[0][1]=300;
		a[0][2]=200;
		a[1][0]=400;
		a[1][1]=500;
		a[1][2]=600;
			
		System.out.println(a[0][2]);
		
		//Example 2
		//Using normal for loop
		
		String b[][]= {{"ABCD","EFGH"},
					  {"IJKL","MNOP"},
					  {"QRST","UVWX"}};
		
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<=1;j++)
			 {
				System.out.println(b[i][j]);
			}
			
			System.out.println();
			
		}
		
		
		
		
		//Example 3
		
		int	 d[][]=   {{10,20,30},
					  {40,50,60},
					  {70,80,90}};
		
		//Using Normal for loop
		
		/*
		for (int r=0;r<=d.length-1;r++)
		{
			for(int c=0;c<=d[r].length-1;c++)
			{
				System.out.println(d[r][c]);
				
			}
			
			System.out.println();
		}
		*/
		
		//Using for each loop
		
		for(int num[] :d)
		{
			
			for(int x :num)
			{
				System.out.println(x);
			}
			
			
			System.out.println();
		}
		
		
		
		
		
		
	}
	
	
}
