package Training;

import java.util.*;

public class CalendarPrint {

	public static void main(String[] args) {
		
		Calendar calendar = Calendar.getInstance();
		
		System.out.println("YEAR : " + calendar.get(Calendar.YEAR));
		System.out.println("Month : " + calendar.get(Calendar.MONTH));
		System.out.println("Day of month : " + calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println("Hour : " + calendar.get(Calendar.HOUR));
		System.out.println("Minute : " + calendar.get(Calendar.MINUTE));
		
	}

}
