package string;

public class s1_stringex3 {

	public static void main(String[] args) {
		String card="4567-4561-7916-4616";
		// 잘라서 출력
		// split() : 특정문자로 잘라서 배열로 리턴
		String[] tt=card.split("-");
		
		
		for(int i=0; i<tt.length; i++)
		{
			System.out.println(tt[i]);
		}
		/*
		System.out.println(tt[0]);
		System.out.println(tt[1]);
		System.out.println(tt[2]);
		System.out.println(tt[3]);
		*/

	}

}
