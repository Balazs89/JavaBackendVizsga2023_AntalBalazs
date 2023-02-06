package varnavizsga.jjbvizsga.feladat3;

import java.util.ArrayList;
import java.util.List;

public class BookManager {

	List<Book> books = new ArrayList<Book>();

	public List<Book> CreatingTheList() {

		List<Book> books = new ArrayList<Book>();

		return books;
	}

	public void addBook(int id, String author, String title, int price, boolean onSale) {

		Book BookObj = new Book(id, author, title, price, onSale);
		books.add(BookObj);
		// throw new UnsupportedOperationException();

	}

	public int getBookCount() {
		return books.size();
	}
	

	public long getTotalPrice() {
		long sum=0;
		for (Book book : books) {
			sum +=book.getPrice();
		}
		return sum;
	}
	

	public int countOnSale() {
		int numberOfBooksOnSale = 0;
		for (Book book : books) {
			if (book.isOnSale()) {
				numberOfBooksOnSale++;
			}
		}
		return numberOfBooksOnSale;
		
		
		//throw new UnsupportedOperationException();
	}
}
