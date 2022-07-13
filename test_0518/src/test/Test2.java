package test;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// 나이를 입력받는후 "출입하세요"를 출력
		// 출력후에 나이가 20인 경우에 "성인이 되셨네요"라고 출력하기
		
		Scanner in=new Scanner (System.in);
		
		int age=in.nextInt();
		System.out.println("입장하세요");
		if(age == 20)
		{
			System.out.println("성인이 되셧네요");
		}

	}

}
