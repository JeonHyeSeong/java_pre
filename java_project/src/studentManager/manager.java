package studentManager;

import java.util.Scanner;

public class manager implements program{
	private String name;
	private String birth;
	private String phone;
	private String age;
	private final static String COMPANY = "EZEN 아카데미";
	private final static String BRANCH = "인천지점";
	private student[] std = new student[5];
	private int count;

	@Override
	public void printStudent() {
		System.out.println("--학생정보--");
		System.out.println("학원명 : "+COMPANY+", "+"지점 : "+BRANCH);
		System.out.println("이름 : "+name+", "+"age : "+age+"세");
		System.out.println("tel : "+phone+", 생년월일 : "+birth);
	}

	@Override
	public void insertStudent(Scanner scan) {
		System.out.println("학생을 등록합니다.");
		System.out.println("이름 > ");
		name = scan.next();
		System.out.println("나이 > ");
		age = scan.next();
		System.out.println("전화번호 > ");
		phone = scan.next();
		System.out.println("생년월일 > ");
		birth = scan.next();
		student stu = new student(name,age,phone,birth);
		
		
	}

	@Override
	public void searchStudent(Scanner scan) {
		System.out.println("학생을 검색해주세요 > ");
		name = scan.next();
		printStudent();
	}

	@Override
	public void registerSubject(Scanner scan) {
		System.out.println("수강신청");
		
	}

	@Override
	public void deleteSubject(Scanner scan) {
		System.out.println("수강을 철회합니다");
		
	}

}
