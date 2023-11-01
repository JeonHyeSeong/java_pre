package Day07;

public class 별찍기 {

	public static void main(String[] args) {
		/* 별찍기
		 * *****
		 * *****
		 * *****
		 * *****
		 * *****
		 * 5*5 개로 별찍기
		 * */
		for(int i =1; i <= 5; i++) { // 줄 수(5줄)
			for(int j = 1; j <= 5; j++) { // 별 한개 총 별 5개
				System.out.print("*");
			}
			System.out.println(); // 한줄 다 찍고 줄바꿈
		}
		System.out.println("-----------------");
		
		/* *        i=1, j=1
		 * **       i=2, j=2
		 * ***      i=3, j=3
		 * ****     i=4, j=4
		 * *****    i=5, j=5
		 * */
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i  ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-------------");
		
		/* *****
		 * ****
		 * ***
		 * **
		 * *
		 * */
		for(int i = 1; i <= 5; i++) {
			for(int j = 5; j >= i; j--) {
				System.out.print("*");	
			}
			System.out.println();
		}
		System.out.println("-------------");
		
		
		/*     *    i=1, o=4, j=1
		 *    **    i=2, o=3, j=2
		 *   ***    i=3, o=2, j=3
		 *  ****    i=4, o=1, j=4
		 * *****    i=5, o=0, j=5
		 * */
		for(int i = 1; i <= 5; i++) {
			for(int k = 1; k <= 5-i; k++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
				
		}
		
		System.out.println("-----------------");
		/* 1 2 3   i = 줄
		 * 4 5 6   j = 숫자의 반복 횟수
		 * 7 8 9
		 * */
		// 이중for문을 이용하여 나타내보기
		int num = 0;
		for(int i = 1; i <= 3; i++) {
			for(int j = 1; j <= 3; j++) {
				num++;
				System.out.print(num+" ");
			}
			System.out.println();
		}

	}

}
