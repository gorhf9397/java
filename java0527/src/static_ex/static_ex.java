package static_ex;

public class static_ex {
	
	int kor;
	static int eng;
	
	public void output()
	{
		System.out.println(kor);
		System.out.println(eng);
		System.out.println("output");
	}
	public static void print()
	{
		// static 메소드에서는 static변수만 사용가능
		//System.out.println(kor);
		System.out.println("print");
	}

}
