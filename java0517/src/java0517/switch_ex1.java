package java0517;

import java.util.Scanner;

public class switch_ex1 {

	public static void main(String[] args) {
		// �ΰ��� ���ڸ� �Է¹ޱ� (Scanner)
		//������� ������ ���� ���� �Է¹ޱ� (1:+, 2:-, 3:*, 4:/)
		//�ԷµǴ� ���� ���� �ϳ��� ���길 �����ϱ�.
		
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
					System.out.println("�߸��Է�");
				}
		
                 // swith
				switch(chk)
				{
					
					case 1: System.out.println(a+s); break;
					case 2: System.out.println(a-s); break;
					case 3: System.out.println(a*s); break;
					case 4: System.out.println(a/s); break;
					default: System.out.println("�߸��Է�"); break;
				}
				
	}

}
