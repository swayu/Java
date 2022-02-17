package JavaPrograms;

interface example
{
	void add();
}
public class Interface_one 
{

	public void add()
	{
		System.out.println("I am interface ");
	}
	public static void main(String[] args) 
	{
		Interface_one i = new Interface_one();
		i.add(); 
	}

}
