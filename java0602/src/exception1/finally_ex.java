package exception1;

public class finally_ex {

	public static void main(String[] args) {
		int hap=99;
		int n=0;
		
		
		try
		{
			int avg=hap/n;
			System.out.println(avg);
		}
		catch(ArithmeticException e)
		{
			// e.printStackTrace();
			System.out.println("0으로 나누면 안되요");
		}
		finally // 예외가 있든 없든 무조건 실행된다.
		{
			System.out.println("언제 실행될까요??");
		}
		
		System.out.println("계속 실행중");

	}

}
