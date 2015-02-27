package bookhomework;

public class Tradebook extends Book{
	
	String major;
	
	
	public Tradebook()
	{
		super();
		major = " ";
	}
	
	public Tradebook(String t, String a, String i, double p, String mj)
	{
		super(t, a, i, p);
		major = mj;
	}

	@Override
	public double getRetailPrice() {
		double sales_price = getPrice() * 1.15;
		return sales_price;
	}
	
	public String getInfo(){
		return major;
	}
	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

}
