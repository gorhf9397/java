package java0530;

public class Main {

	public static void main(String[] args) {

		//absteact abs=new absteact();
		// 추상클래스는 객체 생성을 하지 못한다..
		// 왜? 기능의 정의되지않은 메소드가 존재
		
		
		ateam a=new ateam();
		a.kor=70;
		a.check();
		bteam b=new bteam();
		b.kor=92;
		b.check();
		cteam c=new cteam();
		c.kor=100;
		c.check();
		
		
	}

}
