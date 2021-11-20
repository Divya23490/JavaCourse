package superKeyword;

public class Mercedes extends Car{
	
	
	Mercedes() {//deafult constructor
		super();// 100// parent class constructor
		// TODO Auto-generated constructor stub
	}

	static int mileage=90;
	
	void run() {
		super.run();// Car class-- parent class method
		System.out.println(super.mileage);//Car class --instance variable
		System.out.println(mileage);//Mercedes
		System.out.println("Speed of Merecedes is good!");
	}

	public static void main(String[] args) {
		
		Mercedes m=new Mercedes();//
		
		m.run();
		
		

	}

}
