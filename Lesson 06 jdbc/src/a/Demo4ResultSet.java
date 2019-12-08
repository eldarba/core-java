package a;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo4ResultSet {

	public static void main(String[] args) {

		String url = "jdbc:derby://localhost:1527/db2";

		String sql1 = "select * from person";

		try (Connection con = DriverManager.getConnection(url)) {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql1); // the select results are here

			while (rs.next()) {
				int id = rs.getInt("id");
//				int id = rs.getInt(1); // column index - starts at 1
				String name = rs.getString("name");
				int age = rs.getInt("age");
				System.out.println(id + ", " + name + ", " + age);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			System.out.println(sql1);
		}
	}

}
