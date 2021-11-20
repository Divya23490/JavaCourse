package finalMethod;

public class Honda extends Bike{
	
	void runHonda() {
		super.run();
		System.out.println("Honda speed is good");
	}

	public static void main(String[] args) {
		Honda h=new Honda();
		h.runHonda();
		System.out.println(h.a);//default

	}

}
