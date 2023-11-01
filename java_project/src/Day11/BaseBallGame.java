package Day11;

import java.util.Scanner;

import Day10.Method07_lotto;

public class BaseBallGame {

	public static void main(String[] args) {
		/* 야구게임 메서드화
		 * 사용자번호는 직접 입력
		 * 컴퓨터번호는 랜덤생성(1~9, 중복X)
		 * */
		int comNum[] = new int[3];
		int myNum[] = new int[3];
		int max = 9, min = 1;
		int s = 0, b = 0;
		Scanner scan = new Scanner(System.in);
		randomArray(comNum, min, max);
		printArray(comNum);
		
		while(true) {
			System.out.println("숫자 입력 > ");
			String myStr = scan.next();
			String[] myNumstr = myStr.split("");
			for(int i = 0; i<myNum.length; i++) {
				myNum[i] = Integer.parseInt(myNumstr[i]);
			}

			s = strike(comNum, myNum);
			b = ball(comNum, myNum);

			if(s == 0 && b == 0) {
				System.out.println("out!");
			}else {
				System.out.println(s+"S "+b+"B");
			}
			if(s == 3) {
				System.out.println("정답~!!");
				break;
			}

			
			
		}
		
	scan.close();	
		
		
		
		

	}
	
	/* 랜덤 수 생성 메서드
	 * 범위를 주지 않고 min, max를 이용하여 범위 설정
	 * min = 1, max = 9
	 * */
	public static int random(int min, int max) {
		if(max < min) { // 값이 바뀌었다면 max와 min을 교환
			int tmp = max;
			max = min;
			min = tmp;
		}
		return (int)(Math.random()*(max-min+1))+min;
	}
	
	/* 랜덤 배열 중복되지않게 생성
	 * isContain을 Method07_lotto 가져와서 사용
	 * 매개변수 : 배열, int min, int max
	 * 리턴 X => void
	 * */
	public static void randomArray(int arr[], int min, int max) {
		int cnt = 0;
		while(cnt<arr.length) {
			int r = random(min, max);
			if(!Method07_lotto.isContain(arr, r)) {
				arr[cnt] = r;
				cnt++;
			}
		}
	}
	
	/* 스트라이크 개수를 카운트하는 메서드
	 * comNum, myNum 주고, 번호와 위치가 일치하면 count
	 * 리턴타입 => int
	 * */
	public static int strike(int comNum[], int myNum[]) {
		int cnt = 0;
		for(int i = 0; i < comNum.length; i++) {
			for(int j = 0; j < myNum.length; j++) {
				if(comNum[i] == myNum[j] && i == j) {
					cnt++;
				}
			}
		}
		return cnt;
	}
	
	/* 볼 개수 카운트하는 메서드
	 * comNum, myNum 주고, 번호만 일치하면 count하는 메서드
	 * */
	public static int ball(int comNum[], int myNum[]) {
		int cnt = 0;
		for(int i = 0; i < comNum.length; i++) {
			for(int j = 0; j < myNum.length; j++) {
				if(comNum[i] == myNum[j] && i != j) {
					cnt++;
				}
			}
		}
		return cnt;
	}
	
	/* 배열 출력 메서드
	 * */
	public static void printArray(int arr[]) {
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}
