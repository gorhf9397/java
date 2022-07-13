package java0517;

public class Array1 {

	public static void main(String[] args) {
		// 변수 : 하나의 값
		// 배열 : 동일한 자료형의 집합
		// 4개의 변수 만들기
		int c1,c2,c3,c4;
		c1=10;
		c2=20;
		c3=30;
		c4=40;
		System.out.println(c1+c2+c3+c4);
		
		// 4개의 변수의 집합 =>배열을 생성 => 자료형[] 배열형=new 자료형[크기];
		int[] cc=new int[4];
		cc[0]=10;
		cc[1]=20;
		cc[2]=30;
		cc[3]=40;
		System.out.println(cc[0]+cc[1]+cc[2]+cc[3]);
		
		

	}

}
