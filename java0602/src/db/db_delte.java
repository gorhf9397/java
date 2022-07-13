package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class db_delte {

	public static void main(String[] args)throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver");
		String db="jdbc:mysql://localhost:3306/first";
		Connection conn=DriverManager.getConnection(db , "root", "1234");
		
		// 삭제할 수 있도록 현재 테이블의 내용을 출력하기
		String sql2="select * from member";
				PreparedStatement pstmt2=conn.prepareStatement(sql2);
		// 읽어오기
				ResultSet rs=pstmt2.executeQuery();
				while(rs.next())
				{
					System.out.println(rs.getInt("bunho")+" ");
					System.out.println(rs.getString("name")+" ");
					System.out.println(rs.getString("phone")+" ");
					System.out.println(rs.getInt("bunho")+" ");
				}
		
		// 쿼리문
		String sql="delete from member where bunho=?";
		
		// 삭제할 레코드의 bunho값을 입력하기
		Scanner sc=new Scanner(System.in);
		System.out.println("삭제하고자 하는 번호를 입력");
		int bunho=sc.nextInt();
		
		// 2번 심부름꾼
		PreparedStatement pstmt=conn.prepareStatement(sql);
		pstmt.setInt(1, bunho);
		
		// 쿼리 실행
		pstmt.executeUpdate();
		
		// close
		sc.close();
		pstmt.close();
		conn.close();

	}

}
