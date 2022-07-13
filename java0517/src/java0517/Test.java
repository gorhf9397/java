package java0517;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		
		// 영어점수를 콘솔창에서 입력받고 60점 이상이면 합격, 미만이면 불합격 출력하기
		
		System.out.println("점수를 입력해 주세요");
		
		int eng=60;
		
		Scanner in=new Scanner(System.in);
		eng=in.nextInt();
		
		if (eng >= 60)
		{
		System.out.println("합격입니다");
		}
		else
		{
		System.out.println("불합격입니다");
		}
		

	}

}
