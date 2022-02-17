


package JavaPrograms;

class ten
{
	static void ten_one()
	{
		System.out.println("I am class three , hybrid level ");
	}
}

class nine extends ten
{
	static void nine_one()
	{
		System.out.println("I am class two, multilvel  ");
	}
}


class eight extends nine
{
	static void eight_one()
	{
		System.out.println("i am class one , single level");
	}
	
}
public class Inhertiance_HybridLevel extends eight
{

	public static void main(String[] args) 
	{
		eight_one();
		nine_one();
		ten thre = new ten();
		thre.ten_one();

	}

}


