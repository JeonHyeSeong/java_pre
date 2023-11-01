package Day09;

public class Method04 {

	public static void main(String[] args) {
		
		System.out.println(isPrime(12));
		int sum = 0;
		for(int i = 2; i <= 100; i++) {
			if(isPrime(i)) {
				System.out.println(i+"는 소수입니다.");
				sum += i;
			}
//			else {
//				System.out.println(i+"는 소수가 아닙니다.");
//			}
			
		}
		// 2~100까지 소수의 합계 (isPrime을 활용)
		System.out.println("소수의 합계 : "+sum);

	}
	
	/* 정수가 주어지면 이 정수가 소수인지 아닌지 판별(true / false)
	 * 소수 : 1과 자기 자신의 수 외에는 나누어 떨어지지 않는 수
	 * 리턴타입 : boolean
	 * 매개변수 : int num
	 * 메서드명 : isPrime
	 * */
	public static boolean isPrime(int num) {
		// 소수인지 판별할 수는 num
		int count = 0; // 약수의 개수를 세기위한 변수(약수가 2개인 수가 소수)
		for(int i = 1; i <= num; i++ ) {
			if(num % i == 0) {
				count++;
			}
		}
		
		if(count == 2) {
			return true;
		}else {
			return false;
		}
	}
	

}
