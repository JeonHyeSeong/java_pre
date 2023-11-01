package Day05;

import java.util.Scanner;

public class For문03 {

	public static void main(String[] args) {
		/* num를 입력받아 num의 약수를 출력
		 * 약수 : 나누어서 떨어지는 수
		 * 12의 약수 : 12%(1~12) = 나머지가 0이 되는 수
		 * 1 , 2 , 3 , 4 , 6 , 12(자신의수)
		 * */
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = scan.nextInt();
		for(int i =1; i <= num; i++) {
			if(num%i==0) {
				System.out.print(i+" ");
			}
		}
		
		
		
		
		
		
		
		scan.close();

	}

}
