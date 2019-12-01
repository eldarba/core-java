package store;

public class Store {

	private CD[] cds = new CD[10];
	private Book[] books = new Book[10];

	/**
	 * adds the specified cd to the store.
	 * 
	 * @param cd the cd to be added
	 */
	public void addCd(CD cd) {
		for (int i = 0; i < cds.length; i++) {
			if (cds[i] == null) {
				cds[i] = cd;
				return; // out of method
			}
		}
		System.out.println("the cds stock is full: " + cds.length);
	}

	/**
	 * adds the specified book to the store.
	 * 
	 * @param book the book to be added
	 */
	public void addBook(Book book) {
		for (int i = 0; i < books.length; i++) {
			if (books[i] == null) {
				books[i] = book;
				return; // out of method
			}
		}
		System.out.println("the books stock is full: " + books.length);
	}

	/**
	 * returns the specified CD.
	 * 
	 * @param the wanted cd
	 * @return the wanted cd or null if not found.
	 */
	public CD getCd(CD cd) {
		for (int i = 0; i < cds.length; i++) {
			// check the current element
			if (cds[i] != null && cds[i].equals(cd)) {
				return cds[i];
			}
		}

		return null; // cd not found
	}

	/**
	 * returns the specified Book.
	 * 
	 * @param the wanted book
	 * @return the wanted book or null if not found.
	 */
	public Book getBook(Book book) {
		for (int i = 0; i < books.length; i++) {
			// check the current element
			if (books[i] != null && books[i].equals(book)) {
				return books[i];
			}
		}

		return null; // book not found
	}

}
