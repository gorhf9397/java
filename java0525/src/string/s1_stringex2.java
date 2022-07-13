package string;

public class s1_stringex2 {

	public static void main(String[] args) {
		String phone="010-1234-5678";
		//앞자리, 중간, 뒷자리를 구분하여 출력
		int n=phone.indexOf("-");
		int m=phone.lastIndexOf("-");
		
		String result=phone.substring(0,n);
		String result2=phone.substring(n+1,m);
		String result3=phone.substring(m+1);
		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);

	}

}
