package JavaPrograms;

public class try_catch
{
	public void print()
	{
		int rollno[]= {1,3,6,200,5,0};
		for (int i=0; i<rollno.length; i++)
		{
			System.out.println("id are : "+rollno[i]);
		}
	}
	public static void main(String[] args) 
	{
		try_catch t = new try_catch();
		t.print();
		try 
		{
			int a = 1/0;
			System.out.println(a);
		}
		catch(ArithmeticException A)
		{
			System.out.println("Exception is handled");
		}
		finally
		{
			System.out.println("NO matter that i will be there");
		}
	}
	

}
