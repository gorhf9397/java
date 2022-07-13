package java0707;

import java.util.Random;

public class lotto {
	public static void main(String[] args) {
		
	int[] lotto=new int[6];
	Random rand=new Random();
	int k=0;
	for(int i=0;i<lotto.length; i++) {
		lotto[i]=rand.nextInt(45)+1;
		for(int j=0;j<=i-1;j++) {
			if(lotto[i]==lotto[j]) 
				i--;
		}
		k++;
	}
	for(int i=0; i<lotto.length; i++) {
		System.out.print(lotto[i]+" ");
	}
	
	}
}
// 예제 lotto로 본 배열의 중복값 제거
