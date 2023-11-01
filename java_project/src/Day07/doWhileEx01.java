package Day07;

import java.util.Scanner;

public class doWhileEx01 {

	public static void main(String[] args) {
		/* do~while문을 이용하여
		 * 값을 입력하면 그대로 출력
		 * 단. y/Y가 입력되면 종료
		 * */
		
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("값을 입력하세요.");
			char ch = scan.next().charAt(0);
			if(ch == 'y' || ch == 'Y') {
				System.out.println("종료");
				break;
			}else {
				System.out.println(ch);
			}
		}while(true);
			
		
		
		
		scan.close();

	}

}
