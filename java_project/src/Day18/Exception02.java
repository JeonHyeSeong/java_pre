package Day18;

public class Exception02 {

	public static void main(String[] args) {
		/* 0으로 나누었을 때 Exception  // ArithmeticException
		 * */
		try {
			// 예외가 발생할 수 있는 구문
			System.out.println(calc(4,0,'+'));
			System.out.println(calc(4,0,'-'));
			System.out.println(calc(4,0,'*'));
			System.out.println(calc(4,0,'/'));
			System.out.println(calc(4,0,'%'));
			System.out.println(calc(4,0,'^'));
		} catch (Exception e) {
			System.out.println(e.getMessage()); // 리턴 String
			e.printStackTrace();
		}
//		System.out.println(calc(4,0,'/'));
//		System.out.println(calc(4,0,'%'));
		
		System.out.println("계산기 종료");

	}
	
	// 기능 : 두 수를 입력받고, 연산자를 입력받아 4칙연산의 결과를 리턴하는 메서드
	// throw를 발생시키기 => 예외 발생시키기(예외 떠넘기기)
	// throw를 발생시키게 되면 예외를 메서드를 호출하는 객체에게 넘기는 현상이 발생됨.
	// throw를 발생시키면 메서드 선언부 끝에 throws를 적고, 발생할 수 있는 예외를 반드시 적어줘야 함.
	// throws는 RuntimeException은 예외적으로 생략가능.
	public static double calc(int num1, int num2, char op) throws RuntimeException {
		double res = 0; // 결과를 담을 변수
		// 예외가 발생할 수 있는 부분은 미리 처리해 주는 것이 좋음.
		if((op == '/' || op == '%') && num2 == 0) {
			// 미리 예외 발생시키기
			throw new RuntimeException("num2는 0이 될 수 없습니다.");
		}
		switch(op) {
		case '+' : res = num1 + num2; break;
		case '-' : res = num1 - num2; break;
		case '*' : res = num1 * num2; break;
		case '/' : res = num1 / num2; break;
		case '%' : res = num1 % num2; break;
		default : 
			throw new RuntimeException(op+"는 산술연산자가 아닙니다.");
		}
		return res;
	}
}
