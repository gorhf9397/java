package java0523;

public class s4_para_test {
	
	// 매개변수로는 모든 자료형이 가능하다 => byte,short,int,long,float,double,char,boolean
	// 객체도 가능하다 => 배열, String을 포함한 모든 클래스
	
	byte a;
	short b;
	int c;
	long d;
	public void test1(byte a, short b , int c ,long d)
	{
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
	}

	
	char s;
	public void test2(char s)
	{
		this.s=s;
	}
	
	float f;
	double dd;
	public void test3(float f, double dd)
	{
		this.f=f;
		this.dd=dd;
	}
	
	boolean t;
	public void test4(boolean t)
	{
		this.t=t;
	}
	
	//배열을 매개변수로
	int[] lotto;
	public void test5(int[]lotto)
	{
		this.lotto=lotto;
		for(int i=0; i<lotto.length; i++)
		{
			System.out.println(lotto[i]);
		}
	}
	
	//클래스를 매개변수로
	
	public void test6(s4_databox db)
	{
		System.out.println(db.name);
		System.out.println(db.age);
		System.out.println(db.juso);
		System.out.println(db.height);
		System.out.println(db.kor);
	}
	
	
}
