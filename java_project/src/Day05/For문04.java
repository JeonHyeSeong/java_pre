package Day05;

import java.util.Scanner;

public class For문04 {

	public static void main(String[] args) {
		/* 최대공약수 찾기
		 * 두 정수 num1 , num2를 입력받아 최대공약수를 출력
		 * 공약수 : 두 정수의 약수 중 공통적으로 있는 약수
		 * 최대공약수 : 공약수 중 가장 큰 값
		 * 8 , 12의 공약수
		 * 8 : 1 2 4 8
		 * 12 : 1 2 3 4 6 12
		 * 공약수 : 1 2 4 => 4
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("두 정수를 입력해주세요");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		int gcd = 0;
		for(int i = 1; i <= num1; i++) {
			// 둘다 i로 나누어 떨어지는 수 => 공약수
		    if(num1%i==0 && num2%i==0) {
		    	gcd = i; // 공약수가 더 있다면 이전 값은 사라지고 뒤에 나오는(더 큰 공약수) 값이 저장
		    }
		}
		System.out.println(num1+"과 "+num2+"의 최대공약수 > "+gcd);
		
		
		/* break : 반복문에서 조건이 맞다면 (반복문을) 빠져나오는 구문
		 * */
		
		for(int i = num1;   ; i--) {
			if(num1 % i == 0 && num2 % i == 0) {
				System.out.println("두 수의 최대공약수 > "+i);
				break;
			}
		}
		
		/* break : if문의 가장 가까운 for문만 벗어날 수 있음.
		 * for문에 이름표를 붙여 해당 for문을 빠져나갈 수 있음.
		 * */
		
		int i = 10;
		a:for(;;) {
			for(;;) {
				for(;;) {
					if(i==10) {
						i++;
						System.out.println("i는 11이지롱~");
						break a;
					}
					
				}
			}
		}
		
		
		scan.close();

	}

}
