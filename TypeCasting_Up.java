package JavaPrograms;

class casting
{
	void add()
	{
		System.out.println("I am addition");
		int a= 12, b=21,c;
		c=a+b;
		System.out.println("Add : "+c);
	}
}
public class TypeCasting_Up extends casting
{

	public static void main(String[] args) 
	{
		
		casting ca =new TypeCasting_Up();
		ca.add();
	}

}
