package Day05;

public class Continue {

	public static void main(String[] args) {
		/* Continue : pass, skip개념
		 * 1~10까지 출력
		 * 5만빼고 출력
		 * */
		for(int i = 1; i <= 10; i++) {
			if(i==5) {
				continue;
			}
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("--------------");
		
		/* 1~10까지중 짝수만 출력 continue문을 이용하여 출력
		 * */
		for(int i = 1; i <= 10; i++) {
			if(i%2==1) {
				continue;
			}
			System.out.print(i+" ");
		}

	}

}
