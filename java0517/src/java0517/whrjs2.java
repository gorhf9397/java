package java0517;

import java.util.Scanner;

public class whrjs2 {

	public static void main(String[] args) {
		// 나이를 입력받아서 20살 이상이면
		// "어서오세요"출력
		// 20살 미만이면 "다음에 오세요"출력
		
		
		Scanner in=new Scanner (System.in);
		
		System.out.println("나이를 입력해 주세요");
		int age=in.nextInt();
		
		if(age>=20)
		{
			System.out.println("어서오세요");
		}
		else
		{
			System.out.println("다음에 오세요");
		}
		

	}

}
