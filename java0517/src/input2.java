import java.util.Scanner;

public class input2 {

	public static void main(String[] args) {
		// 국어, 영어, 수학 3과목의 값을 입력받기
		
		//정수의 합을 출력
		
		//정수의 평균을 출력
		System.out.println("점수ㄱㄱ");
		int x,y,z;
		
		
		Scanner in=new Scanner(System.in);
		x=in.nextInt();
		y=in.nextInt();
		z=in.nextInt();
		
		System.out.println("점수의 합계는"+(x+y+z));
		System.out.println("점수의 평균은"+(x+y+z)/3);
	}

}
