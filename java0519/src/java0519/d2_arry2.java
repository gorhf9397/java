package java0519;

import java.util.Scanner;

public class d2_arry2 {

	public static void main(String[] args) {
		// 10000명의 국어점수을 저장하기
		// 10000명의 국어점수를 저장할 배열만들기
		
		int[] kor=new int[10000];
		
		//점수를 입력
		Scanner sc=new Scanner (System.in);
		for(int i=0; i<kor.length; i++)
		{                //kor배열의 크기
			kor[i]=sc.nextInt();
		}

	}

}
