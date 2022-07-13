package java0518;

import java.util.Scanner;

public class s4_while2 {
	
   public static void main(String[] args) {
	
	   
	   Scanner sc=new Scanner (System.in);
		
	   //while Scanner 문 한개로 줄이기
		while(sc.nextInt() != 0)
		{
			System.out.println("안녕하세요");
		}
		
		System.out.println("종료");
		
}
}
