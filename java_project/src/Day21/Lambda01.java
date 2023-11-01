package Day21;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Lambda01 {

	public static void main(String[] args) {
		// 람다식(Lambda) + 스트림(Stream) => 람다와 스트림
		/* 함수의 구현과 호출만으로 프로그래밍이 수행되는 방식
		 * 람다식 : 익명함수와 비슷한 용어 (함수보다 단순하게 표현하는 방식)
		 * 외부자료의 부수적인 영향(side effect)를 주지 않도록 구현하는 방식
		 * (매개변수) -> { 구현 };
		 * (int x, int y) -> { return x+y; }; => 가능
		 * int x -> { return !x; }; => 가능
		 * int x -> return !x; => 오류
		 * 
		 * { 리턴이 있다면 } {} : 생략불가.
		 * 실행문이 하나라면 {} 생략 가능
		 * n -> System.out.println(n); => 가능
		 * 
		 * */
		
		// ArrayList에 10 20 30 40 50을 입력한 후 출력
		ArrayList<Integer> num = new ArrayList<>();
		num.add(10);
		num.add(30);
		num.add(40);
		num.add(20);
		num.add(50);
		
		for(Integer tmp : num) {
			System.out.print(tmp+" ");
		}
		System.out.println();
		System.out.println("------------");
		
		num.forEach((n)->{
			System.out.print(n+" ");
		});
		System.out.println();
		System.out.println("------------");
		// 람다식 형태로 출력
		Consumer<Integer> method = (n) ->{
			System.out.print(n+" ");
		};
		
		num.forEach(method);

		
	}

}
