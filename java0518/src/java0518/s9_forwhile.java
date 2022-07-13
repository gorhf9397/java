package java0518;

import java.util.Scanner;

public class s9_forwhile {

	public static void main(String[] args) {
		// for문을 while 문의 형태로 만들기
		
		Scanner sc=new Scanner (System.in);
		
		for(;;)	
		{
			if(sc.nextInt() !=0)
			{
			System.out.println("호호");
			}
			else
			{
				break;
			}
		}
		System.out.println("종료");

	}

}
