//Homework type casting

package JavaPrograms;
class Dell
{
	void dell()
	{
		System.out.println("I am Dell class");
	}
}
class Lenovo extends Dell
{
	void lenovo()
	{
		System.out.println("I am Lenovo class");
	}
}

public class mac extends Lenovo
{
	void macc()
	{
		System.out.println("I am Mac class");
	}
	public static void main(String[] args) 
	{
		Lenovo l = new mac();
		l.lenovo();
		l.dell();
		Dell d = new mac();
		mac m = (mac)d;
		m.dell();
		m.lenovo();
		m.macc();
	}

}
