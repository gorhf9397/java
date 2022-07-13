package first;

public class s2_sungjuk_main {

	public static void main(String[] args) {
		s2_sungjuk s=new s2_sungjuk();
		// private인 변수에 값을 주기 위해서
		// public 인 메소드를 이용한다.
		// s.kor=99; private은 안된다
		s.input(80, 90, 70);
		s.cal();
		int avg=s.avgreturn();
		int hap=s.hapreturn();
		System.out.println(avg);
		System.out.println(hap);
		
		

	}

}
