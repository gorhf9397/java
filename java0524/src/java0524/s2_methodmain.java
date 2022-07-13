package java0524;

public class s2_methodmain {

	public static void main(String[] args) {
		
		s2_method m=new s2_method();
		m.output();
		//다른 클래스에서는 메소드를 호출하려면
		//해당 클래스의 객체를 생성한 뒤
		//객체,메소드()통해서 호출
		m.test();

	}

}
