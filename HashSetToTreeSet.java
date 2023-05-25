package Training;

import java.util.*;

public class HashSetToTreeSet {

	public static void main(String[] args) {
		
		Set<String> colors = new HashSet<>();

		colors.add("Red");
		colors.add("Black");
		colors.add("Blue");
		colors.add("Red");
		colors.add("Yellow");
		colors.add("Black");
		colors.add("White");
		
		System.out.println("Colors HashSet \n" + colors + "\n");
		
		TreeSet<Object> tColors = new TreeSet<>(colors);
		
		System.out.println("Colors TreeSet \n" +tColors);
		
		
		
	}

}
