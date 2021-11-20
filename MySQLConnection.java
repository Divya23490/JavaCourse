package databaseConnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLConnection {

	public static void main(String[] args) throws SQLException {
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");//Register the Driver Class
		Statement stmt=conn.createStatement();//creating the statement
		String select="SELECT * FROM EMPLOYEES";//storing the my sql query inside string variable
		ResultSet rs=stmt.executeQuery(select);//executeQuery method will execute the query
		while(rs.next()) {
			int emp_id=rs.getInt("employee_id");
			String name=rs.getString("first_name");
			System.out.println(emp_id + " "+ name);
		}

	}

}
