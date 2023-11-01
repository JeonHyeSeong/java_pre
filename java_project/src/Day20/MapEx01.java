package Day20;

import java.util.HashMap;
import java.util.Scanner;

public class MapEx01 {

	public static void main(String[] args) {
		/* 단어장
		 * 단어(5개)를 입력받아 콘솔에 출력하는 메서드
		 * --단어장--
		 * hello : 안녕
		 * apple : 사과
		 * orange : 오렌지
		 * */
		Scanner scan = new Scanner(System.in);
		HashMap<String, String> map = new HashMap<>();
		for(int i = 1; i <= 5; i++) {
			System.out.print("단어 입력 > ");
			String str = scan.next();
			System.out.print("뜻 입력 > ");
			String str1 = scan.next();
			map.put(str, str1);
		}
		
		System.out.println("--단어장--");
		for(String tmp : map.keySet()) {
			System.out.println(tmp+" : "+map.get(tmp));
		}
		
		scan.close();

	}

}
