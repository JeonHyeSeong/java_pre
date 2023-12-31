package product;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductManager implements ProductInterface{

	// 메뉴판을 저장하기위한 공간
	private ArrayList<Product> menu = new ArrayList<>();
	// 주문내역을 저장하기위한 공간
	private ArrayList<Order> order = new ArrayList<>();
	
	public void addMenu() {
		// 기본메뉴 구성
//		Product p = new Product("햄버거", 5000); 
//		menu.add(p);
		menu.add(new Product("햄버거", 5000));
		menu.add(new Product("피자", 15000));
		menu.add(new Product("음료", 2000));
		menu.add(new Product("사탕", 500));
		menu.add(new Product("과자", 1000));
	}
	
	@Override
	public void add(Scanner scan) {
		// 메뉴 추가
		// 객체는 하나의 메뉴당 한 객체 필요
		System.out.println("추가할 메뉴를 입력해주세요");
		String menuName = scan.next();
		System.out.println("추가할 메뉴의 가격을 입력해주세요");
		int price = scan.nextInt();
		menu.add(new Product(menuName,price));
		System.out.println("메뉴가 추가되었습니다.");
		System.out.println();
	}
	
	@Override
	public void delete(Scanner scan) {
		// 메뉴 삭제 => 입력한 메뉴가 어디에 있는지 찾아서 삭제
		// list.remove(index), list.remove(Object)
		System.out.println("삭제할 메뉴를 입력해주세요");
		String menuName = scan.next();
//		for(int i = 0; i < menu.size(); i++) {
//			Product p = menu.get(i);
//			if(p.getMenu().equals(menuName)) {
//				menu.remove(i);
//			}
//		}
//		System.out.println("메뉴가 삭제되었습니다.");
//		System.out.println();
		
		int index = -1; // 0이면 없어도 0이 되버림
		for(int i = 0; i < menu.size(); i++) {
			if(menu.get(i).getMenu().equals(menuName)) {
				index = i; // 삭제할 index 확보
				//menu.remove(index); // index로 삭제
				menu.remove(menu.get(index)); // Object로 삭제
				System.out.println("삭제완료");
				return;
			}
		}
		if(index == -1) {
			System.out.println("찾는 메뉴가 없습니다.");
		}
	}

	@Override
	public void update(Scanner scan) {
		// 메뉴 수정
		// 수정할 메뉴를 받아서 해당 메뉴의 객체를 set
		System.out.println("가격을 변경할 메뉴를 선택하세요");
		String menuName = scan.next();
		System.out.println("변경할 가격을 입력하세요");
		int price = scan.nextInt();
//		for(int i = 0; i < menu.size(); i++) {
//			if(menu.get(i).getMenu().equals(menuName)) {
//				menu.set(i, new Product(menuName,price));
//			}
//		}
//		System.out.println("선택하신 메뉴의 가격이 변경되었습니다.");
//		
		int index = -1;
		for(int i = 0; i < menu.size(); i++) {
			if(menu.get(i).getMenu().equals(menuName)) {
				index = i;
				// 메뉴의 가격만 수정
				menu.get(i).setPrice(price);
				menu.set(i, new Product(menuName,price));
		        System.out.println("수정완료");
			}
		}
		if(index == -1) {
			System.out.println("찾는 메뉴가 없습니다.");
		}
		
	}

	@Override
	public void orderPick(String name, int count) {
		// 주문 => 매개변수로 값을 받을 경우
		// 메뉴와 수량을 입력받아 OrderList에 추가(new Order())
		// 메뉴에 해당하는 price가 없는 상태 => menuList에서 구해와야함.
//		Order or = new Order();
//		or.setMenu(name);
//		or.setCount(count);
//		
//		for(int i = 0; i < menu.size(); i++) {
//			if(name.equals(menu.get(i).getMenu())) {
//				or.setPrice(menu.get(i).getPrice());
//				or.setTotal(or.getPrice()*count);
//			}
//		}
//		order.add(or);
		
		int index = -1;
		for(int i = 0; i < menu.size(); i++) {
			if(menu.get(i).getMenu().equals(name)) {
				index = i;
				int price = menu.get(i).getPrice();
				Order tmp = new Order(name, price, count);
				//tmp.setTotal(price*count); // 생성자에 없다면...
				order.add(tmp);
				return;
			}
		}
		if(index == -1) {
			System.out.println("없는 메뉴 입니다.");
		}
		
	}

	@Override
	public void printOrder() {
		// 주문내역 출력
		System.out.println("--주문내역--");
		int sum = 0;
		for(int i = 0; i < order.size(); i++) {
			order.get(i).print();
			sum += order.get(i).getTotal(); 
		}
		System.out.println("------------------");
		System.out.println("총 금액 : "+sum);
		
//		for(Order o : order) {
//			sum += o.getTotal(); // 총합계 구하기
//			o.print();
//		}
//		System.out.println("----------------");
//		System.out.println("총 금액 : "+sum);
	}
	
	@Override
	public void printProduct() {
		// 메뉴 출력
		System.out.println("--menu--");
		for(Product p : menu) {
			System.out.println(p); // p객체의 toString 호출
		}
		System.out.println();
	}

}
