package java0517;

import java.util.Scanner;

public class true1 {

	public static void main(String[] args) {
		// ���ϴ� �޴��� ���� ���ڷ� �Է¹޴´�
				// 1:¥��� , 2:�쵿 , 3:«�� , 4:������
		
		System.out.println("1:¥��� , 2:�쵿 , 3:«�� , 4:������ ");
        Scanner in=new Scanner (System.in);
        
        int chk=in.nextInt();
        
        
        if(chk==1)
        {
		System.out.println("¥��� �ֹ� ���Ծ��");
        }
        else if(chk==2)
        {
		System.out.println("�쵿 �ֹ� ���Ծ��");
        }
        else if(chk==3)
        {
		System.out.println("«�� �ֹ� ���Ծ��");
        }
        else if(chk==4)
        {
		System.out.println("������ �ֹ� ���Ծ��");
        }
        else
        {
		System.out.println("�ȹٷ� �ֹ� �ϼ���");
        }
		

	}

}
