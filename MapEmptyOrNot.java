package Training;

import java.util.*;

public class MapEmptyOrNot {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new LinkedHashMap<>(); 
		
		map.put(2, "Red");
		map.put(1, "Black");
		map.put(3, null);
		map.put(5, "Green");
		map.put(4, "Yellow");
		
		
		System.out.println(map.get(3) != null);
		
//		map.clear();
		
		if(map.isEmpty())
			System.out.println("Empty");
		else
			System.out.println("Map is having key value pairs \n" + map);
		
	}

}
