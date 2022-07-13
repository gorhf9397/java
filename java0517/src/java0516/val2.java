package java0516;

public class val2 {

	public static void main(String[] args) {
		// 변수에 값을 넣기 => 변수 할당
		// 변수명 = 값; // '=' 를 할당연산자
		// 오른족에 있는값을 왼쪽 변수에 넣어라
		
		//선언
		byte chk;
		int kor;
		Sting name;
		
		//할당
		chk = 99;
		kor=100; // 숫자는 따음표가 없다
		name="홍길동"; // 문자열은 쌍따음표를 붙인다
		
		// 잘못된 할당 : 저장할 값과 저장공간의 자료형이 틀린다
		byte chk2;
		chk2 = 128; // 저장할 변수의 범위를 벗어난경우
		
		int eng;
		eng = "100";
		
		String juso;
		juso = 100; // 문자형에 숫자를 저장
		
		// 문자형에 숫자를 저장
		String bunho;
		bunho="1234";
	}

}
