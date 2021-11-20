package uncheckedExceptions;

public class NullPointerException {
	
	String a=null;

	public static void main(String[] args) {
		NullPointerException n=new NullPointerException();
		System.out.println(n.a.length());// character count is not possible

	}

}
