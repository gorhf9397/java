package java0516;

import java.util.Scanner;

public class Input2 {

	public static void main(String[] args) {
		// kor, eng 숫자변수를 만들고 Scanner를 통해 값 입력하기
		
		// 출력 : kor과 eng값을 합하여 출력하기
		
		Scanner sc=new Scanner(System.in);
		// kor, eng 숫자변수를 만들기
		int kor;
		int eng;
		//Scanner를 통해 값 입력하기
		kor=sc.nextInt();
		eng=sc.nextInt();
		
		// 출력 : kor과 eng값을 합하여 출력
		System.out.println(kor+eng);
		
		

	}

}
