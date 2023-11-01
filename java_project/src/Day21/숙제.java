package Day21;

import java.util.ArrayList;
import java.util.Comparator;

public class 숙제 {

	public static void main(String[] args) {
		/* 여행사 상품이 있습니다.
		 * 여행 비용은 15세 이상은 100만원, 그 미만은 50만원 계산
		 * 고객 3명이 패키지 여행을 떠난다고 했을때
		 * 1. 비용계산 2. 고객 명단 => 출력
		 * 고객의 클래스를 생성하고 ArrayList로 고객 관리
		 * 
		 * 예시) 고객 정보 => 고객 명단
		 *  이름 : 이순신, 나이 : 40, 비용 : 100
		 *  이름 : 김유신, 나이 : 20, 비용 : 100
		 *  이름 : 홍길동, 나이 : 10, 비용 : 50
		 *  총 여행비용 : 250
		 *  
		 *  20대 이상 고객명단 => 이름순으로 정렬
		 *  이름 : 김유신, 나이 : 20, 비용 : 100
		 *  이름 : 이순신, 나이 : 40, 비용 : 100
		 *  
		 * */
		
		ArrayList<Travel> list = new ArrayList<>();
		list.add(new Travel("이순신",40));
		list.add(new Travel("김유신",20));
		list.add(new Travel("홍길동",10));
		list.add(new Travel("강감찬",34));
		list.add(new Travel("홀란드",17));
		
		
		System.out.println("---고객명단---");
		list.stream().forEach(n -> {
			String name = n.getName();
			int age = n.getAge();
			int price = n.getPrice();
			System.out.println("이름 : "+name+", 나이 : "+age+", 비용 : "+price);
		});
		
		int total = list.stream().mapToInt(n->n.getPrice()).sum();
		System.out.println("총 여행비용 : "+total);

		System.out.println();
		System.out.println("---20대이상 고객명단---");
		// 20세 이상 데이터 출력(오름차순)
//		Collections.sort(list);
//		list.sort(new Comparator<Travel>(){
//			@Override
//			public int compare(Travel o1, Travel o2) {
//				// 이름순으로 정렬
//				// String 정렬 : compareTo
//				// Integer : o1 - o2
//				return o1.getName().compareTo(o2.getName());
//			}
//		});
//		for(Travel tmp : list) {
//			if(tmp.getAge() >= 20) {
//				System.out.println(tmp);
//			}
//		}
		
		// stream을 이용한 방법
		list.stream()
		.filter(n-> n.getAge()>=20)
		.sorted(Comparator.comparing(Travel::getName))
		.forEach(n-> System.out.println("이름 : "+n.getName()+", 나이 : "+
		n.getAge()+", 비용 : "+n.getPrice()));
		// 원하는 요소를 출력할때 map
		System.out.println("---고객명만 출력---");
		list.stream().map(m->m.getName()).forEach(f->System.out.println(f));
		
		// 나이가 20세 이상인 데이터만 추출
		// stream에서 sorted를 하려면 클래스 자체의 정렬이 구현되어 있어야 함.
		list.stream().filter(c->c.getAge() >= 20)
		.sorted()
		.forEach(a->System.out.println(a));

	}

}
