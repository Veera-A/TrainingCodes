package Training;

import java.util.*;

public class ColorsList {
	
	public static void main(String[] args) {
		
		List<String> colors = new ArrayList<>();
		
		colors.add("Red");
		colors.add("Black");
		colors.add("Blue");
		colors.add("Yellow");
		colors.add("White");
		
		
		/*printing  using iterator*/
		Iterator<String> color = colors.iterator();
		
		while(color.hasNext()) {
			System.out.println(color.next());
		}
		
		System.out.println();
		
		
		/* printing using forEach()*/
		colors.forEach(System.out::println);
	}
}
