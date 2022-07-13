package java0523;

import java.util.Scanner;

public class s2_hap2 {
		// a부터 b까지의 합을 구하기
	
	Scanner in=new Scanner (System.in);
	// 매개변수X 리턴값X
		public void test()
		{
			int a=in.nextInt();
			int b=in.nextInt();
			int hap=0;
			for(int i=a; i<=b; i++)
			{
				hap=hap+i;
			}
			System.out.println("a부터b까지의 값: "+hap);
		}
	
	// 매개변수O 리턴값X
		public void test2(int a, int b)
		{
			int hap=0;
			for(int i=a; i<=b; i++)
			{
				hap=hap+i;
			}
			System.out.println("a부터b까지의 값: "+hap);
		}
	// 매개변수X 리턴값O
		public int test3()
		{
			int a=in.nextInt();
			int b=in.nextInt();
			int hap=0;
			for(int i=a; i<=b; i++)
			{
				hap=hap+i;
			}
			return hap;
		}
	// 매개변수O 리턴값O
		public int test4(int a, int b)
		{
			
			int hap=0;
			for(int i=a; i<=b; i++)
			{
				hap=hap+i;
			}
			return hap;
		}
	

}
