package JavaPrograms;
class Two
{
	void tv()
	{
		System.out.println("Hello");
	}	
}
public class Class_Type_MKT extends Two
{
	void remote()
	{
		System.out.println("hiiiii");
	}

	public static void main(String[] args) 
	{
	Two t2=	  	new Class_Type_MKT();//upcasting
		t2.tv();
		
		Class_Type_MKT c1=			(Class_Type_MKT) t2;//downcasting
	c1.remote();
	c1.tv();
		
		
		
	}

}
