



package JavaPrograms;

import java.util.Scanner;

public class Scanner_input 
{

	public static void main(String[] args)
	{
		Scanner s1 = new Scanner(System.in);
		float a , b , c;
		int i, j,k;
		byte g,p,x;
		short h,q,r;
		double n,t,u;
		boolean m;
		
		
		char l = 'a';
		String s;
		
		System.out.print("Enter the value of a : ");
		a = s1.nextFloat();
		System.out.print("Enter the value of b : ");
		b = s1.nextFloat();
		c = a + b;
		System.out.print("Output is  : " + c);
		System.out.print("\nEnter your Name : ");
		s = s1.next();
		System.out.println("Hello " + s);
		l = s1.next().charAt(0);
		System.out.println(l);
		System.out.print("Enter the value of i : ");
		i = s1.nextInt();
		System.out.print("Enter the value of j : ");
		j = s1.nextInt();
		k = i*j;
		System.out.print("Output is  : " + k);
		
		System.out.print("Enter the value of g : ");
		g=s1.nextByte();
		System.out.print("Enter the value of p : ");
		p=s1.nextByte();
		x=(byte) (g+p);
		
		System.out.print("output is : "+x);
		
		
		System.out.print("Enter the value of h : ");
		h=s1.nextShort();
		System.out.print("Enter the value of q : ");
		q=s1.nextShort();
		r=(short) (h+q);
		
		System.out.print("output is : "+r);
		
		System.out.print("Enter the value of n : ");
		n=s1.nextDouble();
		System.out.print("Enter the value of t : ");
		t=s1.nextDouble();
		u=n+t;
		
		System.out.print("output is : "+u);
		
		s1.close();
	}

}
