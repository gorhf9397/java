package java0518;

public class s11_numberhap2 {

	public static void main(String[] args) {
		/*// 1부터 10까지의 합
		int hap=1+2+3+4+5+6+7+8+9+10;
		//1부터 100까지의 합
		int hap2=1+2+3+4+5+~~~~~+99+100;*/
		
		/*int hap;
		
		hap=1;
		hap=2;
		hap=3;
		hap=4; // 변수의 값을 입력하면 이전의 값은 사라진다*/
		
		
		//누적을 통해 이전의 값을 게속 전달한다
		
		/*int hap=0;
		
		hap=1;
		hap=hap+2;
		hap=hap+3;
		hap=hap+4;
		hap=hap+5;
		hap=hap+6;
		hap=hap+7;
		hap=hap+8;
		hap=hap+9;
		hap=hap+10;*/
		
		int hap=0;
				for(int i=1; i<=10; i++)
				{
					hap=hap+i;
				}
				System.out.println(hap);
		
	}
}


