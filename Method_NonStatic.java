
package JavaPrograms;

public class Method_NonStatic {

		void methodtype()//private access specifier , non static modifier, void return type,non parameterised
		{
			System.out.println("This is example of static method");
		}
		void add()//package(default)access specifier , non static modifier, void return type,non parameterised
		{
			int a  , b , add;
			a = 10;
			b = 20;
			add = a + b;
			System.out.println("Addition of two numebrs is : "+add);
		}
		void sub()
		{
			int a  , b , sub;
			a = 10;
			b = 20;
			sub = b - a;
			System.out.println("Substarction of two numebrs is : "+sub);
		}
		
		public static void main(String[] args) 
		{
			System.out.println("first main method");
			Method_NonStatic m = new Method_NonStatic();
			m.add();
			m.sub();

		}
	}
