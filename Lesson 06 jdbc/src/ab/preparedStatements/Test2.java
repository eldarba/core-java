package ab.preparedStatements;

public class Test2 {

	public static void main(String[] args) {

		BookDao dao = new BookDaoDb();
		Book book = dao.get(11111);
		System.out.println(book);

		book = dao.get(3);
		System.out.println(book);
	}

}
