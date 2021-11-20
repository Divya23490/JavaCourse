package methodOverriding;

public class Bike extends Vehicle{
	
	void run() {
		System.out.println("Bikes is running safely");
	}

	public static void main(String[] args) {
		Bike b=new Bike();
		b.run();

	}

}
