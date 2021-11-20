package basics_new;

public class ElectricVehicle extends Tesla{
	
	int ev_value=130;

	public static void main(String[] args) {
		ElectricVehicle ev=new ElectricVehicle();
		System.out.println(ev.mileage);
		System.out.println(ev.mileage_value);
		System.out.println(ev.ev_value);
		ev.run();

	}

}
