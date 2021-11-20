package interfaceConcept;//user defined package

import java.util.Scanner;//build in package

public class A6 implements printable{

	public static void main(String[] args) {
		A6 a=new A6();
		a.print();
		

	}
	
	Scanner sc =new Scanner(System.in);

	@Override
	public void print() {
		System.out.println("Print something");
		
	}

}
