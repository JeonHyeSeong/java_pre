package Day04;

public class For문02 {

	public static void main(String[] args) {
		/* 1~10까지의 홀수의 합과 짝수의 합을 출력
		 * */
		int sum1 = 0;
		int sum2 = 0;
		for(int i = 1; i <= 10; i++) {
			if(i%2==1) {
				sum1 += i;
			}else {
				sum2 += i;
			}
		}
		System.out.println(sum1);
		System.out.println(sum2);

	}

}
