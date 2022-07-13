package java0523;

public class s3_This_ex1 {
	//매개변수로 필요한 값을 가져올때
	// this : 현재 클래스의 별칭
	int kor,eng,mat;
	
	public void input(int kor, int eng,int mat)
	{
				this.kor=kor;  //this 는 class를 가리킨다
				this.eng=eng;
				mat=mat;
	}
	//변수를 호출할때
	public void output()
	{
		System.out.println(kor+eng+mat);
	}

}
