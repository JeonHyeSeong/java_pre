package Day15;

import java.util.Scanner;

public class 숙제 {

	public static void main(String[] args) {
		/* Product클래스 : 상품을 등록하는 클래스 - 메뉴하나 생성
		 * 상품명, 가격
		 * 상품등록 메서드 => insertProduct()
		 * 출력메서드 => printProduct()
		 * */
		
		/* main
		 * Product 클래스를 이용 객체를 생성
		 * 상품등록[] => 여러개의 메뉴를 등록
		 * 메뉴는 스캐너를 통해 입력받아 등록
		 * 상품 등록 후 배열의 내용을 출력
		 * 
		 *  ex)
		 *  상품을 등록하시겠습니까(y/n)? y
		 *  y => 상품등록 반복 / n => 등록 그만
		 *  상품의 이름과 가격을 등록받아 상품 배열에 등록
		 *  n => 리스트 출력
		 * */
		Scanner scan = new Scanner(System.in);
		Product[] list = new Product[5];
		int count = 0;
		
		do {
			System.out.println("상품을 등록하시겠습니까(y/n)?");
			char ch = scan.next().charAt(0);
			if(ch == 'y') {
				System.out.println("상품을 입력하세요 > ");
				String name = scan.next();
				System.out.println("가격을 입력하세요 > ");
				int price = scan.nextInt();
				Product pro = new Product();
				pro.insertProduct(name, price);
				list[count] = pro;
				count++;
			}else if(ch == 'n') {
				System.out.println("---상품리스트---");
				for(int i = 0; i < count; i++) {
					System.out.println("상품 " + (i + 1));
					list[i].printProduct();
					System.out.println();
				}
				break;
			}else {
				System.out.println("잘못된 입력입니다.");
				break;
			}
		}while(true);

		scan.close();
	}
	
}
class Product{
	private String name;
	private int price;
	
	public Product() {}
	
	public void insertProduct(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public void printProduct() {
		System.out.println("상품명 : "+name);
		System.out.println("가격 : "+price+"원");
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
