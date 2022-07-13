package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class third {

	public static void main(String[] args) throws Exception {
	
		Class.forName("com.mysql.jdbc.Driver");
		String db="jdbc:mysql://localhost:3306/first";
		Connection conn=DriverManager.getConnection(db , "root", "1234");
		
		Scanner sc=new Scanner(System.in);
		
		String bunho=sc.next();
		String name=sc.next();
		String phone=sc.next();
		int age=sc.nextInt();
		
		String sql="insert into member(bunho, name, phone, age) values(?,?,?,?)";
		PreparedStatement pstmt=conn.prepareStatement(sql);
		
		pstmt.setString(1,bunho);
		pstmt.setString(2,name);
		pstmt.setString(3,phone);
		pstmt.setInt(4,age);
		pstmt.executeUpdate();
	}
}