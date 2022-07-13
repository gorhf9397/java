package java0524;

public class s2_const {
			// 생성자 : 쿨래스와 이름이 동일한 메소드
			// 생성자는 클래스의 객체를 생성할 때 무조건 실행한다.
			// 생성자는 실행할 내용이 없다면 생략할 수 있다.
			// 생략을 하면 동작시 비어있는 생성자를 생성후 동작 시킨다.
			// 생성자의 실행은 객체 생성시 실행된다.
	s2_const()
	{
		System.out.println("생성자");
	}
	// 메소드는 언제 실행? => 객체 생성후에 호출에 의해 실행
	public void print()
	{
		System.out.println("메소드");
	}

}
