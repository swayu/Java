package JavaPrograms;

import java.util.Scanner;

public class Switch 
{

	public static void main(String[] args) 
	{
		Scanner s1= new Scanner(System.in);
		System.out.print("Enter the case number  : ");
		int a = s1.nextInt();
		switch(a)
		{
			case 1: 
			{
				System.out.println("add");
			}
				
			break;
			case 2: 
				System.out.println("two");
				break;
			case 3: 
				System.out.println("three");
				break;
			case 4: 
				System.out.println("four");
				break;
			default:
				System.out.println("wrong input");
		}
	}

}
