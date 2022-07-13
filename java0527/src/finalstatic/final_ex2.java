package finalstatic;

public class final_ex2 {
	// fianl 은 더 이상 변수의 값을 변경시키지 못한다
	// 초기에 값을 주지 않으면 에러
	final int kor=99;
	// 초기에 값을 주지 못할경우도 있다..
	// 생성자를 통해 값을 줄수 있다.
	final int eng;
	final_ex2(int eng)
	{
		this.eng=eng;
	}

}
