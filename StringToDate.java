package Training;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StringToDate {

	public static void main(String[] args) {

		String date = "2022-11-21";
			
//			LocalDate lDate = LocalDate.parse(date);
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-mm-dd");
			LocalDate lDate2 = LocalDate.parse(date, formatter);
			
			System.out.println(lDate2);
			
	

	}

}
