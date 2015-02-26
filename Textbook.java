package abstract_homework;

public class Textbook extends Book {
	
	String course_number;
	
	
	public Textbook()
	{
		super();
		course_number = "";
	}
	
	public Textbook(String t, String a, String i, double p, String cn)
	{
		super(t, a, i, p);
		course_number = cn;
	}
	
	@Override
	public double getRetailPrice()
	{
		double sales_price = getPrice() * 1.1;
		return sales_price;
	}

	public String getCourse_number() {
		return course_number;
	}

	public void setCourse_number(String course_number) {
		this.course_number = course_number;
	}
}
