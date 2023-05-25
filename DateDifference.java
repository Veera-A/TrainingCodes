package Training;

import java.time.LocalDate;
import java.time.Period;

public class DateDifference {

	public static void main(String[] args) {
		
		
		LocalDate ld = LocalDate.now();
		
		LocalDate ld1 = LocalDate.of(1999, 05, 07);

		Period period = Period.between(ld1 , ld);
		
		System.out.println("Number of days : " + period.getDays());
		System.out.println("Number of months : " + period.getMonths());
		System.out.println("Number of years : " + period.getYears());
	}

}
