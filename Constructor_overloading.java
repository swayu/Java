package JavaPrograms;

public class Constructor_overloading 
{

	Constructor_overloading ()
	{
		System.out.println("I am one ");
	}

	Constructor_overloading (int a)
	{
		System.out.println("I am two ");
	}

	Constructor_overloading (String b, String c)
	{
		System.out.println("I am Three ");
	}

	Constructor_overloading (boolean b)
	{
		System.out.println("I am four ");
	}
	public static void main(String[] args) 
	{
		Constructor_overloading c = new Constructor_overloading();
		Constructor_overloading c1 = new Constructor_overloading(2);
		new Constructor_overloading("swa","Tvisha");
		new Constructor_overloading(false);

	}

}
