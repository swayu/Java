package JavaPrograms;

public class Methods_Static {

	private static void methodtype()//private access specifier , static modifier, void return type,non parameterise
	{
		System.out.println("This is example of static method");
	}
	static void addition()//package(default)access specifier , static modifier, void return type,non parameterised
	{
		int a  , b , add;
		a = 10;
		b = 20;
		add = a + b;
		System.out.println("Addition of two numebrs is : "+add);
	}
	static void substarction()
	{
		int a  , b , sub;
		a = 10;
		b = 20;
		sub = b - a;
		System.out.println("Substarction of two numebrs is : "+sub);
	}
	
	public static void main(String[] args) 
	{
		System.out.println("first main method");
		methodtype();
		addition();//calling static method
		substarction();
	}


}

