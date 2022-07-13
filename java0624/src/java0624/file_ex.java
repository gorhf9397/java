package java0624;

import java.io.File;

public class file_ex {

	public static void main(String[] args) {
		
		File file=new File("c:/windows"); //생성자에는 폴더나 파일을 인수로 전달
		
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());
		System.out.println(file.exists());
		String[] str=file.list();
		
		for(int i=0; i<str.length;i++)
		System.out.println(file.list());

	}

}
