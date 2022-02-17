//Homework type casting

package JavaPrograms;
class green
{
	void green()
	{
		System.out.println("I am Green class");
	}
}
class reds extends green
{
	void reds()
	{
		System.out.println("I am Red class");
	}
}
class orange extends reds
{
	void orange()
	{
		System.out.println("I am Orange class");
	}
}
public class pink extends orange
{
	void pink()
	{
		System.out.println("I am Pink class");
	}
	public static void main(String[] args) 
	{
		reds r = new orange();
		r.reds();
		r.green();
		
		orange o1 = (orange)r;
		o1.reds();
		o1.green();
		o1.orange();
		
		

	}

}
