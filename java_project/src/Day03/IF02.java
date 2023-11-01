package Day03;

import java.util.Scanner;

public class IF02 {

	public static void main(String[] args) {
		/* 국어, 영어, 수학을 입력받아서 합계, 평균
		 * 평균이 90이상이면 A
		 * 평균이 80이상이면 B
		 * 평균이 70이상이면 C
		 * 나머지는 D
		 * 입력값이 0보다 작거나, 100보다 크면 잘못된 값입니다.
		 * */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("국어점수를 입력하세요");
		int kor = scan.nextInt();
		System.out.println("영어점수를 입력하세요");
		int eng = scan.nextInt();
		System.out.println("수학점수를 입력하세요");
		int math = scan.nextInt();
		if(kor>100 || eng>100 || math>100 || kor<0 || eng<0 || math<0) {
			System.out.println("잘못된 값입니다.");
		}
		int sum = kor+eng+math;
		double avg = sum/3.0;
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+avg);
		if(avg >= 90) {
			System.out.println("A");
		}else if(avg >= 80) {
			System.out.println("B");
		}else if(avg >= 70) {
			System.out.println("C");
		}else {
			System.out.println("D");
		}
		
		
		scan.close();

	}

}
