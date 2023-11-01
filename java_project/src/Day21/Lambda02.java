package Day21;

import java.util.HashMap;

public class Lambda02 {

	public static void main(String[] args) {
		/* map을 구성하여 forEach를 이용하여 출력
		 * number.forEach((n)->{
		 *  System.out.print(n+" ");
		 * });
		 * */
		HashMap<String, Integer> s = new HashMap<>();
		s.put("영희", 80);
		s.put("철수", 70);
		s.put("홍길동", 90);
		
		s.forEach((x,y)-> System.out.println(x+" : "+y));
		
		Number add = (a, b) -> {
			return a+b;
		};
		System.out.println(add.add(10, 30)); //결과 체크

		Number max = (a, b) -> (a >= b)? a:b; // 함수 구현
		System.out.println(max.add(2, 10)); // 결과 체크

	}

}


// 람다식에서 사용할 함수형 인터페이스
// 메서드가 1개여야 함. 어노테이션 필수
@FunctionalInterface
interface Number{
	int add(int a, int b);
}
