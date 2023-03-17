package com.generics;

public class MainClass {
	public static void main(String[] args) {
	 
	 OralMedicine omed=new Tablet();
	 Bottle<? super OralMedicine> humanMedbotl=new Bottle<HumanMedicine>(new HumanMedicine());
	 Bottle<? super OralMedicine> Medbotl=new Bottle<Medicine>(new Medicine());
	// Bottle<? super OralMedicine> injectionbotl=new Bottle<Injection>(new Injection()); #CE there is no inheritance relation with oralmedicine and injection
	 Bottle<? extends OralMedicine> tabletbotl=new Bottle<Tablet>(new Tablet());
	 Bottle<? extends OralMedicine> capsulebotl=new Bottle<Capsule>(new Capsule());
	 String returnValue=Bottle.doSomething(new Tablet());
	 System.out.println("doSomething Method:"+returnValue);
	// Bottle<? extends OralMedicine> injectionbotl=new Bottle<Injection>(new Injection());
	 logBottleInfo(new Bottle<Tablet>(new Tablet()));
	 logBottleInfo(new Bottle<Capsule>(new Capsule()));
	// logBottleInfo(new Bottle<Injection>(new Injection()));
	 addItemToBottle(new Bottle<Tablet>());
	 processOralMedicine(new Bottle<Tablet>());
	 processOralMedicine(new Bottle<Capsule>());
	 logBottleInfom(new Bottle<HumanMedicine>(new HumanMedicine()));
	 logBottleInfom(new Bottle<Medicine>(new Medicine()));
	 addItemToBtl(new Bottle<HumanMedicine>());
	 addItemToBtl(new Bottle<Medicine>());
	}
	private static void logBottleInfo(Bottle<? extends OralMedicine> bottle) { //upperbounds
		System.out.println("logBottleInfo:"+bottle.getItem().getClass().getName());
	}
	private static void addItemToBottle(Bottle<? extends OralMedicine> bottle) { //upperbounds
	//	bottle.setItem(new Tablet()); #CE  write operations doesn't allow upperbound(extends)(only read operations allowed)
	}
	private static void processOralMedicine(Bottle<? extends OralMedicine> bottle) { //upperbound 
		OralMedicine omed=bottle.getItem();
	//	Tablet tablet=bottle.getItem(); #CE
		}
	private static void logBottleInfom(Bottle<? super OralMedicine> bottle) { //lowerbounds (super)(only write operations allowed)
		System.out.println("logBottleInfo with super:"+bottle.getItem().getClass().getName());
	}	
	private static void addItemToBtl(Bottle<? super OralMedicine> bottle) { //lowerbounds
	//	bottle.setItem(new HumanMedicine()); #CE
		bottle.setItem(new Tablet());
	//	OralMedicine omed=bottle.setItem(null); 
		
	}
}
