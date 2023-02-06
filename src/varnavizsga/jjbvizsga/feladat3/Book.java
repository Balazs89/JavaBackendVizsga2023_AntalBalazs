package varnavizsga.jjbvizsga.feladat3;

public class Book {

	
	private int id;
	private String author;
	private String title;
	private int price;
	private boolean onSale;
	
	public Book(int id, String author, String title, int price, boolean onSale) {
		super();
		this.id = id;
		this.author = author;
		this.title = title;
		this.price = price;
		this.onSale = onSale;
	}

	public int getId() {
		return id;
	}

	public String getAuthor() {
		return author;
	}

	public String getTitle() {
		return title;
	}

	public int getPrice() {
		return price;
	}

	public boolean isOnSale() {
		return onSale;
	}
		
	
}
