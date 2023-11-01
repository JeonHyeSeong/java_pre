package Day20;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class SetEx01 {

	public static void main(String[] args) {
		/* set 중복저장X
		 * set에 로또번호 6개 생성 후 출력
		 * 랜덤으로 1~45
		 * */
		// Math 클래스에서 제공하는 랜덤 메서드 사용
		// int random = (int)(Math.random()*45)+1;
		
		// Random class 별도로 있음. 1~45까지 랜덤수 출력
		HashSet<Integer> set = new HashSet<>();
		
		// 6번 생성X 6개가 중복없이 생성되어 찰때까지
		while(set.size() < 6) {
			int random2 = new Random().nextInt(45)+1;
			set.add(random2);
		}
		System.out.println(set);
		// 오름차순 : set, map은 순서가 없기 때문에 정렬이 안됨.
		// Set중에 정렬이 되는 Set => TreeSet
		
		TreeSet<Integer> treeset = new TreeSet<Integer>();
		while(treeset.size() < 6) {
			int random2 = new Random().nextInt(45)+1;
			treeset.add(random2);
		}
		System.out.println(treeset);

	}

}
