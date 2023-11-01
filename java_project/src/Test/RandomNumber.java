package Test;

import java.util.Scanner;

public class RandomNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("난수의 개수를 입력하세요. : ");
		int cnt = scan.nextInt();
		int sum = 0;
		
		for(int i = 0; i <= cnt; i++) {
			int random = (int)(Math.random()*100);
			sum += random;
		}
		System.out.println("난수 "+cnt+"개의 합은 "+sum);
		
		scan.close();

	}

}
