package java0520;

public class s6_test {
	// 클래스의 멤버변수의 숫자형 변수는
	//객체가 생성될때 0으로 초기화
	
	
	int hap=0;
	
	public void input()
	{
		for(int i=1; i<=138; i++)
		{
			hap=hap+i;
		}
		System.out.println(hap);
	}
	
//-------------------------------------------------------
	
	int even=0;
	
	public void input2()
	{
		for(int e=1; e<=100; e++)
		{
				if(e%2==0)
				{
					even=even+e;
				}
		}
	}
	public void cal2()
	{
		System.out.println(even);
	}
//-------------------------------------------------------
	int num=0;
	public void input3()
	{
		for(int r=1; r<=100; r++)
		{
			if (r%4==0)
			{
				num=num+r;
			}
		}
	}
	public void cal3()
	{
		System.out.println(num);
	}
	

}
