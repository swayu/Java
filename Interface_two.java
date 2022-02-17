package JavaPrograms;

interface snow
{
	void snowing();
}
interface rain
{
	void raining();
}
public class Interface_two implements snow , rain
{

	public void snowing()
	{
		System.out.println("I am snowing ");
	}
	public void raining()
	{
		System.out.println("I am raining ");
	}
	
	public static void main(String[] args) 
	{
		Interface_two i = new Interface_two();
		i.snowing(); 
		i.raining();
	}

}
