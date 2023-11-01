package Day17;

public class GoldCustomer extends Customer{
	double saleRatio; // 할인율
	
	public GoldCustomer() {}

	public GoldCustomer(int id, String name) {
		super(id,name);
		customerGrade = "Gold";
		bonusRatio = 0.02;
		saleRatio = 0.1;
	}

	@Override
	public int calcPrice(int price) {
		super.calcPrice(price);
		//bonusRatio += (int)(price * bonusRatio);
		return price - (int)(price*saleRatio);
	}

	public double getSaleRatio() {
		return saleRatio;
	}

	public void setSaleRatio(double saleRatio) {
		this.saleRatio = saleRatio;
	}

	
	
	
	

}
