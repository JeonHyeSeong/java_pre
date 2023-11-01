package Day20;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Kiosk {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		HashMap<String, Integer> menu = new HashMap<>();
		menu.put("피자", 15000);
		menu.put("햄버거", 10000);
		menu.put("콜라", 2000);
		menu.put("아이스크림", 500);
		
		while(true) {
			System.out.println("--메뉴--");
            System.out.println("1. 주문하기");
            System.out.println("2. 메뉴추가");
            System.out.println("3. 메뉴삭제");
            System.out.println("4. 가격변경");
            System.out.println("5. 종료");
            System.out.print("선택: ");
            int choice = scan.nextInt();
            
            switch(choice) {
            case 1 : order(scan, menu); break;
            case 2 : add(scan, menu); break;
            case 3 : delete(scan, menu); break;
            case 4 : change(scan, menu); break;
            case 5 : System.out.println("종료합니다"); return;
            default : System.out.println("잘못된 입력입니다"); break;
            }
		}
		
		

	}
	
	public static void choiceMenu(HashMap<String, Integer> menu) {
		for(Map.Entry<String, Integer> tmp : menu.entrySet()) {
			String menuName = tmp.getKey();
            int price = tmp.getValue();
            System.out.println(menuName + " : " + price+"원");
		}
	}
	
	public static void order(Scanner scan, HashMap<String, Integer> menu) {
		 HashMap<String, Integer> order = new HashMap<>();
		 int sum = 0;
		 int index = -1;
		 while(index != 0) {
			 System.out.println("--메뉴판--");
			 choiceMenu(menu);
			 System.out.println("주문할 메뉴를 선택하세요");
			 String menuName = scan.next();
			 System.out.println("주문할 메뉴의 개수를 선택하세요");
			 int num = scan.nextInt();
			 order.put(menuName, num);
			 System.out.println("주문을 계속 하시겠습니까? (계속(1) 종료(0))");
			 index = scan.nextInt();
			 
			 for(String tmp : order.keySet()) {
				 System.out.println(tmp + ":" + order.get(tmp)+"개");
			 }

			 sum += (menu.get(menuName)) * num;
			 System.out.println("계산할 총 금액 : "+sum+"원");
			 
			 
		 }
	}
	
	public static void add(Scanner scan, HashMap<String, Integer> menu) {
		System.out.println("추가할 메뉴를 입력하세요");
		String menuName = scan.next();
		System.out.println("추가할 메뉴의 가격을 입력하세요");
		int price = scan.nextInt();
		menu.put(menuName, price);
		System.out.println("메뉴가 추가되었습니다");
		
	}
	
	public static void delete(Scanner scan, HashMap<String, Integer> menu) {
		System.out.println("삭제할 메뉴를 입력하세요");
		String menuName = scan.next();
		menu.remove(menuName);
		System.out.println("메뉴가 삭제되었습니다");
	}
	
	public static void change(Scanner scan, HashMap<String, Integer> menu) {
		System.out.println("가격을 변경할 메뉴를 선택하세요");
		String menuName = scan.next();
		System.out.println("변경할 가격을 입력하세요");
		int price = scan.nextInt();
		menu.put(menuName, price);
		System.out.println("가격이 변경되었습니다");
	}
	

}
