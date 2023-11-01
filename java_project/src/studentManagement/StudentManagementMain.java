package studentManagement;

import java.util.Scanner;

public class StudentManagementMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StudentManagement stu = new StudentManagement();
		
		int menu = 0;
		
		do {
			System.out.println("1.학생추가|2.학생삭제|3.학생검색");
			System.out.println("4.학생점수추가|5.학생점수삭제|6.학생점수수정");
			System.out.println("7.학생리스트|8.학생성적|9.종료");
			System.out.println("메뉴선택 >> ");
			
			menu = scan.nextInt();
			
			switch(menu) {
			case 1 : stu.studentAdd(scan); break;
			case 2 : stu.studentDelete(scan); break;
			case 3 : stu.studentSearch(scan); break;
			case 4 : stu.GradeAdd(scan); break;
			case 5 : stu.GradeDelete(scan); break;
			case 6 : stu.GradeUpdate(scan); break;
			case 7 : stu.studentList(); break;
			case 8 : stu.studentPrint(); break;
			case 9 : break;
			default : 
				System.out.println("잘못된 메뉴 입니다.");
				break;
			}
			
		}while(menu != 9);
		System.out.println("프로그램 종료~!!");
		
		
		
		
		scan.close();

	}

}
