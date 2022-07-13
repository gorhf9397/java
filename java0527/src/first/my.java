package first;

public class my extends Father {
	my(int num)
	{
		super(num);
		//부모클래스의 생성자에 매개변수가 있는데
		// 매개변수를 전달안하면 에러
		System.out.println("my");
	}

}
