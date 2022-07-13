package java0523;

import java.util.Scanner;

public class s1_sungjuk {
	// 1. 국,영,수 성적을 입력하여 평균과 총점을 구해주는 프로그램 작성하기
		//4개의 클래스를 만들어서 작업
	
	// 1. 매개변수X, 리턴값X
	
	Scanner sc=new Scanner(System.in);
	
	int kor,eng,mat,hap,avg;
	// 1. 매개변수X, 리턴값X
	public void input()
	{
		kor=sc.nextInt();
		eng=sc.nextInt();
		mat=sc.nextInt();
	}
	public void cal()
	{
		hap=kor+eng+mat;
		avg=hap/3;
	}
	public void output()
	{
		System.out.println(hap);
		System.out.println(avg);
	}
	
//--------------------------------------------------------------
	// 2. 매개변수ㅇ 리턴값x
	public void input2(int k,int e,int m)//매개변수로 넘어오는 값을 저장
	{
		kor=k;
		eng=e;
		mat=m;
	}
	public void cal2()
	{
		hap=kor+eng+mat;
		avg=hap/3;
	}
	public void output2()
	{
		System.out.println(hap);
		System.out.println(avg);
	}
	
//--------------------------------------------------------------
	
	// 3. 매개변수x 리턴값ㅇ
	public void input3()
	{
		kor=sc.nextInt();
		eng=sc.nextInt();
		mat=sc.nextInt();
	}
	public void cal3()
	{
		hap=kor+eng+mat;
		avg=hap/3;
	}
	// 출력하지 않고 값을 리턴해주기
	// 총점의 값을 리턴해주는 메소드
	public int hapreturn()
	{
		return hap;
	}
	// 평균의 값을 리턴해주는 메소드
	public int avgreturn()
	{
		return avg;
	}
//-----------------------------------------------------------------
	
	// 4. 매개변수ㅇ 리턴값ㅇ
	
	public void input4(int k, int e, int m)
	{
		kor=k;
		eng=e;
		mat=m;
	}
	public void cal4()
	{
		hap=kor+eng+mat;
		avg=hap/3;
	}
	// 출력하지 않고 값을 리턴해주기
	// 총점의 값을 리턴해주는 메소드
	public int hapreturn2()
	{
		return hap;
	}
	// 평균의 값을 리턴해주는 메소드
	public int avgreturn2()
	{
		return avg;
	}
	
	
	

}
