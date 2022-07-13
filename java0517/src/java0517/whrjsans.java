package java0517;

public class whrjsans {

	public static void main(String[] args) {
		/* 1. 조건문(분기문) if, switch 
		  if : 조건에따라 실행되는 문장이 다른 경우
		  형식 : if(조건)  => 조건에는 true, false 의 값이 나오게 한다
		  {
		  문장 A;  조건이 참일 경우
		  }
		  else
		  {
		  문장 B;  조건이 거짓일 경우 
		  } */
		
		//실행할 문장이 2개이지만 조건에 따라 둘중에 하나만 실행하고자 할때
		// 국어점수가 입력되었을때 다음과 같이 문장을 실행한다
		int kor=70;
		
		if(kor>=60)
		{
		System.out.println("합격입니다");
		}
		else
			
		{
		System.out.println("불합격입니다");
		}
		
		//실행문장의 위치가 다를경우
		
		if(kor<60)
		{
		System.out.println("불합격입니다");
		}
		else
		{
		System.out.println("합격입니다");
		}
		
		/*switch : 2개 이상의 실행문장중 하나를 실행할때
		 형식 : switch(변수)
		{
			case 변수의값: 실행문 1 :break;
			case 변수의값: 실행문 2 :break;
			case 변수의값: 실행문 3 :break;
			case 변수의값: 실행문 4 :break;
			default : 실행문 5;
		}
		*/
		
		// 2. 반복문 for, while

	}

}
