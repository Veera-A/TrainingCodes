package Training;

import java.util.*;

public class ColorsListUsingStream {

	public static void main(String[] args) {

		List<String> colors = new ArrayList<>();

		colors.add("Red");
		colors.add("Black");
		colors.add("Blue");
		colors.add("Yellow");
		colors.add("White");
		
		colors.stream()
			.forEach(System.out::println);
		
		System.out.println();
		
		colors.stream()
			.forEach(c -> System.out.println(c));
		
	}

}
