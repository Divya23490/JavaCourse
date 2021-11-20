package uncheckedExceptions;

public class ArithmeticException {
	
	static int a =50;

	public static void main(String[] args) {
		int c=0;
		c= a/0;
		System.out.println(c);

	}

}
