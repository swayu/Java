package JavaPrograms;

public class Method_overloading 
{
	Method_overloading()
	{
		System.out.println("I am construcor");
	}
	static void add()
	{
		System.out.println("I am add one");
	}
	static void add(int a)
	{
		System.out.println("I am add two");
	}
	static void add(double b, int c)
	{
		System.out.println("I am add three");
	}
	static void add(String s, float f)
	{
		System.out.println("I am add four");
	}
	void add(boolean b)
	{
		System.out.println("I am add five");
	}
	public static void main(String[] args) 
	{
		add();
		add(0);
		add(12.56,12);
		add("swa",11.11f);
		Method_overloading a = new Method_overloading();
		a.add(true);
		Method_overloading a1= new Method_overloading();
		
	}

}
