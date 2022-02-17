package JavaPrograms;

import java.util.Collections;
import java.util.Vector;

public class Vector_class 
{

	public static void main(String[] args) 
	{
		Vector a = new Vector();
		a.add(99);
		a.add("Vector");	
		a.add(12.21f);	
		a.add('A');	
		a.add(76);	
		a.add(999999);	
		a.add(0);	
		a.add(null);
		System.out.println("a : "+a);
		//Collections.sort(a);
		//System.out.println(a);
		a.add("Java");
		a.add("Programming");
		System.out.println(a);
		a.add(76);
		a.add("Vector");	
		a.add(99);
		System.out.println(a);
		a.addAll(a);
		System.out.println(a);
	}

}
