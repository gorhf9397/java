package java0518;

public class s7_forif {

	public static void main(String[] args) {
		// 반복문 내에 if문
		// 1. i의 값이 짝수 일때만 실행
		for(int i=1; i<=10; i++)
		{
			if(i%2 == 0 ) //홀수 i%2 == 1
			{
			System.out.println(i+"안녕하세요");
			}
		}
		System.out.println("-------------------");
		// 2. i가 4의 배수일때 출력문 실행
		
		for(int i=1; i<=10; i++)
		{
			if(i%4 == 0 ) //배수는 나눌때 나머지가 0인게 배수
			{
			System.out.println(i+"안녕하세요");
			
			
			}
		}

	}

}
