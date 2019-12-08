package a;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo2Statement {

	public static void main(String[] args) {

		String url = "jdbc:derby://localhost:1527/db2";
		String sql = "create table person(id int primary key, name varchar(10), age int)";

		try (Connection con = DriverManager.getConnection(url)) {
			// get a statement to send sql commands
			Statement stmt = con.createStatement();
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			System.out.println(sql);
		}
	}

}
