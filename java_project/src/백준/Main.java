package 백준;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int arr[] = new int[a];
		
		int max = 0;
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
			if(arr[i]>max) {
				max = arr[i];
			}
			sum += arr[i];
		}
		
		double avg = 100*sum/max/a;
		System.out.println(avg);
		
		scan.close();

	}

}
