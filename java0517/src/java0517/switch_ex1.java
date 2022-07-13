package java0517;

import java.util.Scanner;

public class switch_ex1 {

	public static void main(String[] args) {
		// 두개의 숫자를 입력받기 (Scanner)
		//산술연산 실행을 위한 값을 입력받기 (1:+, 2:-, 3:*, 4:/)
		//입력되는 값에 따라서 하나의 연산만 실행하기.
		
		Scanner sc=new Scanner (System.in);
		
		int a=sc.nextInt();
		int s=sc.nextInt();
		
		int chk=sc.nextInt();
		
		
				if(chk==1)
				{
					System.out.println(a+s);
				}
				else if(chk==2)
				{
					System.out.println(a-s);
				}
				else if(chk==3)
				{
					System.out.println(a*s);
				}
				else if(chk==4)
				{
					System.out.println(a/s);
				}
				else
				{
					System.out.println("잘못입력");
				}
		
                 // swith
				switch(chk)
				{
					
					case 1: System.out.println(a+s); break;
					case 2: System.out.println(a-s); break;
					case 3: System.out.println(a*s); break;
					case 4: System.out.println(a/s); break;
					default: System.out.println("잘못입력"); break;
				}
				
	}

}
