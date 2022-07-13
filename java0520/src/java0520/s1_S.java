package java0520;

import java.util.Scanner;

public class s1_S {

	public static void main(String[] args) {
		
		// 국,영,수 과목을 입력받고 총점과 평균을 구하라.
		
		Scanner in=new Scanner (System.in);
		
		int kor,eng,mat;
		kor=in.nextInt();
		eng=in.nextInt();
		mat=in.nextInt();
		
		int hap,avg;
		hap=kor+eng+mat;
		avg=hap/3;
		
		System.out.println(hap+"  "+avg);
		

	}

}
