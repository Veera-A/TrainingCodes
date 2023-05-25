package Training;

import java.util.*;
import java.util.stream.Collectors;

public class HashSetToArray {

	public static void main(String[] args) {
		
		
		Set<String> colors = new HashSet<>();

		colors.add("Red");
		colors.add("Black");
		colors.add("Blue");
		colors.add("Red");
		colors.add("Yellow");
		colors.add("Black");
		colors.add("White");
		
		System.out.println(colors + "\n");
		
		List<String> colorList = colors.stream().collect(Collectors.toList());
		
		String[] clArr = new String[colors.size()];
		
		for(int i=0 ; i < clArr.length ; i++) {
			clArr[i] = colorList.get(i);
		}
			
		for(String cl : clArr) {
			System.out.println(cl);
		}
	}
}
