package java0520;

import java.util.Scanner;

public class s5_test {
	
	Scanner in=new Scanner (System.in);
	
	int age;
	
	public void input()
	{
		System.out.println("나이를 입력하세요");
		age=in.nextInt();
	}
	
	public void cal()
	{
		if(age>=15)
		{
			System.out.println("입장");
		}
		else
		{
			System.out.println("나가");
			}
	}
	}


