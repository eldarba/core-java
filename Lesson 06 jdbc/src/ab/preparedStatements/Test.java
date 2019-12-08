package ab.preparedStatements;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		List<Book> books = new ArrayList<>();

		books.add(new Book("aaa", "authorAaa", 32));
		books.add(new Book("bbb", "authorBbb", 111));
		books.add(new Book("ccc", "authorCcc", 555));
		books.add(new Book("ddd", "authorDdd", 23.65));
		books.add(new Book("eee", "authorEee", 32.87));

		BookDao dao = new BookDaoDb();
		for (Book book : books) {
			dao.add(book);
		}
		System.out.println("books added");
	}

}
