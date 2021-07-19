package test;

import java.sql.*;

public class sqlServer {
	
	static Connection connection;

	public static void main(String[] args) throws SQLException 
	{
		String url="jdbc:sqlserver://DESKTOP-CUU290R\\SACHINSQL;databaseName=students";
		String username="sa";
		String password="Asmita2025";
		
		try {
				//---------------Instantiate connection to sqlServer-----------//
				connection=DriverManager.getConnection(url,username,password);
				
				//---------------Create SQL statement in string -----------//	
//				System.out.println("Connction Successful....!");
//				String sql="insert into students_details (name, marks)"
//						+"values(?, ?)";
				//---------------Create statement instance & execute statement -----------//		
//				Statement statement=connection.createStatement();
//				int rows= statement.executeUpdate(sql);
				
				//---------------Set input data to be added in DB -----------//
//				PreparedStatement statement=connection.prepareStatement(sql);
//				statement.setString(1, "Sam");
//				statement.setInt(2, 80);
//				int rows= statement.executeUpdate();
//				
//				if(rows>0)
//				{
//					System.out.println("Row successfully inserted");
//				}
				
				
				String sql1="select * from students_details";
				Statement statement1=connection.createStatement();
				ResultSet result=statement1.executeQuery(sql1);
				int count=0;
				while(result.next())
				{
					count++;
					String name=result.getString("name");
					int marks=result.getInt("marks");
					System.out.printf("%d %s %d\n",count,name,marks);
				}
			} 
		catch (SQLException e) 
			{
				System.out.println("Connection Unsuccessful...!");
				e.printStackTrace();
			}
		
		finally
		{
			connection.close();
		}

	}

}
