package java0603;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class DB_all {
	
	public void insert() throws Exception
	{
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
	public void select() throws Exception
	{
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
			System.out.print(rs.getString("bunho")+" ");
			System.out.print(rs.getString("name")+" ");
			System.out.print(rs.getString("phone")+ " ");
			System.out.print(rs.getInt("age")+" ");
			System.out.println();
		}

	}
	public void delete() throws Exception
	{
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
					System.out.print(rs.getInt("bunho")+" ");
					System.out.print(rs.getString("name")+" ");
					System.out.print(rs.getString("phone")+" ");
					System.out.print(rs.getInt("bunho")+" ");
					System.out.println();
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
	}
	public void update() throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		String db="jdbc:mysql://localhost:3306/first";
		Connection conn=DriverManager.getConnection(db , "root", "1234");
		
		// 내용 보여주기
		String sql="select * from member";
		PreparedStatement pstmt=conn.prepareStatement(sql);
		ResultSet rs=pstmt.executeQuery();
		while(rs.next())
		{
			System.out.print(rs.getInt("bunho")+" ");
			System.out.print(rs.getString("name")+" ");
			System.out.print(rs.getString("phone")+" ");
			System.out.print(rs.getInt("age")+" ");
			System.out.println(); // 줄바꿈
		}
		
		//바꾸고 싶은 사람의 정보를 위의 출력된 내용을 보고 콘솔창에 입력
		Scanner sc=new Scanner(System.in);
		System.out.println("수정할 이름 : ");
		String name=sc.next();
		System.out.println("수정할 핸드폰번호 : ");
		String phone=sc.next();
		System.out.println("수정할 나이 : ");
		int age=sc.nextInt();
		System.out.println("수정할 번호 : ");
		int bunho=sc.nextInt();
		
		// 수정 쿼리
		String sql2="update member set name=?, phone=? , age=? where bunho=?";
		
		// 심부름꾼 생성
		PreparedStatement pstmt2=conn.prepareStatement(sql2);
		pstmt2.setString(1,name);
		pstmt2.setString(2, phone);
		pstmt2.setInt(3, age);
		pstmt2.setInt(4, bunho);
		
		// 쿼리 실행
		pstmt2.executeUpdate();
	}
		public void control() throws Exception
	    {
	    	 Scanner sc=new Scanner(System.in);
			 int chk=0;
			 do
			 {
				 switch(chk)
				 {
				    case 1: select(); break;
				    case 2: insert(); break;
				    case 3: delete(); break;
				    case 4: update(); break;
				 }
				 
				 System.out.print("1. 조회"+" ");
				 System.out.print("2. 입력"+" ");
				 System.out.print("3. 삭제"+" ");
				 System.out.print("4. 수정"+" ");
				 System.out.println("5. 종료");
			 }while((chk=sc.nextInt()) != 5);
	    }
	}



