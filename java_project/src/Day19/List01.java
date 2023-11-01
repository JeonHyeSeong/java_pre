package Day19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class List01 {

	public static void main(String[] args) {
		/* 하루 일과를 저장하는 list 생성
		 * */
		// 출력을 for / 향상된 for / Iterator 사용하여 출력
		ArrayList<String> list = new ArrayList<String>();
		list.add("09:00 기상");
		list.add("09:30 아침식사");
		list.add("10:30 운동");
		list.add("13:00 점심식사");
		list.add("15:00 학원");
		list.add("18:30 저녁식사");
		list.add("10:30 귀가");
		list.add("03:00 취침");
		System.out.println("--일반 for문 출력--");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("--향상된 for문 출력--");
		for(String tmp : list) {
			System.out.println(tmp);
		}
		
		System.out.println("--Iterator 사용 출력--");
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			String tmp = it.next();
			System.out.println(tmp);
		}
		
		Collections.sort(list);
		System.out.println(list);
		
		list.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// 숫자는 - 크다,작다를 이용 가능.
				// 문자는 compareTo 메서드를 활용하여 정렬
				return o2.compareTo(o1);
			}
		});
		System.out.println(list);

	}

}
