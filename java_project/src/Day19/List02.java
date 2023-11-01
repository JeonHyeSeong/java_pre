package Day19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class List02 {

	public static void main(String[] args) {
		/* 두 배열을 매개변수로 입력받아서 하나로 합치는 ArrayList를 구성
		 * list = a b c d e f g h
		 * */
		String arr1[] = new String[] {"a","e","c","g"};
		String arr2[] = new String[] {"b","f","d","h","k","j"};
		// 합치기 => 정렬
		ArrayList<String> list = new ArrayList<String>();
//		int cnt = arr1.length + arr2.length;
//		int i = 0, j = 0;
//		while(cnt > list.size()) {
//			if(i < arr1.length) {
//				list.add(arr1[i]);
//				i++;
//			}
//			if(j < arr2.length) {
//				list.add(arr2[i]);
//				j++;
//			}
//		}
//		System.out.println(list);
//		Collections.sort(list);
		
		
		for(int i = 0; i < arr1.length; i++) {
			list.add(arr1[i]);
		}
		
		for(int i = 0; i < arr2.length; i++) {
			list.add(arr2[i]);
		}
		
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}
		
		list.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				
				return o1.compareTo(o2);
			}
			
		});
		
		System.out.println();
		System.out.println("---오름차순 정렬---");
		System.out.println(list);
		

	}

}
