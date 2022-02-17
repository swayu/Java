package JavaPrograms;

import java.util.Scanner;

public class arrayP1 
{

	public static void main(String[] args) 
	{
		
		int n;
		Scanner s1 = new Scanner(System.in);
		//n = s1.nextInt();
		
		int mobile[] = new int[5];

		for (int i=0;i<mobile.length;i++) 
		{
			
			System.out.print(" Enter the Mobile no : ");
			mobile[i]=s1.nextInt();
			
		}
		for (int i=0;i<mobile.length;i++) 
		{
			System.out.println("mobile no : " +mobile[i]);
		}
	}
}
