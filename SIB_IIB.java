
package JavaPrograms;

public class SIB_IIB {

	SIB_IIB()
	{
		System.out.println("I am Constructor");
	}
	static 
	{
		System.out.println("I am SIB");
	}
	
	{
		System.out.println("I am IIB");
	}
	
	public static void main(String[] args) 
	{
		SIB_IIB s1 = new SIB_IIB();
		System.out.println("I am main method");


	}

}
