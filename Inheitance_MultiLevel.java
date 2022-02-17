

package JavaPrograms;

class one
{
	static void one_one()
	{
		System.out.println("This is class one");
	}
	void four_four()
	{
		System.out.println("This is class four");
	}
}
class two extends one
{
	static void two_two()
	{
		System.out.println("This is class two");
	}
	 void three_three()
		{
			System.out.println("This is class three");
		}
}
public class Inheitance_MultiLevel extends two
	{

	
	public static void main(String[] args) 
	{
		one_one();
		two_two();
		two thr = new two();
		thr.three_three();
		one fr = new one();
		fr.four_four();

	}

}

