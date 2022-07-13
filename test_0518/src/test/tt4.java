package test;

public class tt4 {
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
            		
    //----------------------------------------------------
            		
            		int hap2=0;
            		
            		for (int i=1; i<=100; i++)
            		{
            			if(i%2==0)
            			{
            			hap2=hap2+i;
            			}
            		}
            		System.out.println(hap2);
            		
    //------------------------------------------------------
            		int hap3=0;
            		for (int i=1; i<=100; i++)
            		{
            			if(i%4==0)
            			{
            				hap3=hap3+i;
            			}
            		}
            		System.out.println(hap3);
            		
            		
            		
            		
			}
}
