package JavaPrograms;

class red
{
	static void pink()
	{
		System.out.println("I am class two , hierarchical level ");
	}
}
class blue 
{
	static void green()
	{
		System.out.println("i am class one ");
	}
	
}
public class Inhertiance_HierarchicalLevel extends blue
{

	public static void main(String[] args) 
	{
		green();
		red re = new red();
		re.pink();

	}

}




