package a;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo3Insert {

	public static void main(String[] args) {

		String url = "jdbc:derby://localhost:1527/db2";

		String sql1 = "insert into person values(103, 'David', 41)";
		String sql2 = "insert into person (id, name, age) values(104, 'Sarrah', 33)";

		try (Connection con = DriverManager.getConnection(url)) {
			Statement stmt = con.createStatement();
			stmt.executeUpdate(sql1);
			stmt.executeUpdate(sql2);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			System.out.println(sql1);
			System.out.println(sql2);
		}
	}

}
