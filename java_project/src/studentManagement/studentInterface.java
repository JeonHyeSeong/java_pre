package studentManagement;

import java.util.Scanner;

public interface studentInterface {

	void studentAdd(Scanner scan); // 학생 추가
	void studentDelete(Scanner scan); // 학생 삭제
	void studentSearch(Scanner scan); // 학생 검색
	void GradeAdd(Scanner scan); // 성적 추가
	void GradeDelete(Scanner scan); // 성적 삭제
	void GradeUpdate(Scanner scan); // 성적 수정
	void studentList(); // 학생 리스트 출력
	void studentPrint(); // 학생 성적 출력 
	
	
}
