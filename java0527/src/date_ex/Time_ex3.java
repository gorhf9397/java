package date_ex;

import java.time.LocalDate;

public class Time_ex3 {

	public static void main(String[] args) {
		
		// 특정일 부터 몇일전,몇일후 구하기
		LocalDate today=LocalDate.now();
		LocalDate dday=LocalDate.of(2014, 10, 30);
		
		LocalDate xday=dday.plusDays(2767);
		
		int year3=xday.getYear();
		int month3=xday.getMonthValue();
		int day3=xday.getDayOfMonth();
		System.out.println(year3+" " +month3+" "+day3+" ");

	}

}
