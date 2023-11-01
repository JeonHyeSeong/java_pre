package Day14;

public class EzenComputer {
	/* - 학생 정보를 관리하기 위한 클래스
	 * - 학생 기본정보 : 이름, 생년월일, 전화번호, 나이
	 * - 학원 정보 : 학원명="EZEN", 지점
	 * - 수강 정보 : 수강과목, 기간 
	 *   => 한 학생이 여러과목을 수강하기 위해서는 배열로 처리 5과목
	 * 예) 홍길동 인천 자바 6개월(2023-05-23~2023-11-20)
	 *     홍길동 인천 파이썬 1개월(2023-07-01~2023-08-01)
	 * 홍길동 990101, 010-1111-1111, 24
	 * 학원명 : EZEN, 지점 : 인천
	 * 수강과목 : 자바 6개월(~), 파이썬 1개월(~)
	 * 
	 * 기능
	 * - 학생의 기본정보를 출력하는 기능
	 * - 학생의 학원정보를 출력하는 기능
	 * - 학생의 수강정보를 출력하는 기능
	 * - 학생의 수강정보를 추가하는 기능
	 * */
	
	private String name;
	private String s;
	private String call;
	private String age;
	private final String aca = "EZEN";
	private String gigum;
	private String g[] = new String[5];
	private String d[] = new String[5];
	
	public EzenComputer() {
		
	}
	
	public EzenComputer(String name, String s, String call, String age, String gigum,
			String g[], String d[]) {
		super();
		this.name = name;
		this.s = s;
		this.call = call;
		this.age = age;
		this.gigum = gigum;
		this.g = g;
		this.d = d;
	}
	
	public void Ezeng(String g[], String d[]) {
		
	}

	public void print() {
		System.out.println("이름 : "+name+" 생년월일 : "+s+" 전화번호 : "+call+" 나이 : "+age);
		System.out.println("학원명 : "+aca+" 지점 : "+gigum);
	}
	
	public void Ezprint() {
		System.out.println("수강과목 : "+g+" 기간 : "+d);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

	public String getCall() {
		return call;
	}

	public void setCall(String call) {
		this.call = call;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getGigum() {
		return gigum;
	}

	public void setGigum(String gigum) {
		this.gigum = gigum;
	}

	public String getAca() {
		return aca;
	}
	
	
	

}
