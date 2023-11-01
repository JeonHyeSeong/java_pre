package Day14;

public class ClassEx03 {

	public static void main(String[] args) {
		/* 클래스 생성시 값을 초기화하는 방법
		 * - 기본값, 명시적 초기값, 초기화블럭, 생성자
		 * 1. 기본값 : 기본적으로 지정된 값 int => 0, String => null
		 * 2. 명시적 초기값 : 멤버변수 선언과 동시에 값을 지정하는 방법
		 *     private String name = "홍길동";
		 * 3. 초기화블럭 : {   } 멤버변수의 초기화
		 * 4. 생성자 : 객체를 생성할 때 초기화해서 생성
		 * 초기값들의 우선순위
		 * 기본값 -> 명시적 초기값 -> 초기화블럭 -> 생성자(우선순위 높음)
		 * */
		EzenStudent e = new EzenStudent();
		System.out.println(e);
		
		EzenStudent e2 = new EzenStudent("강남", "홍길동", "자바", "010-1111-1111");
		System.out.println(e2);

	}

}
class EzenStudent {
	// 멤버변수 : 지점="incheon", 이름, 반, 전화번호
	private String pla = "incheon";
	private String name;
	private String cla;
	private String num;
	
	{
		// 초기화블럭 영역
		pla = "인천";
		cla = "미정";
	}
	
	// 생성자
	public EzenStudent() {
		
	}
	public EzenStudent(String pla, String name, String cla,String num) {
		this.pla = pla;
		this.name = name;
		this.cla = cla;
		this.num = num;
	}

	// print 메서드(toString 가능)
	@Override
	public String toString() {
		return "EzenStudent [pla=" + pla + ", name=" + name + ", cla=" + cla + ", num=" + num + "]";
	}

	// getter/setter
	public String getPla() {
		return pla;
	}

	public void setPla(String pla) {
		this.pla = pla;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCla() {
		return cla;
	}

	public void setCla(String cla) {
		this.cla = cla;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}
	
	
}
