package store;

public class Test {

	public static void main(String[] args) {

		Store store = new Store();

		store.addBook(new Book("book1", "eldar", 55));
		store.addBook(new Book("book2", "Dan", 99));
		store.addBook(new Book("book3", "Rinna", 70));

		store.addCd(new CD("cd1", "band1", 88));
		store.addCd(new CD("cd2", "band2", 105.75));

		System.out.println(store.getBook("book1"));
		System.out.println(store.getBook("book100"));

		System.out.println(store.getCd("cd1"));
		System.out.println(store.getCd("cd100"));
	}

}
