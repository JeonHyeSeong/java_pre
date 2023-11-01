package Day10;

import java.util.Scanner;

public class 가위바위보게임 {

	public static void main(String[] args) {
		/* 컴퓨터가 가위바위보를 랜덤으로 선택(0=가위, 1=바위, 2=보)
		 * 내가 가위바위보중 하나를 선택해서 입력
		 * 승패무의 결과를 출력
		 * ex)
		 * com = 0(가위)
		 * user = 가위 => 무승부입니다.
		 * com = 1(바위)
		 * user = 가위 => 졌습니다.
		 * */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("가위바위보 게임 시작 > ");
		int random = (int)(Math.random()*3)+1;
		System.out.println("컴퓨터 결정 완료~!!");
		System.out.println("가위바위보중 하나를 입력하세요");
		String num = scan.next();
		
		// 컴퓨터 상태를 String 변환
		String comChoice = (random == 0? "가위" : random == 1? "바위" : "보");
		System.out.println("comChoice > "+comChoice);
		
		// 비교
		if(comChoice.equals(num)) {
			System.out.println("무승부");
		}else {
			if(comChoice.equals("가위")) {
				System.out.println(num.equals("바위")? "승" : "패");
			}else if(comChoice.equals("바위")) {
				System.out.println(num.equals("보")? "승" : "패");
			}else {
				// 컴선택 = "보"
				System.out.println(num.equals("가위")? "승" : "패");
			}
		}
		System.out.println("종료~!!");
		
//		if(num == random) {
//			System.out.println("무승부입니다.");
//		}else if(num == 1 && random == 3) {
//			System.out.println("이겼습니다.");
//		}else if(num == 1 && random == 2) {
//			System.out.println("졌습니다.");
//		}else if(num == 2 && random == 1) {
//			System.out.println("이겼습니다.");
//		}else if(num == 2 && random == 3) {
//			System.out.println("졌습니다.");
//		}else if(num == 3 && random == 2) {
//			System.out.println("이겼습니다.");
//		}else if(num == 3 && random == 1) {
//			System.out.println("졌습니다.");
//		}
		
		
		
		
		scan.close();
		

	}

}
