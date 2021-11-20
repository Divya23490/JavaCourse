package heirarchy;

public class Cat extends Animal{
	
	void meow() {
		System.out.println("Cats meow");
	}

	public static void main(String[] args) {
		Cat c=new Cat();
		c.eat();
		c.meow();

	}

}
