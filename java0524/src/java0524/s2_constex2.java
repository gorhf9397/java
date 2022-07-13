package java0524;

public class s2_constex2 {
	
	//1~100까지의 합
	//1~b까지의 합
	//a~b까지의 합
	//위의 동작을 하는 클래스를 만들고자 한다
	//단. 값의 초기화는 생성자를 통해서 한다
	int a,b,hap;
	//1~100 초기화를 위한 매개변수x
	s2_constex2()
	{
		a=1;
		b=100;
	}
	//1~b 초기화를 위한 매개변수1개
	s2_constex2(int b)
	{
		a=1;
		this.b=b;
	}
	// a~b 초기화를 위한 매개변수2개
	s2_constex2(int a, int b)
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
		System.out.println(hap);
	}

}
