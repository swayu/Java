package JavaPrograms;

class castingg
{
	void add()
	{
		System.out.println("I am addition");
		int a= 44, b=66,c;
		c=a+b;
		System.out.println("Add : "+c);
	}
}
public class TypeCasting_Down extends castingg
{

	public static void main(String[] args) 
	{
		castingg dn = new castingg();
		TypeCasting_Down ca = (TypeCasting_Down)dn;
		ca.add();
	}

}
