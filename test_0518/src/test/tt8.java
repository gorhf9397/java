package test;

import java.util.Scanner;

public class tt8 {

	public static void main(String[] args) {
		// 5명의 국어 성적을 입력받아서 총점과 평균 출력하기
		
		Scanner in=new Scanner (System.in);
		
		int[] kor=new int[5];
				for(int i=0; i<kor.length; i++)
				{
					kor[i]=in.nextInt();
				}
				
				int hap=0,avg;
				for(int i=0; i<kor.length; i++)
				{
					hap=hap+kor[i];
				}
					avg=hap/5;
					System.out.println(hap+"   "+avg);
					

	}

}
