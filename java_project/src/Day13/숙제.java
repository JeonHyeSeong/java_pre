package Day13;

public class 숙제 {

	public static void main(String[] args) {
		/* 두 정수 a,b가 주어졌을 때 a와 b 사이에 
		 * 속한 모든 정수의 합을 리턴하는 메서드
		 * 예) a = 3, b = 5 => 3+4+5
		 * 예) a = 5, b = 1 => 1+2+3+4+5
		 * 예) a = 3, b = 3 => 3
		 * */
		System.out.println(sum(2,6)); // 20
		System.out.println(sum(7,1)); // 28
		System.out.println(sum(6,6)); // 6
		System.out.println(sum(7,4)); // 22
		System.out.println(sum2(3,5));

	}
	
	public static int sum(int num1, int num2) {
		int result = 0;
		if(num1 == num2) {
			return num1;
		}
		for(int i = num1; i <= num2; i++) {
			result += i;
			}
		for(int j = num2; j <= num1; j++) {
			result += j;
		}
		return result;
	}
	
	public static int sum2(int a,int b) {
		int max = Math.max(a, b);
		int min = Math.min(a, b);
		int sum = 0;
		for(int i = min; i <= max; i++) {
			sum += i;
		}
		return sum;
	}

}
