package task23;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcConnectivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Step 1: Database connection details
		
		String db_url="jdbc:mysql://localhost:3306";
		String user="root";
		String password="Admin123@";
		//Step 2: Establish the connection
		try {
			Connection connection=DriverManager.getConnection(db_url, user, password);
		// Step 3: Check connection is sucessful
				
			if(connection!=null) {
				
				System.out.println("Conection established");
			} else {
				
				System.out.println("Issue in connecting");
			}
			
			// Step 4: Perform operation
			
			Statement stmt = connection.createStatement();
			
			String createDB="create database db_task23";	
			
			String use= "use db_task23";
			
			String createTable="create table employe_task23 (empcod int, empnam varchar(10), empag int, esalar int)";
			
			String insert="insert into employe_task23 values (101,'jenny',25,10000),(102,'jacky',30,20000),(103,'jeo',20,40000),(104,'john',40,80000),(105,'shameer',25,90000)";
			
			String select="select * from employe_task23";
			
			stmt.execute(createDB);
			
			stmt.execute(use);
			
            stmt.execute(createTable);
			
			stmt.executeUpdate(insert);
			
			// Selecting the data
			
			ResultSet rs = stmt.executeQuery(select);
			
			// iterate the result
			
			while(rs.next()) {
				
				System.out.println(rs.getInt("empcod")+" "+rs.getString("empnam")+" "+rs.getInt("empag")+" "+rs.getInt("esalar"));
				
			}
			
			// Step 5: Close the connection
			
			connection.close();
			
				
		}
		
		catch(SQLException e) {
			e.printStackTrace();
		}
	}

}

/* Out Put Of program
 * Conection established
101 jenny 25 10000
102 jacky 30 20000
103 jeo 20 40000
104 john 40 80000
 * 
 * 
 * */
 