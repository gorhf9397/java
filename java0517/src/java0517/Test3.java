package java0517;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		// ���ϴ� �޴��� ���� ���ڷ� �Է¹޴´�
		// 1:¥��� , 2:�쵿 , 3:«�� , 4:������
		
		Scanner in=new Scanner (System.in);
		
		System.out.println("¥��� �ֹ� ���Ծ��");
		System.out.println("�쵿 �ֹ� ���Ծ��");
		System.out.println("«�� �ֹ� ���Ծ��");
		System.out.println("������ �ֹ� ���Ծ��");
		System.out.println("�ȹٷ� �ֹ� �ϼ���");
		
		int a=in.nextInt();
		int s=in.nextInt();
		int d=in.nextInt();
		int f=in.nextInt();
		int g=in.nextInt();
				
		
		
		
		
		if(a==1)
		{
			System.out.println("¥��� �ֹ� ���Ծ��");
		}
		else if(s==2)
		{
			System.out.println("�쵿 �ֹ� ���Ծ��");
		}
		else if(d==3)
		{
			System.out.println("«�� �ֹ� ���Ծ��");
		}
		else if(f==4)
		{
			System.out.println("������ �ֹ� ���Ծ��");
		}
		else
		{
			System.out.println("�ȹٷ� �ֹ� �ϼ���");
		}
		}

	}

