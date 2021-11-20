package heirarchy;

public class Dog extends Animal{
	
	void bark() {
		System.out.println("Dogs bark");
	}

	public static void main(String[] args) {
		Dog d= new Dog();
		d.eat();
		d.bark();

	}

}
