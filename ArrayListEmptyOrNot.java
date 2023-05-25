package Training;

import java.util.*;

public class ArrayListEmptyOrNot {
	public static void main(String[] args) {

		List<String> colors = new ArrayList<>();

		colors.add("Red");
		colors.add("Black");
		colors.add("Blue");
		colors.add("Yellow");
		colors.add("White");

//		colors.clear();	
		
		if(colors.isEmpty())
			System.out.println("given arrayList is empty");
		else
			System.out.println("given arrayList is not empty");


	}
}
