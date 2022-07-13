package java0517;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		// 원하는 메뉴의 값을 숫자로 입력받는다
		// 1:짜장면 , 2:우동 , 3:짬뽕 , 4:탕수육
		
		Scanner in=new Scanner (System.in);
		
		System.out.println("짜장면 주문 들어왔어요");
		System.out.println("우동 주문 들어왔어요");
		System.out.println("짬뽕 주문 들어왔어요");
		System.out.println("탕수육 주문 들어왔어요");
		System.out.println("똑바로 주문 하세요");
		
		int a=in.nextInt();
		int s=in.nextInt();
		int d=in.nextInt();
		int f=in.nextInt();
		int g=in.nextInt();
				
		
		
		
		
		if(a==1)
		{
			System.out.println("짜장면 주문 들어왔어요");
		}
		else if(s==2)
		{
			System.out.println("우동 주문 들어왔어요");
		}
		else if(d==3)
		{
			System.out.println("짬뽕 주문 들어왔어요");
		}
		else if(f==4)
		{
			System.out.println("탕수육 주문 들어왔어요");
		}
		else
		{
			System.out.println("똑바로 주문 하세요");
		}
		}

	}

