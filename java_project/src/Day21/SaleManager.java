package Day21;

import java.util.ArrayList;
import java.util.Scanner;

public class SaleManager {
	
	// sale 클래스의 처리를 위한 클래스
	private ArrayList<Sale_Generic<String, Integer>> menu = new ArrayList<>();
	private ArrayList<Sale_Generic<String, Integer>> order = new ArrayList<>();
	
	// 메뉴
	public void printMenu() {
		System.out.println(">>menu<<");
		System.out.println("1.제품추가|2.제품리스트보기|3.제품주문");
		System.out.println("4.주문내역보기|5.종료");
		System.out.println(">> menu : ");
	}

	public void add(Scanner scan) {
		// 제품추가
		String menu = null;
		int price = 0;
		System.out.println("제품명 : ");
		menu = scan.next();
		System.out.println("가격 : ");
		price = scan.nextInt();
		// 클래스 객체 생성한 후 add
		Sale_Generic<String,Integer> p = new Sale_Generic<>(menu, price);
		this.menu.add(p);
		
	}

	public void menu() {
		// 제품리스트 보기
		for(Sale_Generic<String,Integer> tmp : menu) {
			System.out.println(tmp); // toString 반영하여 출력
		}
	}

	public void orderPick(String name, int count) {
		// 주문하기
		// name = 주문음식, count = 주문수량
		for(int i = 0; i < menu.size(); i++) {
			String productMenu = menu.get(i).getMenu();
			int productPrice = menu.get(i).getPrice();
			if(productMenu.equals(name)) {
				Sale_Generic<String,Integer> p = new Sale_Generic<>(productMenu,(productPrice*count));
				order.add(p);
			}
		}
		
	}

	public void printOrder() {
		// 주문내역 출력
		int sum = 0;
		for(Sale_Generic<String,Integer> tmp : order) {
			System.out.println(tmp); // toString 반영하여 출력
			sum += tmp.getPrice();
			// 제네릭 타입의 멤버 값으로 직접 접근하게 되면 형변환 후 저장해야 함.
		}
		System.out.println("총지불금액 : "+sum);
	}

}
