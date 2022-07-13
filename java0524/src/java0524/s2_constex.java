package java0524;

public class s2_constex {

	// a부터b까지의 합을 구해서 출력하는 클래스
	// - a,b값을 생성자를 통해 초기화
	// 합을 구하는 메소드, 출력하는메소드 2개를 생성
	
	int a,b,hap;

	s2_constex(int a ,int b)
	{
		this.a=a;
		this.b=b;
	}
	public void cal()
	{
		for(int i=a; i<=b; i++)
		{
			hap=hap+i;
		}
	}
	public void output()
	{
		System.out.println("a+b의값은 "+hap);
	}
}
