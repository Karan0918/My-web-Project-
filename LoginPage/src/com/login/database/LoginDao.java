package com.login.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.login.bean.LoginBean;

public class LoginDao {
	private String url="jdbc:mysql://localhost:3306/mydb";
	private String username="root";
	private String password="1234";
	private String driver="com.mysql.cj.jdbc.Driver";
	public void loadDriver(String driver)
	{
		try
		{
			Class.forName(driver);
		}
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}
	public Connection getConnection()
	{
		Connection con=null;
		try {
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?useSSL=false",username,password);
			 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	public boolean validate(LoginBean loginbean) {
		// TODO Auto-generated method stub
		 loadDriver(driver);
		 boolean status=false;
		
		 try (Connection con=getConnection();
		
		
		
		PreparedStatement ps=con.prepareStatement("select * from login where username =? and password =?")){
			ps.setString(1, loginbean.getUsername());
			ps.setString(2, loginbean.getPassword());
			System.out.println(ps);
			ResultSet rs=ps.executeQuery();
			status=rs.next();
			System.out.println(status);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
		return status;
		
	}

}