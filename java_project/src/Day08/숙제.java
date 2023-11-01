package Day08;

import java.util.Scanner;

public class 숙제 {

	public static void main(String[] args) {
		/* 숫자를 입력받아 입력받은 숫자를 거꾸로 출력, 각자리의 합계 출력
		 * ex) 11456 => 출력 : 65411 => 6+5+4+1+1 => 결과값 출력
		 * ex) 19781 => 출력 : 18791 => 1+8+7+9+1 => 결과값 출력
		 * /, % 이용
		 * 
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = scan.nextInt();
		int sum = 0;
		
		// num % 10 나머지값을 저장 => 마지막 자리
		// num = num / 10; int형으로  나머지를 버린 몫만을 가지고 다시 나누기
		while(num > 0) {
			int b = num % 10; // 마지막 자리 추출
			sum += b;
			num = num / 10;
			System.out.print(b+" ");
		}
		System.out.println(" => 자리 합 : "+sum);
		
		
		
		
//		String str = String.valueOf(num);
//		String[] arr = str.split("");
//		int[] arr1 = new int[arr.length];
//		for(int i = 0 ; i<arr.length; i++) {
//			System.out.print("입력한 숫자는 : "+arr[i] + " ");
//		}
//		
//		System.out.println();
//	    System.out.println("---숫자로 변환---");
//		 for (int i = 0; i < arr.length; i++) {
//			 arr1[i] = Integer.parseInt(arr[i]);
//			 System.out.print(arr1[i]+" ");
//	        }
//		
//		System.out.println();
//		System.out.println("---거꾸로 변환---");
//		for(int i = str.length()-1; i >= 0; i--) { 
//			System.out.print(arr[i]);
//			if(i == 0) {
//				System.out.print(" = ");
//			}else {
//				System.out.print(" + ");
//			}
//			
//			sum += arr1[i];
//		}
//		System.out.println(" "+sum);
		
		
		
		scan.close();
		

	}

}
