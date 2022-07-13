package string;

public class s1_stringex {

	public static void main(String[] args) {
		
		String email="c@naver.com";
		
				// 아이디와 서버주소를 분리하여 출력하시오
				
		// @의 인덱스 값을 구하기
		int n=email.indexOf("@");
		
				String result=email.substring(0, n);
				String result2=email.substring(n+1);
				System.out.println(result);
				System.out.println(result2);

	}

}
