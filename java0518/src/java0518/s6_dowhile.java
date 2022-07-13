package java0518;

import java.util.Scanner;

public class s6_dowhile {

	public static void main(String[] args) {
		// do~while
		/*
		 * do
		 * {
		 * 반복문장;
		 * }while(조건식)
		 */
		
		Scanner sc=new Scanner (System.in);
		
		do
		{
			System.out.println("안녕허세요");
		}while(sc.nextInt() !=0);
		
		System.out.println("종료");

	}

}
