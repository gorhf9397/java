package java0523;

public class s3_This_ex3 {
	
	//this 속석과 메소드를 다 부를수 있다
	
	int kor=100;
	
	public void test()
	{
		int kor=99;
		System.out.println(kor);
		System.out.println(this.kor);
		output();
	}
	
	public void output()
	{
		System.out.println("output");
		this.check();
	}
	
	public void check()
	{
		System.out.println("check");
	}

}
