package java0524;

public class s2_methodover {
	int avg;
	public void average(int a)
	{
		avg=a;
		System.out.println("평균 : "+avg);
	}
	public void average(int a,int b)
	{
		avg=(a+b)/2;
		System.out.println("평균 : "+avg);
	}
	public void average(int a, int b,int c)
	{
		avg=(a+b+c)/3;
		System.out.println("평균 : "+avg);
	}

}
