package java0708;

public class test_not {
	public static void main(String[] args) {
			int kor=90;
			int eng=90;
			
			if(!(kor>=80 || eng>=80) ) {  //not
				System.out.println("집사준다");
			}else {
				System.out.println("안사준다");
			}
	}
}
