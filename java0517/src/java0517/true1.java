package java0517;

import java.util.Scanner;

public class true1 {

	public static void main(String[] args) {
		// 원하는 메뉴의 값을 숫자로 입력받는다
				// 1:짜장면 , 2:우동 , 3:짬뽕 , 4:탕수육
		
		System.out.println("1:짜장면 , 2:우동 , 3:짬뽕 , 4:탕수육 ");
        Scanner in=new Scanner (System.in);
        
        int chk=in.nextInt();
        
        
        if(chk==1)
        {
		System.out.println("짜장면 주문 들어왔어요");
        }
        else if(chk==2)
        {
		System.out.println("우동 주문 들어왔어요");
        }
        else if(chk==3)
        {
		System.out.println("짬뽕 주문 들어왔어요");
        }
        else if(chk==4)
        {
		System.out.println("탕수육 주문 들어왔어요");
        }
        else
        {
		System.out.println("똑바로 주문 하세요");
        }
		

	}

}
