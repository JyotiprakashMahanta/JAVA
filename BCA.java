import java.sql.*;
public class BCA
	{
	public static void main(String args[])
		{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection cn=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","system","mahanta");
		
			if(cn!=null)
			{
			System.out.println("object is constructed");
			}
			cn.close();
		}
		catch(ClassNotFoundException ce)
			{
			System.out.println("class found");
			}
			catch(SQLException se)
			{
			se.printStackTrace();
			}
		}
	}