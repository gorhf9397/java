package db0531;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class db_select2 {

	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver");
		String db="jdbc:mysql://localhost:3306/first";
		Connection conn=DriverManager.getConnection(db , "root", "1234");
		
		String sql="select * from member";
		
		Statement stmt=conn.createStatement();
		
		ResultSet rs=stmt.executeQuery(sql);
		
		// 출력 => 여러개 출력(While)
		// System.out.println(rs.next()); // 레코드 이동후 레코드가 존재하면 true, 아니면 false
		while(rs.next())
		{
			System.out.println(rs.getString("bunho")+"  ");
			System.out.println(rs.getString("name")+"  ");                                                                                                                                         
			System.out.println(rs.getString("phone")+ "  ");
			System.out.println(rs.getInt("age")+"  ");
		}

	}

}
