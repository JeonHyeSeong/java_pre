package product;

import java.util.Scanner;

public class ProductMain {

	public static void main(String[] args) {
		ProductManager pm = new ProductManager();
		Scanner scan = new Scanner(System.in);
		
		pm.addMenu(); // 기본메뉴 구성
		int menu = 0;
		
		do {
			System.out.println(">> 버튼선택 ");
			System.out.println("1.메뉴추가|2.메뉴수정|3.메뉴삭제");
			System.out.println("4.메뉴리스트|5.주문|6.주문내역");
			System.out.println("7.종료|  선택>> ");
			
			menu = scan.nextInt();
			
			switch(menu) {
			case 1 : pm.add(scan); break;
			case 2 : pm.update(scan); break;
			case 3 : pm.delete(scan); break;
			case 4 : pm.printProduct(); break;
			case 5 : 
				System.out.println("주문할 메뉴를 선택하세요");
		        String menuName = scan.next();
		        System.out.println("주문할 메뉴의 개수를 입력하세요");
		        int price = scan.nextInt();
				pm.orderPick(menuName, price); 
				break;
			case 6 : pm.printOrder(); break;
			case 7 : break;
			default :
				System.out.println("잘못된 메뉴 입니다.");
				break;
			}
		}while(menu != 7);
		System.out.println("프로그램 종료");
		
		scan.close();

	}

}
