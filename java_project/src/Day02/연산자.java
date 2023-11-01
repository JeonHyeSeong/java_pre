package Day02;

public class 연산자 {

	public static void main(String[] args) {
		// 연산자 정리
		/* 대입연산자 : =,+=,-=
		 * =을 기준으로 오른쪽에 있는 값을 왼쪽에 저장
		 * a = b : b를 a에 넣어라(저장해라, 덮어써라)
		 * a는 반드시 변수여야만 한다.
		 * a += b : 기존 a의 값과 현재 b를 더해서 a에 저장
		 * a = a + b  == a += b
		 * */
		int a = 10;
		System.out.println("a : "+a); //10
		//sysout ctrl+space (코드 빠른 실행 : 자동완성)
		
		int b = 20;
		a=b;
		System.out.println("a : "+a); //20
		
		int c = 1;
		c = c + a; // c = 1 + 20
		System.out.println("c : "+c);
		c+=a; // 21+20
		System.out.println("c : "+c);
		c-=a;
		System.out.println("c : "+c);
		// 증감연산자 : ++ 1증가 / -- 1감소
		c++;
		System.out.println("31번줄c : "+c); //22
	    // (++c) : 증가하고 값을 찍는다. (c++) : 값을 찍고 증가
		System.out.println("33번줄c : "+(++c)); //23
		System.out.println("34번줄c : "+c); //23
		
		/* 산술연산자 : + - * / %(나머지)
		 * 나누기(/)
		 * 정수 / 정수 = 정수 (10 / 3 = 3) 소수점 버림
		 * 정수 / 실수 = 실수
		 * 실수 / 정수 = 실수
		 * 실수 / 실수 = 실수
		 * 값 / 0 => 예외발생
		 * */
		System.out.println("3+2="+(3+2));
		System.out.println("3-2="+(3-2));
		System.out.println("3*2="+(3*2));
		System.out.println("3/2="+(3/2.0));
		//System.out.println("3/0="+(3/0)); //예외발생
		// 나머지연산자 : % 배수나 약수를 구할때 사용
		System.out.println("3%2="+(3%2));
		
		/* 비교연산자 : 비교연산자의 결과는 true / false
		 * >=(이상), <=(이하), >(초과), <(미만)
		 * ==(같다), !=(같지않다)
		 * () && ()  => (둘다 true여야 true 리턴)
		 * () || ()  => (둘 중 하나만 true라도 true return)
		 * */
		System.out.println("3>2 ? "+(3>2));
		System.out.println("3<2 ? "+(3<2));
		System.out.println("3==2 ? "+(3==2));
		System.out.println("3!=2 ? "+(3!=2));
		
		System.out.println("&& 연산자 결과 : "+(3>2 && 4<3));
		System.out.println("|| 연산자 결과 : "+(3>2 || 4<3));
		
		/* 조건선택 연산자 : 3항연산자 
		 * (조건식) ? true : false
		 * */
		System.out.println((3<2)? "참입니다." : "거짓입니다.");
		
		/* 문제 : num가 짝수인지 홀수인지 출력
		 * 조건선택 연산자를 이용하여 출력
		 * 짝수란 2로 나누어서 나머지가 0인 값
		 * */
		int num = 10;
		System.out.println((num%2==0)? "짝수" : "홀수");
		// 문자열을 저장하는 자료형 String
		String result = (num % 2 == 0)? "짝수" : "홀수";
		System.out.println(result);
				

	}

}
