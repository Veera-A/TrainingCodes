package Training;

import java.util.*;

public class CopyingArrayListToAnother {

	public static void main(String[] args) {
		List<String> place = new ArrayList<>();

		place.add("Madurai");
		place.add("Bagalore");
		place.add("Coimbatore");
		place.add("Theni");


		List<String> cars = new ArrayList<>();

		cars.add("Cheverolet");
		cars.add("Benz");
		cars.add("Volkswagen");
		cars.add("Swift");


		System.out.println("Before copying");
		System.out.println("List of places \n" + place);
		System.out.println("List of cars \n" + cars);

		Collections.copy(place, cars);

		System.out.println("After copying");
		System.out.println("List of places \n" + place);
		System.out.println("List of cars \n" + cars);

		System.out.println("\n\n");



		/*manual*/
		//		System.out.println("List of places \n" + place + "\n");
		//		place.clear();
		//		
		////		System.out.println("List of places while replacing " +  place);
		//		
		//		for(String c : cars) {
		//			place.add(c);
		//		}
		//		//		System.out.println("List of cars \n"+ cars + "\n");
		//		
		//		System.out.println("List of places after replaced by value of cars list \n "+ place);
	}

}

