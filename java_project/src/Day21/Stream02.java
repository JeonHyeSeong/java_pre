package Day21;

import java.util.Arrays;

public class Stream02 {

	public static void main(String[] args) {
		/* 배열에서 짝수만 출력(정렬) 중복되는 값 제거
		 * */
		int[] arr = {5,7,4,1,2,3,6,5,4,8,9,5,1,4};
		// 배열 => stream : Arrays.stream(배열명)
		System.out.println("---짝수만 출력---");
		Arrays.stream(arr)
		.distinct()
		.sorted()
		.filter(n->n%2==0)
		.forEach(n->System.out.print(n+" "));
		
		System.out.println();
		System.out.println("---홀수만 출력---");
		// 배열로 리턴
		int[] arr2 = Arrays.stream(arr).filter(a->a%2==1)
				.distinct().sorted().toArray();
		for(int tmp : arr2) {
			System.out.print(tmp+" ");
		}
	}

}
