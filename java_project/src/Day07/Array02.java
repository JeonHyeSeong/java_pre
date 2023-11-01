package Day07;

import java.util.Scanner;

public class Array02 {

	public static void main(String[] args) {
		/* 5개짜리 배열을 생성하여 1~5까지의 값을 입력하고 출력
		 * */
		int arr1[] = new int[5];
		
		for(int i = 0; i<arr1.length; i++) {
			arr1[i] = i + 1;
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		
		/* 5명의 점수를 입력받아서 배열에 저장하고,
		 * 점수의 합계와 평균을 출력
		 * */
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int arr2[] = new int[5];
		int sum = 0;
		double avg;
		for(int i = 0; i<arr2.length; i++) {
			arr2[i] = scan.nextInt();
			sum = sum + arr2[i];
		}
		System.out.println("점수의 합계는 : "+sum);
		avg = sum/5;
		System.out.println("점수의 평균은 : "+avg);
		
		scan.close();

	}

}
