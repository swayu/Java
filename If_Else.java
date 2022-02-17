
package JavaPrograms;

public class If_Else {

	public static void main(String[] args) 
	{
		int a=5 ,b=3 ,i=0 ,j=0 ;
		if(a == b)
		{
			for(i=0;i<5;i++)
			{
				for(j=0;j<=i;j++)
				{
					System.out.print("* ");
				}
				System.out.println( );
			}
		}
		else if( a!= b)
		{
			for(i=5;i>=0;i--)
			{
				for(j=0;j<=i;j++)
				{
					System.out.print("* ");
				}
				System.out.println();
			}
		}
		else
		{
			System.out.println("Thank you");
		}
			
	}

}


