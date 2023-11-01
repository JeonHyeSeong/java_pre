package studentManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement implements studentInterface{
	
	private ArrayList<Student> student = new ArrayList<>();
	private ArrayList<StudentGrade> grade = new ArrayList<>();

	@Override
	public void studentAdd(Scanner scan) {
		// 학생 추가
		System.out.println("추가할 학생의 이름을 입력하세요.");
		String studentName = scan.next();
		System.out.println("추가할 학생의 나이를 입력하세요.");
		int age = scan.nextInt();
		student.add(new Student(studentName, age));
		System.out.println("학생이 추가되었습니다.");
	}
	
	@Override
	public void studentDelete(Scanner scan) {
		// 학생 삭제
		System.out.println("삭제할 학생의 이름을 입력하세요.");
		String studentName = scan.next();
		for(int i = 0; i < student.size(); i++) {
			if(student.get(i).getName().equals(studentName)) {
				student.remove(i);
			}
		}
		System.out.println("학생이 삭제되었습니다.");
			
	}

	@Override
	public void studentSearch(Scanner scan) {
		// 학생 검색
		System.out.println("검색할 학생의 이름을 입력하세요.");
		String studentName = scan.next();
		for(Student s : student) {
			if(s.getName().equals(studentName)) {
				System.out.println(s);
			}
		}
	}

	@Override
	public void GradeAdd(Scanner scan) {
		// 학생 점수 추가
		System.out.println("점수를 추가할 학생의 이름을 입력하세요.");
		String studentName = scan.next();
		for(int i = 0; i < student.size(); i++) {
			if(student.get(i).getName().equals(studentName)) {
					System.out.print("국어점수");
					int score = scan.nextInt();
					grade.add(new StudentGrade("국어",score));
					System.out.print("영어점수");
					score = scan.nextInt();
					grade.add(new StudentGrade("영어",score));
					System.out.print("수학점수");
					score = scan.nextInt();
					grade.add(new StudentGrade("수학",score));	
			}
		}
	}

	
	@Override
	public void GradeDelete(Scanner scan) {
		// 학생 점수 삭제
		System.out.println("점수를 삭제할 학생의 이름을 입력하세요.");
		String studentName = scan.next();
		for(int i = 0; i < student.size(); i++) {
			if(student.get(i).getName().equals(studentName)) {
				System.out.println("점수를 삭제할 과목을 입력하세요.");
				String subjectName = scan.next();
				if(grade.get(i).getSubject().equals(subjectName)) {
					grade.remove(i);
				}
			}
		}
		System.out.println("점수가 삭제되었습니다.");
	}

	@Override
	public void GradeUpdate(Scanner scan) {
		// 학생 점수 수정
		System.out.println("점수를 수정할 학생의 이름을 입력하세요.");
		String studentName = scan.next();
		for(int i = 0; i < student.size(); i++) {
			if(student.get(i).getName().equals(studentName)) {
				System.out.println("점수를 수정할 과목을 입력하세요.");
				String subjectName = scan.next();
				System.out.println("수정할 점수를 입력하세요.");
				int score = scan.nextInt();
				if(grade.get(i).getSubject().equals(subjectName)) {
					grade.set(i, new StudentGrade(subjectName,score));
				}
			}
		}
		System.out.println("점수가 수정되었습니다.");
	}

	@Override
	public void studentList() {
		// 학생 리스트 출력
		System.out.println("---학생리스트---");
		for(Student s : student) {
			System.out.println(s);
		}
	}

	@Override
	public void studentPrint() {
		// 학생 성적 출력
		int sum = 0;
		double avg = 0;
		int cnt = 0;
		System.out.println("---학생 성적---");
		for(Student s : student) {
			System.out.println(s);
		}
		for(StudentGrade sg : grade) {
			System.out.println(sg);
		}
		for(int i = 0; i < grade.size(); i++) {
			sum += grade.get(i).getScore();
			cnt++;
		}
		avg = (double)sum/cnt;
		System.out.println("점수합계 : "+sum);
		System.out.println("평균 : "+avg);
	}

}
