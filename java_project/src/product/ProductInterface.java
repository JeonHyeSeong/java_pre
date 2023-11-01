package product;

import java.util.Scanner;

public interface ProductInterface {
	
	// 메뉴추가, 메뉴삭제, 가격수정, 주문, 주문내역 출력, 메뉴출력
	void add(Scanner scan); // 메뉴추가
	void delete(Scanner scan); // 메뉴삭제
	void update(Scanner scan); // 가격수정
	void orderPick(String name, int count); // 주문
	void printOrder(); // 주문내역출력
	void printProduct(); // 메뉴출력
	
}
