package test;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		// 1부터 x까지의 합 구하기 (x는 Scanner로 입력받기)
		
		// a부터 b까지의 합 구하기 (a,b는 Scanner로 입력)
		
		Scanner in=new Scanner (System.in);
		 
		/*int x=in.nextInt();
		int hap=0;
		for (int i=1; i<=x; i++)
		{
			hap=hap+i;
		}
		System.out.println(hap);*/
		
		System.out.println("------------------------------");
		
		int a=in.nextInt();
		int b=in.nextInt();
		// a가 b보다 크다면 값을 교환 후 실행하기
		int hap=0;
		//만약 a가 b보다 크다면 => a와 b의값을 교환
		
		if(a>b)
		{
		int imsi;
		imsi=a;
		a=b;
		b=imsi;
		}
		for(int i=a; i<=b; i++)
		{
			hap=hap+i;
		}
		System.out.println(hap);
		
		
	}

}
