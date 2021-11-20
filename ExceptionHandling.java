package uncheckedExceptions;

import java.util.Scanner;

public class ExceptionHandling {
	
	static Scanner sc=new Scanner(System.in);
	static int a=sc.nextInt();

	public static void main(String[] args) {
		
		try {
		int c=0;
		c= a/0;
		System.out.println(c);
		}
		catch(Exception e) {
			System.out.println(e);
			
		}
		finally {
			sc.close();
		}

	}
}
