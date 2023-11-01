package Day19;

import java.util.HashMap;
import java.util.Scanner;

public class Map02 {

	public static void main(String[] args) {
		/* 과목과 점수를 입력받아(Scanner) 출력
		 * 합계, 평균 출력
		 * 종료 키워드가 나올때까지 반복(0 = 종료)
		 * 과목과 점수를 입력해주세요. >
		 * ex)
		 * 국어 89
		 * 수학 78
		 * 0 종료
		 * map으로 출력 후 합계, 평균 출력
		 * */
		Scanner scan = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		while(true) {
			System.out.print("과목과 점수를 입력해주세요. > ");
			String sub = scan.next();
			if(sub.equals("0")) {
				System.out.println("종료");
				break;
			}
			int score = scan.nextInt();
			map.put(sub, score);
		}

		int sum = 0;
		for(String tmp : map.keySet()) {
			sum += map.get(tmp);
		}
		double avg = sum / map.size();
				
		System.out.println("점수의 합계 : "+sum);
		System.out.println("점수의 평균 : "+avg);
		
		scan.close();

	}

}
