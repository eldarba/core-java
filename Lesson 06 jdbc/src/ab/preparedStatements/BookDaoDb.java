package ab.preparedStatements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BookDaoDb implements BookDao {

	private String url = "jdbc:derby://localhost:1527/db2";

	@Override
	public void add(Book book) {
		try (Connection con = DriverManager.getConnection(url);) {
			String sql = "insert into book(title, author, price) values (?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(sql);
			// set the ? params
			pstmt.setString(1, book.getTitle());
			pstmt.setString(2, book.getAuthor());
			pstmt.setDouble(3, book.getPrice());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Book get(int bookId) {
		try (Connection con = DriverManager.getConnection(url);) {
			String sql = "select * from book where id = ?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			// set the ? params
			pstmt.setInt(1, bookId);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				Book book = new Book(bookId);
				book.setAuthor(rs.getString("author"));
				book.setPrice(rs.getDouble("price"));
				book.setTitle(rs.getString("title"));
				return book;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public void update(Book book) {
		try (Connection con = DriverManager.getConnection(url);) {
			String sql = "update book set title = ?, author = ?, price = ? where id = ?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			// set the ? params
			pstmt.setString(1, book.getTitle());
			pstmt.setString(2, book.getAuthor());
			pstmt.setDouble(3, book.getPrice());
			pstmt.setInt(4, book.getId());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void delete(int bookId) {
		try (Connection con = DriverManager.getConnection(url);) {
			String sql = "delete from book where id = ?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			// set the ? params
			pstmt.setInt(1, bookId);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
