package test;

import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {
		// 5명의 국어 성적을 입력받아서 총점과 평균 출력하기
		
		Scanner in=new Scanner (System.in);
		
		/*int[] kor=new int[5];
		
		for(int i=0; i<kor.length; i++)
		{
			kor[i]=in.nextInt();
		}
		System.out.println("-----------------------");
		
		for(int i=0; i<kor.length; i++)
		{
			System.out.println(kor[i]);
		}
		
		System.out.println("------------------------");
		
		int hap=0,avg;
		
		for(int i=0; i<kor.length; i++)
		{
			hap=hap+kor[i];
		}
		avg=hap/10;
		System.out.println(hap+"  "+avg);*/
		
		
		//---------------------------------------------------
		
		int hap=0 ,avg;
		for(int i=0; i<5; i++)
		{hap=hap+in.nextInt();
		}
		System.out.println("합 :"+hap);
		avg=hap/5;
		System.out.println("평균 : "+avg);
		
		}

	}


