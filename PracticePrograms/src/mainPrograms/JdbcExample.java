package mainPrograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class JdbcExample {
	
		String username="hr";
		String password="hr123";
		Statement stmt=null;
		Connection con;
		String host="jdbc:oracle:thin:@hr.cwjgdp1wxdy2.us-west-1.rds.amazonaws.com:1521:orcl";
	
		public JdbcExample()
		{
			
		}
		
		public Connection getCon(){
		if(con==null){	
		try{
			Class.forName("Oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver loaded");
			con=DriverManager.getConnection(host,username,password);
			setCon(con);
			}catch(Exception e)
		{
				e.printStackTrace();
		}
			return con;
			
		}else
		{
		return con;
		
	}
		}

		public void setCon(Connection con) 
		{
		this.con=con;	
		}
}

