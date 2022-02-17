package JavaPrograms;

class sub
{
	static void subclass()
	{
		System.out.println("This is subclass of single level inhertiance");
	}
	
}
public class Inheritance_SingleLevel extends sub
{

	public static void main(String[] args) 
	{
		
		System.out.println("This is superclass of single level inhertiance");
		subclass();

	}

}
