package studentManager;

import java.util.Scanner;

public interface program {
	/* 1.interface 생성 => program => class manager가 구현
       - 학생 리스트 출력기능
       - 학생 등록 기능
       - 학생 검색 기능
       - 수강 신청 기능
       - 수강 철회 기능
	 * */
	
	// 학생 리스트 출력
	void printStudent();
	// 학생 등록
	void insertStudent(Scanner scan);
	// 학생 검색
	void searchStudent(Scanner scan);
	// 수강 신청
	void registerSubject(Scanner scan);
	// 수강 철회
	void deleteSubject(Scanner scan);
	

}
