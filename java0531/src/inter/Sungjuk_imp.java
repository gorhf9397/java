package inter;

public class Sungjuk_imp implements sungjuk {
	// 구현클래스에 무조건 인터페이스의 추상메소드를 재정의 하여야 한다..
	
	@Override
	public void average()
	{
		System.out.println("평균");
	}
	
	@Override
	public void total()
	{
		System.out.println("총합");
	}
}
