package abstract_homework;

public abstract class Book {
	
	String title;
	String author;
	String isbn;
	double price;
	
	public Book()
	{
		title = "";
		author = "";
		isbn = "";
		price = 0.0;
	}
	
	public Book(String t, String a, String i, double p)
	{
		title = t;
		author = a;
		isbn = i;
		price = p;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	public abstract double getRetailPrice();

}
