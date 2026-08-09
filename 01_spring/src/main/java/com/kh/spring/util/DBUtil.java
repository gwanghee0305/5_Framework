package com.kh.spring.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	// * 오라클 DB 접속 정보
	// 접속 URL => jdbc:oracle:thin:@호스트이름:포트번호:xe --> 포트번호는 오라클 포트번호 사용 (sqldeveloper 에서 확인 가능)
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	// 사용자 명
	private static final String USER = "C##JDBC";
	// 비밀 번호
	private static final String PASSWORD = "JDBC";
	
	// *Connection 객체 생성 후 반환
	public static Connection getConnection() throws SQLException {
		Connection conn = null;
			// 드라이버 로드
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// Connection 객체 생성
			conn = DriverManager.getConnection(URL, USER, PASSWORD);	// 오류 이유 -> static으로 사용했기 때문에 필드부분도 static으로 변경해야 함
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		return conn;
	}
}
