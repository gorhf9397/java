package date_ex;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Time_ex4 {

	public static void main(String[] args) {
		LocalDate xday=LocalDate.of(1997,10,23);
		LocalDate yday=LocalDate.now();
		
		long day=xday.until(yday,ChronoUnit.DAYS);
		
		System.out.println(day);

	}

}
