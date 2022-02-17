package JavaPrograms;
class twot
{
	void ctwo()
	{
		System.out.println("Class two");
	}
}
class oneo extends twot
{
	void cone()
	{
		System.out.println("Class one");
	}
}
public class Down_Up_Casting extends oneo
{

	class three
	{
		void cthree()
		{
			System.out.println("Class three");
			
		}
	}
	public static void main(String[] args) 
	{
		
		oneo o1 = new Down_Up_Casting();
		o1.cone();
		
	}

}
