

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Conn {			
	public Connection getConnection() 
	
	{						
		String url = "jdbc:mysql://localhost:3306/smartmart";
		String user = "root";
		String pwd = "1234";
		Connection con = null ;			
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url,user,pwd);
			System.out.println("Connection Successfull!!!!!");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block	
				e.printStackTrace();		} 
		catch (SQLException e) {	
			// TODO Auto-generated catch block		
			e.printStackTrace();		}	
		return con;							
		}				
	
	}


	