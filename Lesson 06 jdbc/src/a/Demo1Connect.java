package a;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo1Connect {

	public static void main(String[] args) {

		String url = "jdbc:derby://localhost:1527/db2";

		try (Connection con = DriverManager.getConnection(url + ";create=true");) {
			System.out.println("connected to: " + url);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("disconnected from: " + url);
	}

}
