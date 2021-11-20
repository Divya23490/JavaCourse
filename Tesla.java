package basics_new;

public class Tesla extends Car{
	
	int mileage_value=90;

	public static void main(String[] args) {
		Tesla ts=new Tesla();
		System.out.println(ts.mileage);
		System.out.println(ts.mileage_value);
		ts.run();

	}

}
