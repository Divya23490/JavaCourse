package protectedPackage;

public class B extends A{

	public static void main(String[] args) {
		B b=new B();
		b.runA();
		System.out.println(b.a);

	}

}
