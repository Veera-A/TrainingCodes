package Training;

import java.time.*;

public class FirstAndLastDayOfWeek {
	
	public static void main(String[] args) {
		
		int dayOfWeek = DayOfWeek.SUNDAY.getValue();

		LocalDate firstOfMonth = LocalDate.now();
		LocalDate firstOfNextMonth = firstOfMonth.plusMonths( 1 );
		LocalDate firstDateInGrid = firstOfMonth.withDayOfMonth( dayOfWeek );
//		System.out.println(firstDateInGrid); //2023-05-07
//		System.out.println(firstOfMonth); 		//2023-05-25
//		System.out.println(firstOfNextMonth);		//2023-06-25
		if ( firstDateInGrid.isAfter( firstOfMonth ) ) { // If getting the next start of week instead of desired week's start, adjust backwards.
		    firstDateInGrid = firstDateInGrid.minusWeeks( 1 );
		}

		LocalDate weekStart = firstDateInGrid;
		LocalDate weekStop = null;
		int weekNumber = 0;

		do {
		    weekNumber = weekNumber + 1;
		    weekStop = weekStart.plusDays( 6 );
		    System.out.println( weekNumber + " week: " + weekStart + " --- " + weekStop );  // 1 week: 03-30-2014 --- 04-05-2014
		    weekStart = weekStop.plusDays( 1 );
		} while ( weekNumber < 4 );
//		
		
		
		

	}
}