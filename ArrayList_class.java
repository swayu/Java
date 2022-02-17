package JavaPrograms;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_class
{

	public static void main(String[] args) 
	{
		ArrayList a = new ArrayList();
		ArrayList b = new ArrayList();
		ArrayList c = new ArrayList();
		a.add(1);
		a.add(33);
		a.add(33);
		a.add(33);
		a.add('c');
		a.add(1,11);
		a.add(null);
		//Collections.sort(a);//exceptions 
		System.out.println(a);
		System.out.println(a.get(1));
		System.out.println(a.size());
		a.add(3,9);
		a.add(2, "Swa");//adding at particular index
		System.out.println(a);
		a.addAll(a);//addind all arrays again
		System.out.println(a);
		b.addAll(a);

		System.out.println("b : "+ b);
		a.clear();
		System.out.println("a" +a);
		boolean ans = b.contains("Swa");
		System.out.println(ans);
		//a.clone(c);//clone
		System.out.println();
		System.out.println(a.isEmpty());// check its empty or not
		System.out.println(b.lastIndexOf("Swa"));//last index of 
		System.out.println(b.remove("Swa"));//removing object from first occurrence  
		System.out.println(b);
		System.out.println(b.indexOf("Tvisha"));//if object its not present then it return -1
		System.out.println(b.indexOf("Swa"));
		System.out.println(b.remove(10));//remove from specific index
		System.out.println(b);
		
		
		
	}

}
