package Day09;

public class Method02 {

	public static void main(String[] args) {
		// + - * / % 의 결과를 알려주는 메서드를 생성
		// main에서 호출하여 확인
		System.out.println(a(10,20));
		System.out.println(b(10,20));
		System.out.println(c(10,20));
		System.out.println(d(10,20));
		System.out.println(e(30,8));

	}
	// 메서드 선언 위치
	public static int a(int num1, int num2) {
		return num1 + num2;
	}
	
	public static int b(int num1, int num2) {
		int b = num1 - num2;
		return Math.abs(b);
	}
	
	public static int c(int num1, int num2) {
		return num1 * num2;
	}
	
	public static double d(int num1, int num2) {
		return num1 / (double)num2;
	}
	
	public static int e(int num1, int num2) {
		return num1 % num2;
	}
	
	

}
