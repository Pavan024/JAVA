package accesspecifiers.package1;

public class A {
	public String name = "packages"; //public member
	protected int i = 10; //protected member
	int j = 99; //default member
	private double b = 2.2; //private member
	
	public static void main(String[] args)
	{
	A a1 = new A();
	System.out.println(a1.i);
	System.out.println(a1.j);
	System.out.println(a1.name);
	System.out.println(a1.b);
	}
	
}
