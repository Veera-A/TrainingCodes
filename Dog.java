package OOPs;

public class Dog implements Animal {

	public static void main(String[] args) {
		
		Animal animal = new Dog();
		
		animal.bark();
		
	}
	public void bark() {
		System.out.println("Dog is barking");
	}

}
