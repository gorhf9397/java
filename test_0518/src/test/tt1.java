package test;

import java.util.Scanner;

public class tt1 {

	public static void main(String[] args) {
		// 콘솔창에서 나이를 입력받는다. 
		// 나이가 15이상이면 "입장하세요" 출력
		// 나이가 15미만이면 "담에 오세요" 출력
		
		Scanner in=new Scanner (System.in);
		
		int age=in.nextInt();
		
		if(age>=15)
		{
			System.out.println("입장");
		}
		else
		{
			System.out.println("안돼");
		}

	}

}
