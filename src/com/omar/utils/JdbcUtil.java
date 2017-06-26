package com.omar.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUtil {
	
	public static final String DRIVER="com.mysql.jdbc.Driver";
	public static final String URL="jdbc:mysql://localhost:3306/fgw";
	public static final String USER="root";
	public static final String PSD="root";
	
	
	static{
		try {
			Class.forName(DRIVER);//注册驱动
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection(){
		try {
			return DriverManager.getConnection(URL, USER, PSD);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static void free(ResultSet rs,Statement stmt,Connection conn){
		//释放资源
		try {
			if(rs!=null)
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}finally{
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
