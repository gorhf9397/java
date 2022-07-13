package java0518;

public class s8_break {

	public static void main(String[] args) {
		// break, continue
		// for문에서 break사용
		
		/*for(int i=1; i<=10; i++)
		{
			System.out.println(i+"출력");
			if(i>2)
			{
			break;
			}
		}*/
		
		
		//for문에서 continue
		
		for(int i=1; i<=10; i++)
		{
			System.out.println(i+"출력");
			if(i%2 == 0)
			{
				continue;
			}
			System.out.println("하하하");
		}

	}

}
