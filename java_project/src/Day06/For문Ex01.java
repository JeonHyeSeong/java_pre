package Day06;

public class For문Ex01 {

	public static void main(String[] args) {
		/* 2 4 6 8 10
		 * 12 14 16 18 20
		 * 22 24 26 28 30
		 * 
		 * 1부터 30까지 짝수만 출력
		 * 5개씩 한줄로 출력
		 * */
		for(int i = 1; i <= 30; i++) {
			if(i % 2 == 0) {
				System.out.printf("%3d",i);
				if(i % 10 == 0) {
					System.out.println();
				}
			}
		}
		
		System.out.println();
		System.out.println("-------------");
		System.out.println("출력구문");
		System.out.println("println : 줄바꿈이 있는 출력");
		System.out.println("print : 줄바꿈이 없는 출력");
		System.out.println("printf : 지시자를 통해서 값을 표현");
		/* 서식 지정자를 통해 출력할 데이터의 서식을 지정할수 있음.
		 * %n(\n 줄바꿈), %d(정수형), %f(실수형), %c(문자), %s(문자열)
		 * escape sequence
		 * \n(줄바꿈), \r(캐리지리턴), \t(탭)
		 * */
		int num1 = 5;
		int num2 = 3;
		// 5 + 3 = 8
		System.out.println(num1+"+"+num2+"="+(num1+num2));
		System.out.printf("%2d+%2d=%2d%n", num1,num2,(num1+num2));
		
		double num3 = 5;
		double num4 = 12;
		System.out.println(num3+"/"+num4+"="+(num3/num4));
		System.out.printf("%.0f/%.0f=%.1f", num3,num4,(num3/num4));
		
		
		
	}

}


