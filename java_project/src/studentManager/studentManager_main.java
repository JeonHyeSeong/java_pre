package studentManager;

import java.util.Scanner;

public class studentManager_main{

	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		student[] std = new student[5];
		manager m = new manager();
		int menu = 0;
		do {
			System.out.println("--menu--");
			System.out.println("1.학생등록 | 2.학생확인 | 3.학생검색 | 4.수강신청 | 5.수강철회 | 6.종료");
			System.out.println("메뉴를 선택하세요");
			menu = scan.nextInt();
			switch(menu) {
			case 1 : m.insertStudent(scan); break;
			case 2 : m.printStudent(); break;
			case 3 : m.searchStudent(scan); break;
			case 4 : m.registerSubject(scan); break;
			case 5 : m.deleteSubject(scan); break;
			case 6 : System.out.println("종료합니다"); break;
			}
		}while(menu != 6);

	}


}