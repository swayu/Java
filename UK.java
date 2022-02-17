//Homework type casting

package JavaPrograms;
class US
{
	void us()
	{
		System.out.println("I am US class");
	}
}
class CN extends US
{
	void cn()
	{
		System.out.println("I am CN class");
	}
}

public class UK extends CN
{
	void uk()
	{
		System.out.println("I am UK class");
	}
	public static void main(String[] args) 
	{
		US u = new CN();
		u.us();
		US u1 = new UK();
		UK k =(UK)u1;
		k.cn();
		k.uk();
		k.us();
		

	}

}
