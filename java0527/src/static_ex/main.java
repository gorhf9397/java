package static_ex;

public class main {

	public static void main(String[] args) {
		
		// static 이 부여된 변수와 메소드는
		// 객체생성(instance) ㅇ벗이 사용가능
		// static => 정적
		// 사용방법 => 클래스명.static변수 
				//   클래스명.static메소드
		static_ex.eng=99;
		static_ex.print();
		
		//static_ex.kor=88;
		//static_ex.output();
		//kor,output()는 static X => 객체 생성후 사용
		static_ex se=new static_ex();
		se.kor=88;
		se.output();

	}

}
