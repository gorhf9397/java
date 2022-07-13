package date_ex;

import java.util.Date;

public class date_ex {
	
	public static void main(String[] args) {
		
	
	// Date 클래스
	Date today=new Date();
	
	int year=today.getYear()+1900; // 년도를 가져와서 리턴해주는 메소드 => 1900년 부터 시작
	int month=today.getMonth()+1; // 월을 가져와서 리턴해주는 메소드 (0~11)
	int day=today.getDate(); //일을 가져와서 리턴해주는 메소드
	
	System.out.println(year+"년 "+month+"월 "+day+"일 ");
	
	int hour=today.getHours(); // 현재 시를 리턴해주는 메소드
	int min=today.getMinutes(); // 현재 분을 리턴해주는 메소드
	int sec=today.getSeconds(); // 현재 초를 리턴해주는 메소드
	
	System.out.println(hour+"시 "+min+"분 "+sec+"초 ");
	
	int yoil=today.getDay();// 현재 요일을 리턴해주는 메소드
	if(yoil ==1)
	{
		System.out.println("월요일입니다");
	}
	else if(yoil ==2)
	{
		System.out.println("화요일입니다");
	}
	else if(yoil ==3)
	{
		System.out.println("수요일입니다");
	}
	else if(yoil ==4)
	{
		System.out.println("목요일입니다");
	}
	else if(yoil ==5)
	{
		System.out.println("금요일입니다");
	}
	else if(yoil ==6)
	{
		System.out.println("토요일입니다");
	}
	else
	{
		System.out.println("일요일입니다");
	}
	
	
	}
}
