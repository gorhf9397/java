package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class second {

	public static void main(String[] args) throws Exception {
	
		Class.forName("com.mysql.jdbc.Driver");
		String db="jdbc:mysql://localhost:3306/first";
		Connection conn=DriverManager.getConnection(db , "root", "1234");
		
		Scanner sc=new Scanner(System.in);
		
		String bunho=sc.next();
		String name=sc.next();
		String phone=sc.next();
		int age=sc.nextInt();
		
		String sql="insert into member(bunho, name, phone, age) values('"+bunho+"','"+name+"','"+phone+"',"+age+")";
		
		Statement stmt=conn.createStatement();
		stmt.execute(sql);
		
		conn.close();
		stmt.close();

	}
	}
