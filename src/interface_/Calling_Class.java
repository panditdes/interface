package interface_;

public class Calling_Class {
	// page calling
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Implementationclass k = new Implementationclass();
		
		k.m1();
		k.m2();
		k.m3();
		k.m4();
		k.extraMethod();
		
		
		System.out.println(k.a);
		
		System.out.println(Interface1.a);
		System.out.println(Interface1.b);
		System.out.println(Interface2.a);
		System.out.println(Interface2.d);
		
	}

}
