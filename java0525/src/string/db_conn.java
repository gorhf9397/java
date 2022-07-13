package string;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class db_conn {

	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver");
		String db="jdbc:mysql://localhost:3306/first";
		Connection conn=DriverManager.getConnection(db,"root","12345");
		
		
	
	}

}
