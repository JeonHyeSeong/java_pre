package Day09;

public class Method01 {
	
	// 메서드 작성위치

	public static void main(String[] args) {
		/* Method(메서드) : 기능(함수), function
		 * 메서드 선언 및 구현
		 * 접근제한자 리턴타입 메서드명(매개변수) {
		 *  기능구현;
		 * }
		 * - 접근제한자 : 접근할수있는 주체의 제한범위
		 * - 리턴타입 : 반환값(메서드 실행 후 결과로 알려주는 값의 자료형)
		 * - 메서드명 : 소문자로 작성
		 * - 매개변수 : 기능을 수행하기위해 필요한 값(외부에서 들어와야 하는 값)
		 * -  void : 리턴할 것이 없다라는 의미
		 * 
		 * - 메서드의 위치
		 * - 클래스안, 다른 메서드 밖
		 * - 메서드의 순서는 아무 상관이 없음.
		 * - 메서드는 순서대로 실행되지 않음. 호출이 되어야 실행
		 * */
		int a = sum(10,20); // 메서드 호출
		System.out.println(a);
		System.out.println(sum(10,20));
		
		int b = c(10,15);
		System.out.println(b);
		System.out.println(c(30,20));
		
		System.out.println("sum1의 호출 결과");
		sum1(20,30);
		// System.out.println(sum1(30,20)); //error

	}
	
	// 메서드 작성위치
	// 두 정수가 주어지면 두 정수의 합을 알려주는(리턴하는) 메서드
	// 리턴타입 : int(합계)
	// 메서드명 : sum
	// 매개변수 : int num1, int num2 (두 정수)
	public static int sum(int num1, int num2) {
		// 매개변수 : (자료형 변수명, 자료형 변수명)
		return num1 + num2;
	}
	
	// 두 정수가 주어지면 두 정수의 차를 알려주는(리턴하는) 메서드
	// 리턴타입 : 차 => 정수 => int
	// 메서드명 : c
	// 매개변수 : 두 정수(int num3, int num4)
	public static int c(int num3, int num4) {
		int c = num3 - num4;
		return Math.abs(c);
	}
	
	// 두 정수가 주어지면 두 정수의 합을 출력하는 메서드
	// 리턴타입 : 없음 => void
	// 매개변수 : 두 정수(int num1, int num2)
	// 메서드명 : sum1
	public static void sum1(int num1, int num2) {
		System.out.println(num1+num2);
	}

}
