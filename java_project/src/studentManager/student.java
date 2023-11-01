package studentManager;

public class student {
	private String name;
	private String birth;
	private String phone;
	private String age;
	private final static String COMPANY = "EZEN 아카데미";
	private final static String BRANCH = "인천지점";
	private subject[] sub = new subject[5];
	private int Count;
	
	public student() {}
	
	public student(String name, String birth, String phone, String age) {
		this.name = name;
		this.birth = birth;
		this.phone = phone;
		this.age = age;
	}
	
	public void printInfo() {
		System.out.println("--학생정보--");
		System.out.println("학원명 : "+COMPANY+", "+"지점 : "+BRANCH);
		System.out.println("이름 : "+name+", "+"age : "+age+"세");
		System.out.println("tel : "+phone+", 생년월일 : "+birth);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public subject[] getSub() {
		return sub;
	}

	public void setSub(subject[] sub) {
		this.sub = sub;
	}

	public int getCount() {
		return Count;
	}

	public void setCount(int count) {
		Count = count;
	}
	
	

}
