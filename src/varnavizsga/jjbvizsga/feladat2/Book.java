package varnavizsga.jjbvizsga.feladat2;

public class Book {

	private int id;
	private String author;
	private String title;
	private int price;
	private boolean onSale;



	public Book(int id, String author, String title, int price, boolean onSale) {
		this.id = id;
		this.author = author;
		this.title = title;
		this.price = price;
		this.onSale = onSale;
	}

	public boolean isOnSale() {
		throw new UnsupportedOperationException();
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

	public boolean setOnSale(boolean onSale) {
		if (isOnSale()) {
			return true;
		}

		throw new UnsupportedOperationException();
	}

	public double getCurrentPrice() {
		if (this.onSale) {
			return this.getCurrentPrice()*(15/100);
		}else {
			double discount = 0.15;
			double discountValue = this.getCurrentPrice()*discount;
			double result = this.getCurrentPrice()-discountValue;
			
			return result;
		}
		//throw new UnsupportedOperationException();
	}
	
	public void WriteBookDetails() {
		
		System.out.println(this.author+" - "+ this.title+" : "+this.price );
		
	}

	


	
	

}
