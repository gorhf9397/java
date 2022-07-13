package date_ex;

import java.time.LocalDate;

public class Time_ex2 {

	public static void main(String[] args) {
		
		LocalDate today=LocalDate.now();
		// 오늘 기준으로 이전, 이후의 날짜를 알아내기
		
		int year=today.getYear();
		int month=today.getMonthValue();
		int day=today.getDayOfMonth();
		
		System.out.println(year+"년 "+month+"월 "+day+"일 ");
		
		LocalDate dday=today.plusDays(1000); // today 객체의 날짜로부터 괄호안의 값 이후의 날짜를 리턴해준다..
		
		int yearr=dday.getYear();
		int monthh=dday.getMonthValue();
		int dayy=dday.getDayOfMonth();
		
		System.out.println(yearr+"년 "+monthh+"월 "+dayy+"일 ");
		
		LocalDate xday=today.minusDays(1000);
		int year3=xday.getYear();
		int month3=xday.getMonthValue();
		int day3=xday.getDayOfMonth();
		System.out.println(year3+" " +month3+" "+day3+" ");
		

	}

}
