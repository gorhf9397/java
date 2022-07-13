package java0517;

import java.util.Scanner;

public class ex_3t {

	public static void main(String[] args) {
		//두개의 숫자를 입력받기
		//큰수에서 작은수를 뺀 값을 출력하기
		
		Scanner sc=new Scanner (System.in);
		
		int a=sc.nextInt();
		int s=sc.nextInt();
		
		
		if(a>s)
		{
			System.out.println(a-s);
		}
		else
		{
			System.out.println(s-a);
		}

	}

}
