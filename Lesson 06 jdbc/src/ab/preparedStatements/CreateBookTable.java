package ab.preparedStatements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateBookTable {

	public static void main(String[] args) {
		String url = "jdbc:derby://localhost:1527/db2";

		String sql = "create table book(";
		sql += "id int primary key GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1), ";
		sql += "title varchar(25), ";
		sql += "author varchar(25), ";
		sql += "price float) ";
		try (Connection con = DriverManager.getConnection(url)) {
			Statement stmt = con.createStatement();
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			System.out.println(sql);
		}
	}

}
