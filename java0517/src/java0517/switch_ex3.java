package java0517;

import java.util.Scanner;

public class switch_ex3 {

	public static void main(String[] args) {
		// 두개의 숫자를 입력받기
		// 큰수에서 작은수를 뺸 값을 출력하기
		
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		
		if(x>y)
		{
		System.out.println(x-y);
		}
		else
		{
			System.out.println(y-x);
		}

	}

}
