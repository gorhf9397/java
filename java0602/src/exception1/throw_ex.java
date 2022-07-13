package exception1;

public class throw_ex {
	public void cal()
	{
		try
		{
		int hap=99;
		int n=0;
		int avg=hap/n;
		System.out.println(avg);
		}
		catch(ArithmeticException e)
		{
			System.out.println("0은 안돼");
		}
	}
	public void cal2() throws ArrayIndexOutOfBoundsException
	{
		int[] lot=new int[3];
		lot[3]=11;
	}
}
