import java.util.Scanner;

public class input2 {

	public static void main(String[] args) {
		// ����, ����, ���� 3������ ���� �Է¹ޱ�
		
		//������ ���� ���
		
		//������ ����� ���
		System.out.println("��������");
		int x,y,z;
		
		
		Scanner in=new Scanner(System.in);
		x=in.nextInt();
		y=in.nextInt();
		z=in.nextInt();
		
		System.out.println("������ �հ��"+(x+y+z));
		System.out.println("������ �����"+(x+y+z)/3);
	}

}
