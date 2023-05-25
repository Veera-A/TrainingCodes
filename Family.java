package OOPs;

public class Family {

	public static void main(String[] args) {
		
		AnimalFamily anCat = new Cat();
		
		AnimalFamily anBird = new Bird() {
			public void sound() {
				System.out.println("Bird makes sounds");
			}
		};
		
		
		anCat.sound();
		anBird.sound();
	}

}
