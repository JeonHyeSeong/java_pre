package Day08;

public class String01 {

	public static void main(String[] args) {
		/* String 클래스 = 문자열을 다루는 클래스 => 참조변수
		 * String str = new String(); // 정석
		 * String str = "홍길동"; // 일반자료형처럼 이용가능
		 * */
		String str = "Hello World~!!"; // 한글자마다 배열처럼 이용
		System.out.println(str);
		
		// length : 전체 글자의 길이
		System.out.println("--length--");
		System.out.println(str.length());
		
		// charAt(index) : index번지에 있는 문자열을 반환
		System.out.println("--charAt(0)--");
		System.out.println(str.charAt(0));
		
		// subString : 문자열을 추출
		System.out.println("--substring--");
		System.out.println(str.substring(3)); // 3번지부터 끝까지
		System.out.println(str.substring(3, 10)); // 3번지부터 10번지(10번지는 포함X)까지
		
		// str.compareTo(str1) : str문자열과 비교하여 같으면 0, 사전순으로 앞이면 -1, 뒤면 1
		System.out.println("--compareTo--");
		System.out.println("b.".compareTo("a")); // 1
		System.out.println("a".compareTo("c"));  // -1 앞에 있는 칸만큼 -
		System.out.println("a".compareTo("a"));  // 0
		
		// concat : 이어붙이기(+ 연산자와 같은 의미)
		System.out.println("--concat--");
		System.out.println("Hello".concat(" Apple~!!"));
		System.out.println("Hello "+"Apple~!!");
		
		// equals : 두 문자열이 같은지 확인(대소문자 구분) 같으면 true
		// 문자는 ==로 같은지 비교가 안됨.
		// 참조변수를 ==로 비교하면 주소가 같은지 비교
		System.out.println("--equals--");
		System.out.println("abc".equals("def")); // false
		System.out.println("abc".equals("abc")); // true
		
		// indexOf : 문자의 위치를 찾아주는 기능, 찾는 문자가 없으면 -1을 리턴
		// lastIndexOf : 문자의 위치를 뒤에서부터 찾아주는 기능
		System.out.println("--indexOf--");
		System.out.println(str.indexOf("l"));
		System.out.println(str.lastIndexOf("l"));
		String email = "hello1234@naver.com";
		// 아이디를 추출해서 출력
		System.out.println(email.indexOf("@"));
		System.out.println(email.substring(0,email.indexOf("@")));
		System.out.println(email.substring(email.indexOf("@")+1));
		
		// trim : 불필요한 공백 제거
		System.out.println("--trim--");
		System.out.println("    Hello    ".trim());
		
		// toLowerCase(), toUpperCase() : 대소문자 변환
		System.out.println("--toLowerCase--");
		System.out.println("--toLowerCase--".toLowerCase()); // 소문자 변환
		System.out.println("--toLowerCase--".toUpperCase()); // 대문자 변환
		
		// isEmpty() : 객체가 비어있는지 체크 비어있으면 true
		System.out.println("--isEmpty--");
		System.out.println(str.isEmpty());
		
		// replace : 글자를 치환(변환)
		System.out.println("--replace--");
		System.out.println("Hello World".replace("World", "JAVA"));
		
		// split : 특정 값을 기준으로 나누기 => 배열로 리턴
		System.out.println("--split--");
		String str1 = "dog,cat,tiger";
		String[] arr = str1.split(",");
		for(String tmp : arr) {
			System.out.print(tmp+" ");
		}
		System.out.println();
		String[] arr2 = str1.split("");
		for(String tmp : arr2) {
			System.out.print(tmp+" ");
		}
		System.out.println();
		
		String num1 = "1";
		String num2 = "2";
		String sum = num1 + num2;
		System.out.println(sum);
		
		// Integer.parseInt() : 문자를 숫자로 변환
		int num3 = Integer.parseInt(num1);
		int num4 = Integer.parseInt(num2);
		System.out.println(num3+num4);
		
		// String.valueOf() : 숫자를 문자로 변환
		// instanceof : 객체의 형이 일치하는지 체크
		int a = 12345;
		String s = String.valueOf(a);
		System.out.println(s instanceof String);

	}

}
