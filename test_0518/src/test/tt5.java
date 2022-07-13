package test;

import java.util.Scanner;

public class tt5 {
   public static void main(String[] args) {
	           
	// 1부터 x까지의 합 구하기 (x는 Scanner로 입력받기)
		
			// a부터 b까지의 합 구하기 (a,b는 Scanner로 입력)
	   
	// a가 b보다 크다면 값을 교환 후 실행하기
	   
	   Scanner in=new Scanner (System.in);
	   
	   int hap=0;
	   int x=in.nextInt();
	   
	   for(int i=1; i<=x; i++)
	   {
		   hap=hap+i;
	   }
	   System.out.println(hap);
	   
	   
 //--------------------------------------------------
	   int hap2=0;
	   int a=in.nextInt();
	   int b=in.nextInt();
	   
	   for (int i=a; i<=b; i++)
	   {
		   hap2=hap2+i;
	   }
	   System.out.println(hap2);
	   
	   
	   
}
}
