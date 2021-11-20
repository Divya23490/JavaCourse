package databaseConnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertQuery {

	public static void main(String[] args) throws SQLException {
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");//Register the Driver Class
		Statement stmt=conn.createStatement();//creating the statement
		String s= "INSERT INTO EMPLOYEES(employee_id,first_name) VALUES(210,'Divya')";
		stmt.execute(s);
		conn.close();

	}

}
