package Training;

import java.util.*;

public class JoiningTwoArrayList {

	public static void main(String[] args) {
		
		List<String> colors1 = new ArrayList<>();

		colors1.add("Red");
		colors1.add("Black");
		colors1.add("Blue");
		
		System.out.println("colors1  = " + colors1);
		
		List<String> colors2 = new ArrayList<>();
		
		colors2.add("White");
		colors2.add("Green");
		colors2.add("Grey");
		
		System.out.println("colors2  = " + colors2 +"\n\n");
		
		if(colors1.addAll(colors2))
			System.out.println(colors1);
//		else
//			System.out.println();
	}

}
