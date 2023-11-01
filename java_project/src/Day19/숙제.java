package Day19;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class 숙제 {

	public static void main(String[] args) {
		/* map을 이용하여 상품과 가격을 추가하여 합계를 구하시오.
		 * 상품을 map에 추가하는 값은 메서드로 작업
		 * 1. map은 main에 만들어놓고, 메서드로 추가만(매개변수로 받기)
		 * 2. map을 메서드에서 만들어서 main으로 리턴
		 * ex)
		 * 가위, 2500
		 * 크레파스, 4000
		 * 합계 : 6500
		 * */
		
		// 매개변수 : HashMap<String, Integer> map
		// 리턴(타입만) : HashMap<String, Integer>
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		숙제 m = new 숙제();
		m.makeMap(map);
		
		int sum = 0;
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			sum += map.get(key);
			int value = map.get(key);
			System.out.println(key+" : "+value+"원");
		}
		System.out.println("합계 : "+sum+"원");
		
		System.out.println("----------------");
		HashMap<String, Integer> map2 = m.add();
		int tot = 0;
		for(String tmp : map2.keySet()) {
			int value2 = map2.get(tmp);
			tot += value2;
			System.out.println(tmp+" : "+value2+"원");
		}
		System.out.println("합계 : "+tot+"원");
		

	}
	// map을 매개변수로 받아(실 map 객체는 다른곳에 있다라는 의미) 사용
	public void makeMap(HashMap<String, Integer> map) {
		// 값을 추가
		map.put("가위", 2500);
		map.put("크레파스", 4000);
	}
	
	public HashMap<String, Integer> add(){
	    // 리턴을 해야함.
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("펜", 2500);
		map.put("물감", 4000);
		map.put("노트", 2000);
		return map;
	}

}
