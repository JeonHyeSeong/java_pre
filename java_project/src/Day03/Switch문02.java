package Day03;

import java.util.Scanner;

public class Switch문02 {

	public static void main(String[] args) {
		/* 숙제(클럽에 제출)
		 * 정수 2개와 연산자 하나를 입력받아 두 정수의 연산을 출력
		 * 연산자는 + - * / % 중 하나를 입력받기
		 * ex) 3 2 + => 3 + 2 = 5
		 * ex) 3 2 - => 3 - 2 = 1
		 * ex) 3 2 * => 3 * 2 = 6
		 * */
		Scanner scan = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력하세요");
		int num1 = scan.nextInt();
		System.out.println("확인 > "+num1);
		
		System.out.println("두번째 숫자를 입력하세요");
		int num2 = scan.nextInt();
		System.out.println("확인 > "+num2);
		
		System.out.println("연산자를 입력하세요");
		char ch = scan.next().charAt(0); // 한글자만 받음
		
		/* 숫자 = 그냥 입력 int num = 3;
		 * char (한글자) '' 값을 입력받음.
		 * String (문자열) "" 값을 입력받음.
		 * */
		switch(ch) {
		case '+' : System.out.println(num1+"+"+num2+"="+(num1+num2));break; 
		
		case '-' : System.out.println(num1+"-"+num2+"="+(num1-num2));break;
		
		case '*' : System.out.println(num1+"*"+num2+"="+(num1*num2));break;
		
		case '/' : System.out.println(num1+"/"+num2+"="+(num1/num2));break;
		
		case '%' : System.out.println(num1+"%"+num2+"="+(num1%num2));break;
		
		default : System.out.println("잘못된 연산자입니다.");break;
		
		
		}
		// op char 형태 : 정수 자료형
		// + : 더하기, + : 연결연산자 (피연산자가 문자일경우)
		// 3 + 5 = 8 => 의미 없는 문자를 삽입하여 연산이 되지 않게함.
		
		scan.close();

	}

}
