package sukja;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class sukja_select {

	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver");
		String db="jdbc:mysql://localhost:3306/first";
		Connection conn=DriverManager.getConnection(db , "root", "1234");
		
		String sql="select * book";
		
		Statement stmt=conn.createStatement();
		
		ResultSet rs=stmt.executeQuery(sql);
		
		rs.last();
		int n=rs.getRow();
		System.out.println(n);
		rs.beforeFirst();
		for(int i=1; i<=n; i++)
		{
			rs.next()
			System.out.println(rs.getString);
		}
		
		
		
		

	}

}
