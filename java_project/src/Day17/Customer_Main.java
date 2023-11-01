package Day17;

public class Customer_Main {

	public static void main(String[] args) {
		
		Customer c = new Customer(111,"홍길동");
		GoldCustomer g = new GoldCustomer(222,"홍길순");
		VIPCustomer v = new VIPCustomer(333,"이길동");

		Customer[] customerList = new Customer[10];
		// 업캐스팅 => 형변환 자동으로 가능.
		int cnt = 0;
		customerList[cnt] = c;
		cnt++;
		customerList[cnt] = g;
		cnt++;
		customerList[cnt] = v;
		cnt++;
		
		System.out.println("--고객정보 출력--");
		for(int i = 0; i < cnt; i++) {
			customerList[i].customerInfo();
		}
		
		System.out.println("--구매금액과 할인율 계산--");
		int price = 10000;
		for(int i = 0; i < cnt; i++) {
			System.out.println(customerList[i].customerName+"님의 구매금액은 : "+
		customerList[i].calcPrice(price)+"원 입니다."
		+" 포인트는 "+customerList[i].bonusPoint+"점 입니다.");
			
		}
		
		
		
		
//		int price = c.calcPrice(10000);
//		c.customerInfo();
//		System.out.println(c.customerName+"님의 구매금액은 : "+price+"원 입니다.");
//		
//		int price1 = g.calcPrice(10000);
//		System.out.println("-----------------");
//		g.customerInfo();
//		System.out.println(c.customerName+"님의 구매금액은 : "+price1+"원 입니다.");
//		
//		int price2 = v.calcPrice(10000);
//		System.out.println("-----------------");
//		v.customerInfo();
//		System.out.println(v.customerName+"님의 구매금액은 : "+price2+"원 입니다.");

	}

}
