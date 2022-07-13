package inter;

public class sungjuk_main {

	public static void main(String[] args) {
		//인터페이스는 객체를 생성하지 못한다
		//Sungjuk su=new Sungjuk();
		//인터페이스는 구현한 클래스의 객체를 생성 후 사용한다.
		Sungjuk_imp si=new Sungjuk_imp();
		si.average();
		si.total();

	}

}
