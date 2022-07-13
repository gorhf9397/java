package sukja;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class sukja_insert {

	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver");
		String db="jdbc:mysql://localhost:3306/first";
		Connection conn=DriverManager.getConnection(db , "root", "1234");
		
		Scanner sc=new Scanner(System.in);
		
		String id=sc.next();
		String title=sc.next();
		String name=sc.next();
		String price=sc.next();
		int writeday=sc.nextInt();
				
		
		String sql="insert into book(id, title, name, price, writeday) values(?,?,?,?,?)";
		PreparedStatement pstmt=conn.prepareStatement(sql);
		pstmt.setString(1,id);
		pstmt.setString(2,title);
		pstmt.setString(3,name);
		pstmt.setString(4,price);
		pstmt.setInt(5,writeday);
		pstmt.executeUpdate();
		
		//stmt.close();
		//conn.close();

	}

}
