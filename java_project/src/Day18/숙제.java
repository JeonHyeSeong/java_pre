package Day18;

import java.util.Scanner;

public class 숙제 {

	public static void main(String[] args) {
		// 숫자를 입력받아 입력받은 숫자의 총합을 구하는 프로그램 작성
		// 입력 : 45,78,89,65,95 => String 타입으로 입력
		// 입력받은 문자들을 배열에 넣고, 합계를 출력
		// 1. 총합
		// 2. 70점 이상 합계
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요(ex>45,78,89,65,95)");
		String str = scan.next();
		
		String[] num = str.split(",");
		int sum = 0;
		int sum70 = 0;
		int cnt = 0;
		int cnt2 = 0;
		for(int i = 0; i < num.length; i++) {
			int num1 = Integer.parseInt(num[i]);
			sum += num1;
			cnt++;
			if(num1 >= 70) {
				sum70 += num1;
				cnt2++;
			}
		}
		System.out.println(cnt+"명 숫자의 총합 : "+sum);
		System.out.println(cnt2+"명의 70점 이상 숫자의 총합 : "+sum70);
		
		scan.close();

	}

}
