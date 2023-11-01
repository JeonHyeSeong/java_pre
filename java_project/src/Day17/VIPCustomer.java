package Day17;

public class VIPCustomer extends Customer{
	double saleRatio;
	
	public VIPCustomer() {}
	
	public VIPCustomer(int id, String name) {
		super(id, name);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}

	@Override
	public int calcPrice(int price) {
		super.calcPrice(price);
		return price - (int)(price*saleRatio);
	}
	


}
