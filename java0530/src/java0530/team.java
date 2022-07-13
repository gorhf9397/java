package java0530;

public class team extends abstract2 {

	team(String name) 
	{	// 묵시적으로 생략 => 부모클래스의 생성자를 호출 =>super()
		super(name);// 부모클래스의 생성자
	}
	public void test()
	{
		System.out.println("재정의");
	}

		
	}


