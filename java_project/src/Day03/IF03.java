package Day03;

import java.util.Scanner;

public class IF03 {

	public static void main(String[] args) {
		/* 정수를 입력받아서 2의 배수가 되는지 체크(2의 배수입니다.)
		 * 3의 배수가 되는지 체크(3의 배수입니다.)
		 * */
		// ctrl + shift + o : import 단축키
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = scan.nextInt();
		if(num % 2 == 0) {
			System.out.println("2의 배수입니다.");
		}
		if(num % 3 == 0) {
			System.out.println("3의 배수입니다.");
		}
		
		
		scan.close();

	}

}
