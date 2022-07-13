package db0531;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class db_select {

	public static void main(String[] args) throws Exception{
		// mysql에 있는 member 테이블에있는 값을 가져오기
		// DB 연결
		
		Class.forName("com.mysql.jdbc.Driver");
		String db="jdbc:mysql://localhost:3306/first";
		Connection conn=DriverManager.getConnection(db , "root", "1234");
		
		// 쿼리문 작성
		String sql="select * from member";
		
		// 심부름꾼 생성
		Statement stmt=conn.createStatement();
		
		// 쿼리 실행
		ResultSet rs=stmt.executeQuery(sql);
		
		// 출력 => 여러개 출력 (for)
		// 레코드의 갯수를 알아내기;
		rs.last(); // 테이블의 레코드 끝으로 이동
		int n=rs.getRow();
		System.out.println(n);
		rs.beforeFirst();
		for(int i=1; i<=n; i++)
		{
			rs.next();
			System.out.println(rs.getString("bunho")+"  ");
			System.out.println(rs.getString("name")+"  ");
			System.out.println(rs.getString("phone")+ "  ");
			System.out.println(rs.getInt("age")+"  ");
		}
		// 첫번째 레코드로 이동
		/*rs.next();
		System.out.println(rs.getString("bunho")+"  ");
		System.out.println(rs.getString("name")+"  ");
		System.out.println(rs.getString("phone")+ "  ");
		System.out.println(rs.getInt("age")+"  ");
		
		// 두번째 레코드로 이동
		rs.next();
		System.out.println(rs.getString("bunho")+"  ");
		System.out.println(rs.getString("name")+"  ");
		System.out.println(rs.getString("phone")+ "  ");
		System.out.println(rs.getInt("age")+"  ");*/

	}

}
