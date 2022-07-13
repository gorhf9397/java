package java0520;

import java.util.Scanner;

public class s2_S2 {

		// 객체지향
		//클래스 => 속성과 메소드
		// 속성(변수)
        Scanner in=new Scanner (System.in);
		
		int kor,eng,mat;
		int hap,avg;
		
		//메소드(기능)
		
		public void test()
		{
			kor=in.nextInt();
			eng=in.nextInt();
			mat=in.nextInt();
			
			hap=kor+eng+mat;
			avg=hap/3;
			
			System.out.println(hap+"  "+avg);
		}


}
