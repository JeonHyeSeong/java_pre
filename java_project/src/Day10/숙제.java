package Day10;

import java.util.Scanner;

public class 숙제 {

	public static void main(String[] args) {
		/* 야구게임
		 * 컴퓨터가 3자리 숫자를 생성 (각 자리수는 1~9까지의 수)
		 * 유저는 3자리의 숫자를 맞추는 게임
		 * 자리와 숫자가 일치하면 strike
		 * 숫자만 맞으면 ball, 아무것도 안맞으면 out
		 * ex) 컴퓨터 생성번호 : 1 2 3
		 * 사용자 번호 : 1 7 8 => 1S
		 * 사용자 번호 : 1 3 2 => 1S 2B
		 * 사용자 번호 : 7 8 9 => out
		 * 사용자 번호 : 1 2 3 => 3S 종료
		 * */
		Scanner scan = new Scanner(System.in);
		int com[] = new int[3];
		int user[] = new int[3];
		
		// 앞에서 썼던 메서드 호출
//		System.out.println("--com--");
//		// 객체 생성 후 메서드 호출
//		Method07_lotto me = new Method07_lotto();
//		me.randomArray(com);
//		me.printArray(com);
//		
//		System.out.println("--user--");
//		// static의 특징 객체를 만들지 않고 클래스명으로 호출가능
//		Method07_lotto.randomArray(user);
//		Method07_lotto.printArray(user);
		
		// com 중복되지 않게 랜덤수 추출 저장
		for(int i = 0; i<com.length; i++) {
			com[i] = (int)(Math.random()*9)+1;
			for(int j = 0; j < i; j++) {
				if(com[j] == com[i]) {
					i--;
					break;
				}
			}
		}
		// 결과 체크
		for(int a : com) {
			System.out.print(a+" ");
		}
		System.out.println();
		
		while(true) {
			int strike = 0;
			int ball = 0;
			System.out.println("숫자 입력 > ");
			// 문자로 입력받기
			String myStr = scan.next(); // 숫자를 문자로 받음
			String[] myNumstr = myStr.split(""); // 한글자마다 잘라서 배열로 저장
			for(int i = 0; i<user.length; i++) {
				// 문자를 숫자로 변환해서 user에 저장
				user[i] = Integer.parseInt(myNumstr[i]);
			}
			
//			for(int tmp : user) {
//				System.out.print(tmp+" ");
//			}
			
			// 숫자 비교
			for(int i = 0; i<com.length; i++) {
				for(int j = 0; j<user.length; j++) {
					if(com[i] == user[j] && i == j) { // 값 + 자리수도 같은경우
						strike++;
					}else if(com[i] == user[j] && i != j){ // 값만 같은경우(자리수는 다른경우)
						ball++;
					}
				}
			}
			//System.out.println();
			// 출력
		    if(strike == 0 && ball == 0) {
		    	System.out.println("out~!!");
		    }else {
		    	System.out.println("> "+strike+"s "+ball+"b");
		    }
		    if(strike == 3) {
		    	System.out.println("성공!!, 게임종료~!!");
		    	break;
		    }
		}
		scan.close();
		
		
		
//		int strike = 0;
//		int ball = 0;
//		int cnt = 0;
//		System.out.println("3자리 숫자를 입력하세요");
//		for(int i =0; i<user.length; i++) {
//			user[i] = scan.nextInt();
//		}
//		while(cnt < com.length) {
//			int random =(int)(Math.random()*9)+1;;
//			if(!isContain(com, random)) {
//				com[cnt] = random;
//				cnt++;					
//			}		
//		}
//		for(int i=0; i<com.length; i++) {
//			if(com[i]==user[i]) { 
//				strike++;
//			} else if (isContain(com,user[i])){
//				ball++;
//			}
//		}
//		if(strike==0 && ball==0) {
//			System.out.println("out");
//		} else {
//			System.out.println(strike+"스트라이크 "+ball+"볼");
//		}		
	}		
	public static boolean isContain(int arr[], int random) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == random) {
				return true;
			}
		}
		return false;
	}
}
