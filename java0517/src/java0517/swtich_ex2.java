package java0517;

import java.util.Scanner;

public class swtich_ex2 {

	public static void main(String[] args) {
		// ���忡 A��, B��, C��, D���� �ִٰ� ����
		// A�����Ͱ� �� ���̴� �ڸ���� �Ҷ� ���ɶ��� ���� �ڸ��� ��ġ�ϴ� ���α׷� �����
		// ���̸� �Է¹޾Ƽ� 20�̸��̸� A��, 20�̻� 30�̸��̸� B��
		// 30�̻� 40�̸��̸� C��, �������� D������ ����ϱ�
		
		Scanner sc=new Scanner (System.in);
		int age=sc.nextInt();
		
		if(age <= 19)
		{
			System.out.println("A�� �Դϴ�.");
		}
		else if(age>=20 && age>30)
		{
			System.out.println("B�� �Դϴ�.");
		}
		else if(age>=30 && age>40)
		{
			System.out.println("C�� �Դϴ�");
		}
		else
		{
			System.out.println("D�� �Դϴ�");
		}
		//switch
		int chk=age/10;
		//20�̸� => 0,1
		//20~30�̸� => 2
		//30~40�̸� => 3
		switch(age)
		{
		case ?: System.out.println(); break;
		case ?: System.out.println("B"); break;
		case ?: System.out.println("C"); break;
		default: System.out.println("D"); break;
		}
		

	}

}
