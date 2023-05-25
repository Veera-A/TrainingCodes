package Training;

import java.util.*;

public class LinkedListIteration {

	public static void main(String[] args) {
		List<String> colors = new LinkedList<>();

		colors.add("Red");
		colors.add("Black");
		colors.add("Blue");
		colors.add("Red");
		colors.add("Yellow");
		colors.add("Black");
		colors.add("White");
	
		System.out.println(colors);
		
		Iterator<String> listC = colors.iterator();
		
		while(listC.hasNext()) {
			System.out.println(listC.next());
		}
		
		
	}

}
