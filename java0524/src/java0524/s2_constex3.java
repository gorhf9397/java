package java0524;

public class s2_constex3 {
	//생성자는 이름이 같게 설계할 수 있다.
	//단 구분쇨수 있는 것 => 매개변수의 갯수와 자료형
	//매개변수의 갯수가 같다면 자료형이 틀려야 된다.
	
	s2_constex3(){}
	s2_constex3(int a){System.out.println("int");}
	s2_constex3(byte b){System.out.println("byte");}
	
	s2_constex3(int a, int b, int c){}
	s2_constex3(String a, int b, int c){}
	s2_constex3(double a, int b, int c){}
	
	

}
