package java0517;

public class If3 {
public static void main(String[] args) {
	// 실행할문장이 3개 이상일 경우 => if를 추가하여 처리
	// 국어 점수를 입력받고 A,B,C,D,F 로 출력하기
	
	int kor=59;
	
	if(kor >= 90)
	{
	System.out.println("국어는 A입니다");
	}
	else if(kor >= 80)
	{
	   System.out.println("국어는 B입니다");
	}
	else if(kor >= 70)
	{
	      System.out.println("국어는 C입니다");
	}
	else if(kor >= 60)
	{
	         System.out.println("국어는 D입니다");
	}
	else
	{
	            System.out.println("낙제입니다.");
	}
	
}
}
