package accesspecifiers.package2;

import accesspecifiers.package1.A;

public class C extends A{
	public static void main(String[] args)
	{
	C c1 = new C();
	A a1=new A();
	System.out.println(c1.i);
//	System.out.println(a1.j);
	/* it will shows an error because 
	the default member is not accessed in the another package we 
	can access it in the same package */
	System.out.println(a1.name);
	//System.out.println(a1.b); 
	/* The private member is accessed 
	in within the class */
	}
}
