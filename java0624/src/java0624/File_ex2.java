package java0624;

import java.io.File;

public class File_ex2 {

	public static void main(String[] args) {
		
		File file=new File("C:\\Users\\Administrator\\file_ex.java");
		
		//file 이름을 변경
		File file2=new File("C:\\Users\\Administrator\\aaa.java");
		file.renameTo(file2);
		
		System.out.println(file2.exists());
		
		System.out.println(file2.length());
		
		if(file2.exists())
		file2.delete();

	}

}
