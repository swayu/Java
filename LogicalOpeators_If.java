



package JavaPrograms;

public class LogicalOpeators_If {

	public static void main(String[] args) {
		int a = 12, b = 21 ,c = 88, d = 21;
		if(a>b && a==b)
		{
			System.out.println("I am AND opertaor");
		}
		if(a<b || b>=d)
		{
			System.out.println("I am OR operator ");
		}if(a<b && c>d)
		{
			System.out.println("I am AND operator");
		}if(a>b || c<a )
		{
			System.out.println("I am OR operator");
		}
		if(!(a==b && c<d))
		{
			System.out.println("I am Not opetaor");
		}

	}

}
