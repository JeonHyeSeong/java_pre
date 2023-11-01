package Day09;

import java.util.Scanner;

public class 숙제 {

	public static void main(String[] args) {
		/* 계산기 만들기
		 * --메뉴--
		 * 1. 덧셈 2. 뺄셈 3. 곱셈 4. 나눗셈 5. 나머지 6. 종료
		 * >> 메뉴선택 1
		 * >> 숫자1 > 입력받기(5)
		 * >> 숫자2 > 입력받기(3)
		 * 더하기 메서드를 호출하여 연산(5+3)
		 * 결과 : 5+3=8
		 * 연산에 따른 switch 구문으로 메서드 호출
		 * */
		Scanner scan = new Scanner(System.in);
		int menu = 0;
		do {
			System.out.println("--메뉴--");
		    System.out.println("1.덧셈|2.뺄셈|3.곱셈|4.나눗셈|5.나머지|6.종료");
			System.out.println("메뉴를 선택해주세요~");
			menu = scan.nextInt();
			int a=0;
			int b=0;
			if(menu < 6) {
				System.out.println("숫자1 > ");
				a = scan.nextInt();
				System.out.println("숫자2 > ");
				b = scan.nextInt();
			}
			switch(menu) {
			case 1 : System.out.println(a+"+"+b+"="+sum(a,b)); break;
			case 2 : System.out.println(a+"-"+b+"="+sub(a,b)); break;
			case 3 : System.out.println(a+"*"+b+"="+mul(a,b)); break;
			case 4 : System.out.println(a+"/"+b+"="+div(a,b)); break;
			case 5 : System.out.println(a+"%"+b+"="+mod(a,b)); break;
			case 6 : System.out.println("종료합니다~"); break;
			}
		}while(menu != 6);
		
			
			

		
		
		
		scan.close();

	}
	
	/* 더하기, 빼기, 곱하기, 나누기, 나머지 메서드를 별도 구성
	 * */
	public static int sum(int num1, int num2) {
		return num1 + num2;
	}
	public static int sub(int num1, int num2) {
		return num1 - num2;
	}
	public static int mul(int num1, int num2) {
		return num1 * num2;
	}
	public static double div(int num1, int num2) {
		return num1 / (double)num2;
	}
	public static int mod(int num1, int num2) {
		return num1 % num2;
	}

}
