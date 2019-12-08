package ab.preparedStatements;

public interface BookDao {

	// CRUD actions

	void add(Book book);

	Book get(int bookId);

	void update(Book book);

	void delete(int bookId);

}
