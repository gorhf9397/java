package date_ex;

import java.time.LocalDateTime;

public class Time_ex1 {

	public static void main(String[] args) {
		LocalDateTime today=LocalDateTime.now();
	
			int year=today.getYear();
			int month=today.getMonthValue();
			int day=today.getDayOfMonth();
			
			System.out.println(year+"년 "+month+"월 "+day+"일 ");
			
			int hour=today.getHour();
			int min=today.getMinute();
			int sec=today.getSecond();
			
			System.out.println(hour+" "+min+" "+sec+" ");
			
			System.out.println(today.getMonth());
			System.out.println(today.getDayOfWeek());
			
			
					
			
		}

	}


