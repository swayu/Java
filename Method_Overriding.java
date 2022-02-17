

package JavaPrograms;

class Twooo
{
	void div()
	{
		
		float a=5.5f , b=10.5f,f;
		f = a/b;
		System.out.println("Super class output : "+f);
		
	}

}

public class Method_Overriding  extends Twooo
{

	void div()
	{
		float a=25.5f , b=10,f;
		f = a/b;
		System.out.println("SUbclass output is : "+f);
		super.div();//super keywords
		
	}
	public static void main(String[] args) 
	{
		
		Method_Overriding m = new Method_Overriding();
		m.div();
		System.out.println("Main class ");
	}

}
