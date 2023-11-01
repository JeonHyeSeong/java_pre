package Day14;

//import java.util.Scanner;

public class Ezen_main {

	public static void main(String[] args) {
		EzenComputer1 ec1 = new EzenComputer1("홍길동", "980111", 26,
				"010-3333-3333", "인천");
		ec1.insertCourse("java", "6개월");
		EzenComputer1 ec2 = new EzenComputer1("홍길순", "951115", 29,
				"010-3333-3333", "강남");
		ec2.insertCourse("python", "3개월");
		EzenComputer1 ec3 = new EzenComputer1("김길동", "960415", 28,
				"010-3333-3333", "인천");
		ec3.insertCourse("CSS", "3개월");
		EzenComputer1 ec4 = new EzenComputer1("박길동", "930807", 31,
				"010-4444-4444", "강남");
		ec4.insertCourse("java", "6개월");
		EzenComputer1 ec5 = new EzenComputer1("최길동", "000103", 24,
				"010-5555-5555", "인천");
		ec5.insertCourse("python", "3개월");
		EzenComputer1 ec6 = new EzenComputer1("고길동", "970710", 27,
				"010-6666-6666", "수원");
		ec6.insertCourse("java", "2개월");
		ec6.insertCourse("python", "1개월");
		EzenComputer1 ec7 = new EzenComputer1("이길동", "990304", 25,
				"010-7777-7777", "인천");
		ec7.insertCourse("HTML", "1개월");
		
		
		// 숙제
		/* 배열로 5명의 학생 등록후 // 마음대로 등록
		 * - 이름으로 검색 (어느 지점(학원정보)의 무슨과목(수강정보)을 듣고 있는지 출력)
		 * - 지점으로 검색 (지점에 있는 학생(학생정보)들 모두 출력)
		 * */
		EzenComputer1[] std = new EzenComputer1[7];
		std[0] = ec1;
		std[1] = ec2;
		std[2] = ec3;
		std[3] = ec4;
		std[4] = ec5;
		std[5] = ec6;
		std[6] = ec7;
		
		String searchName = "홍길동";
		int cnt = 0;
		System.out.println(searchName+"님의 search 정보----");
		for(int i = 0; i<std.length; i++) {
			if(searchName.equals(std[i].getName())) {
				std[i].printCompany();
				std[i].printInfo();
				std[i].printCourse();
				cnt++;
			}
		}
		if(cnt == 0) {
			System.out.println("찾는 학생이 없습니다.");
		}
		System.out.println();
		System.out.println("-----------------");
		// 인천 지점의 학생들 모두 검색, 지점정보, 학생정보
		String searchBranch = "인천";
		System.out.println(searchBranch+"지점의 search 정보----");
		for(int i = 0; i < std.length; i++) {
			if(searchBranch.equals(std[i].getBranch())) {
				std[i].printInfo();
			}
		}
		
		System.out.println();
		System.out.println("-----------------");
		String searchCourse = "java";
		System.out.println(searchCourse+"과정의 수강학생 정보----");
		int count = 0;
		while(count < std.length) {
			for(int i = 0; i <std[count].getCourse().length; i++) {
				if(std[count].getCourse()[i] != null) {
					if(searchCourse.equals(std[count].getCourse()[i])) {
						std[count].printCompany();
						std[count].printInfo();
						std[count].printCourse();
					}
				}
			}

			count++;
		}

//		Scanner scan = new Scanner(System.in);
//		System.out.println("이름,지점을 검색하세요");
//		String str = scan.next();
//		for(int i=0; i<std.length; i++) {
//			if(std[i].getName().equals(str)) {
//				std[i].printCompany();
//				std[i].printCourse();
//			}
//		}
//		
//		for(int i = 0; i < std.length; i++) {
//			if(std[i].getBranch().equals(str)) {
//				std[i].printInfo();
//			}
//		}
//		
//		scan.close();
		
	}

}
