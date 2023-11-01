package Day19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Collection01 {

	public static void main(String[] args) {
		/* 컬렉션 프레임워크 : 표준화된 방식의 자료구조
		 * List, Set, Map => 인터페이스. 반드시 구현 클래스로 객체를 생성
		 * 데이터를 묶어서 관리할때 사용
		 * 주로 배열대신 사용
		 * 
		 * List : 배열과 동일
		 * - 값을 하나씩 저장
		 * - 순서를 보장(index)
		 * - 중복 허용
		 * - 배열 대신에 가장 많이 사용하는 구조
		 * 
		 * Set
		 * - 값을 하나씩 저장
		 * - 순서를 보장X (index 없음 - 번지가 없음.)
		 * - 중복 허용X (같은 자료가 입력되면 버려짐.)
		 * 
		 * Map
		 * - 값을 두개씩 저장 key/value 쌍으로 저장
		 * - key는 중복 불가능 / value는 중복 가능.
		 * - key가 중복되면 value는 덮어쓰기 됨.
		 * - 아이디/패스워드와 같이 묶어서 하나의 자료로 저장해야 할 때 사용
		 * 
		 * 배열은 기본자료형, 클래스 자료형으로 구성가능.
		 * int arr[], String arr[], Student arr[]
		 * collection에서는 기본 자료형X 클래스 자료형으로만 구성 가능.
		 * 
		 * int -> Integer, String, 나머지 기본자료형들은 첫글자만 대문자로 변환하면 
		 * 클래스가 됨. Byte, Boolean => 기본 자료형의 클래스들.
		 * 
		 * 만약 클래스를 지정하지 않으면 Object가 자동 설정됨.
		 * 
		 * List<클래스형> 객체명 = new 구현클래스<클래스형>();
		 * List => 구현 클래스 ArrayList(검색이 많은 케이스) / LinkedList (추가,삭제가 많은 케이스)
		 * 
		 * ArrayList => 배열과 비슷한 자료구조 값을 등록하는 형태
		 * 미리 길이를 지정하지 않음. 추가되면 늘어나고, 삭제되면 줄어드는 형태
		 * 추가, 삭제가 쉽다. => 검색이 쉽다.
		 * 
		 * LinkedList => 값을 중간에 끼워넣기, 중간에서 빼기 형태가 쉽다.
		 * 검색이 느리다.
		 * */
		List<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		ArrayList list3 = new ArrayList(); // 자료형이 Object가 됨.
		
		// add() : 요소를 추가
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list);
		
		// size() : list의 총개수
		System.out.println(list.size());
		
		// 문자열을 담을 수 있는 ArrayList 생성
		// 문자를 5개 저장한 후 출력
		// 총개수가 몇개인지도 출력
		ArrayList<String> list4 = new ArrayList<String>();
		list4.add("자바");
		list4.add("자바");
		list4.add("자바");
		list4.add("자바");
		list4.add("자바");
		System.out.println(list4);
		System.out.println(list4.size()+"개");
		
		// 값을 하나씩 찍어보기
		// get(): 값을 가져올때 / set() : 값을 변경할때
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		// 리스트 생성하고, 1~10까지 저장한 후 출력
		ArrayList<Integer> list5 = new ArrayList<Integer>();
		for(int i = 1; i <= 10; i++) {
			list5.add(i);
		}
		System.out.println(list5);
		// index번지는 0번지부터
		System.out.println(list5.get(1));
		
		// set(index, 값) : 값을 변경할때
		list5.set(0, 7);
		System.out.println(list5);
		
		// remove(index) : index 번지의 값을 삭제
		// remove(Object) : Object의 요소(값)를 삭제
		list5.remove(0);
		System.out.println(list5);
		Integer a = 9;
		list5.remove(a); // 요소를 삭제
		System.out.println(list5);
		
		// contains(Object) : list에 값이 있는지 검사 true / false로 리턴
		System.out.println(list5.contains(a));
		
		// clear() : 리스트 비움(요소 전부 삭제)
		list5.clear();
		System.out.println(list5);
		
		// isEmpty() : list가 비어있는지 체크 비어있으면 true
		System.out.println(list5.isEmpty());
		
		// 리스트 생성하고, 1~10까지 채운 후 출력 (for 이용하여 요소를 꺼내서 출력)
		for(int i = 1; i <= 10; i++) {
			list5.add(i);
		}
		for(int i = 0; i < list5.size(); i++) {
			System.out.print(list5.get(i)+" ");
		}
		// 요소에서 5를 삭제
		Integer b = 5;
		list5.remove(b);
		// 다시 출력 : 향상된 for문 사용
		System.out.println();
		for(int tmp : list5) {
			System.out.print(tmp+" ");
		}
		System.out.println("---------------");
		
		// Iterator : index가 없는 값을 출력하기 위해 사용
		/* list에서는 순서를 보장하기 때문에 get(i)를 사용하여 원하는 번지에 접근이 가능.
		 * set / map은 순서를 보장하지 않기 때문에 (일반)for문을 이용할 수 없음.
		 * 향상된 for, Iterator 처럼 순서와 상관없이 값을 가져올 수 있는 구문을 사용
		 * 향상된 for / Iterator는 map에서 직접 사용 불가능.
		 * */
		System.out.println(">> Iterator 출력");
		Iterator<Integer> it = list5.iterator();
		while(it.hasNext()) { // hasNext() 다음 요소가 있는지 체크 true / false
			Integer tmp = it.next(); // next() 다음 요소 가져오기
			System.out.print(tmp+" ");
		}
		System.out.println();
		// indexOf(값) : 해당 값이 list의 index를 반환 / 없다면 -1 리턴
		Integer c = 9;
		System.out.println(list5.indexOf(c));
		
		// 리스트 생성 후 값을 무작위로 5개만 추가
		list2.add(3);
		list2.add(6);
		list2.add(7);
		list2.add(2);
		list2.add(9);
		System.out.println(list2);
		
		// Collections.sort() // 오름차순만 가능.
		//Collections.sort(list2);
		//System.out.println(list2);

		// sort(comparator를 구현한 객체) : 정렬
		// 객체 : Comparator 인터페이스를 구현한 객체를 넣어야 함. (익명클래스를 사용)
		// 비교(compare) 메서드를 구현하여 객체를 정렬
		// compareTo : 사전상 앞에 있으면 -1, 같으면 0, 뒤에 있으면 1
		
		list2.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// compare 역할 : 결과가 -면 앞으로 보내고, +면 뒤로 보내는 역할
				// o1-o2 : 오름차순, o2-o1 : 내림차순
				return o2 - o1;
			}
			
		});
		System.out.println(list2);
		

	}

}
