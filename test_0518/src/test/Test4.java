package test;

public class Test4 {

	public static void main(String[] args) {
		// 1부터 138까지의 합을 구하기

		// 1부터 100까지의 짝수의 합 구하기
		
		// 1부터 100까지의 4의 배수의 합 구하기
		
		
		int hap=0;
		for(int i=1; i<=138; i++)
		{
			hap=hap+i;
		}
		System.out.println(hap);
		
		
		
		System.out.println("------------------------");
		
		int even=0;
		
		for(int e=1; e<=100; e++)
		{
				if(e%2==0)
				{
					even=even+e;
				}
		}
		System.out.println(even);
			
			
			
			
			System.out.println("------------------------");
			
			int num=0;
			for(int r=1; r<=100; r++)
			{
				if (r%4==0)
				{
					num=num+r;
				}
			}
			System.out.println(num);
		
		
		
	}

}
