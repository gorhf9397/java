package example;

import java.util.Scanner;

public class example {

	public static void main(String[] args) {
		// ���忡 A��, B��, C��, D���� �ִٰ� ����
				// A�����Ͱ� �� ���̴� �ڸ���� �Ҷ� ���ɶ��� ���� �ڸ��� ��ġ�ϴ� ���α׷� �����
				// ���̸� �Է¹޾Ƽ� 20�̸��̸� A��, 20�̻� 30�̸��̸� B��
				// 30�̻� 40�̸��̸� C��, �������� D������ ����ϱ�
		
		Scanner in=new Scanner (System.in);
		
		int age=in.nextInt();
		
		if(age<20)
		{
			System.out.println("A�� �Դϴ�.");
		}
		else if(age<30)
		{
			System.out.println("B�� �Դϴ�.");
		}
		else if(age<40)
		{
			System.out.println("c�� �Դϴ�.");
		}
		else
		{
			System.out.println("D�� �Դϴ�.");
		}

	}

}
