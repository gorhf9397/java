package java0517;

import java.util.Scanner;

public class ex_2t {
    public static void main(String[] args) {
		
    	// 극장에 A석, B석, C석, D석이 있다고 하자
    			// A석부터가 잘 보이는 자리라고 할때 연령때에 따라서 자리를 배치하는 프로그램 만들기
    			// 나이를 입력받아서 20미만이면 A석, 20이상 30미만이면 B석
    			// 30이상 40미만이면 C석, 나머지는 D석으로 출력하기
    			
    	Scanner in=new Scanner (System.in);
    	
    	int hu=in.nextInt();
    	
    	if(hu<20)
    	{
    		System.out.println("a석으로가");
    	}
    	else if(20<hu && hu<30)
    	{
    		System.out.println("b석으로가");
    	}
    	else if(hu<40)
    	{
    		System.out.println("c석으로가");
    	}
    	else
    	{
    		System.out.println("집에가");
    	}
	}
}
