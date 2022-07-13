package java0523;

import java.util.Scanner;

public class s1_methodex {
	
	// 1. 국,영,수 성적을 입력하여 평균과 총점을 구해주는 프로그램 작성하기
	//4개의 클래스를 만들어서 작업
	
	// 1. 매개변수X, 리턴값X
	
			Scanner sc=new Scanner(System.in);
			
			int kor,eng,mat,hap,avg;
			public void test()
			{
				int kor=sc.nextInt();
				int eng=sc.nextInt();
				int mat=sc.nextInt();
				System.out.println(kor+eng+mat);
				System.out.println((kor+eng+mat)/3);
			}
	
	
	// 2. 매개변수ㅇ 리턴값x
			public void test2(int a, int b, int c)
			{
				kor=a;
				eng=b;
				mat=c;
				
				System.out.println(kor+eng+mat);
				System.out.println((kor+eng+mat)/3);
			}
				
	
	// 3. 매개변수x 리턴값ㅇ
			public int test3()
			{
				int kor=sc.nextInt();
				int eng=sc.nextInt();
				int mat=sc.nextInt();
				System.out.println(kor+eng+mat);
				System.out.println((kor+eng+mat)/3);
				return kor+eng+mat;
			}
			
	
	
	// 4. 매개변수ㅇ 리턴값ㅇ
			public int test4(int a, int b)
			{
				int kor=sc.nextInt();
				int eng=sc.nextInt();
				int mat=sc.nextInt();
				System.out.println(kor+eng+mat);
				System.out.println((kor+eng+mat)/3);
				return kor+eng+mat;
			}
	
	
}
