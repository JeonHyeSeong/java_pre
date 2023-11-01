package Day05;

import java.util.Scanner;

public class 숙제 {

	public static void main(String[] args) {
		/* up/down 게임
		 * 1~50사이의 랜덤수를 생성하여 맞추는 게임
		 * 예) 컴퓨터가 랜덤 생성 수 : 45
		 * 컴퓨터가 랜덤수를 생성하였습니다.
		 * 입력> 10
		 * up~!!
		 * 입력> 20
		 * up~!!
		 * 입력> 50
		 * down~!!
		 * 입력> 45
		 * 정답~!! 종료!!
		 * */
		
		Scanner scan = new Scanner(System.in);
		int num = (int)(Math.random()*50)+1;
		//System.out.println(num);
		System.out.println("컴퓨터가 랜덤수를 생성하였습니다.");
		System.out.println("회차제한 : 5회~!!");
		// while문을 사용할 경우
		int i = 1;
		while(i <= 5) {
			int a = scan.nextInt();
			System.out.println("입력 >>");
			if(num == a) {
				System.out.println("정답~!!");
				break;
			}else if(num > a) {
				System.out.println("up~!!"+i+"회");
			}else if(num < a) {
				System.out.println("down~!!"+i+"회");
			}
			i++;
		}
		
		
		
		
		
		
		// for문 사용
		//for(;;) { // 무한루프
		//	int a = scan.nextInt();
		//	System.out.println("입력> ");
		//	if(num > a) {
		//		System.out.println("up~!!");
		//	}else if(num < a) {
		//		System.out.println("down~!!");
		//	}else {
		//		System.out.println("정답~!! 종료!!");
		//		break;
		//	}
	//	}
		
		// while문을 사용할 경우
		
		
		
		
		scan.close();
		

	}

}
