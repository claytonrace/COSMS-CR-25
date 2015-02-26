package abstract_homework;

public class Tradebook extends Book{
	
	public Tradebook()
	{
		super();
	}
	
	public Tradebook(String t, String a, String i, double p)
	{
		super(t, a, i, p);
	}

	@Override
	public double getRetailPrice() {
		double sales_price = getPrice() * 1.15;
		return sales_price;
	}

}
