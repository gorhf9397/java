package java0517;

import java.util.Scanner;

public class whrjs2 {

	public static void main(String[] args) {
		// ���̸� �Է¹޾Ƽ� 20�� �̻��̸�
		// "�������"���
		// 20�� �̸��̸� "������ ������"���
		
		
		Scanner in=new Scanner (System.in);
		
		System.out.println("���̸� �Է��� �ּ���");
		int age=in.nextInt();
		
		if(age>=20)
		{
			System.out.println("�������");
		}
		else
		{
			System.out.println("������ ������");
		}
		

	}

}
