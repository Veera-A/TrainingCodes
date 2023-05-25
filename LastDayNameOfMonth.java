package Training;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;
//import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class LastDayNameOfMonth {

	public static void main(String[] args) {
				
		/*first type*/
		YearMonth yM = YearMonth.now();
		
		LocalDate yym = yM.atEndOfMonth();
		
		DayOfWeek day = LocalDate.parse(yym.toString()).getDayOfWeek();
		
		System.out.println(day);
		
		/*second type*/
		LocalDate lDate = LocalDate.now();
		
		int mn = lDate.getMonth().length(lDate.isLeapYear());
		
		System.out.println(mn);
		
		DayOfWeek dayOfWeek = lDate.withDayOfMonth(mn).getDayOfWeek();
		
		System.out.println(dayOfWeek);
	}

}
