package word;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordManager {
	private ArrayList<Word> list = new ArrayList<>();
	
	public void addWord() {
		list.add(new Word("dog","강아지"));
		list.add(new Word("cat","고양이"));
		list.add(new Word("apple","사과"));
		list.add(new Word("orange","오렌지"));
	}

	public void insertWord(Scanner scan) {
		// 단어등록
		Word w = new Word();
		System.out.println("단어 : ");
		w.setWord(scan.next());
		System.out.println("의미 : ");
		scan.nextLine();
		w.setMean(scan.nextLine());
		list.add(w);
		System.out.println("등록 완료~!!");
	}

	public void searchWord(Scanner scan) {
		// 단어검색
		System.out.println("검색단어 : ");
		String s = scan.next();
		for(Word tmp : list) {
			if(tmp.getWord().equals(s)) {
				System.out.println("--검색결과--");
				System.out.println(tmp);
				return;
			}
		}
		System.out.println("검색결과가 없습니다.");
	}

	public void modifyWord(Scanner scan) {
		// 삭제 후 다시 추가
		System.out.println("수정단어 : ");
		String s = scan.next();
		Word w = new Word(s);
		// 해당 클래스 중 word만 같아도 같은 클래스로 인식
		boolean res = list.remove(w);
		if(!res) {
			System.out.println("검색단어가 없습니다.");
			return;
		}
		// 값 다시 추가
		insertWord(scan);
	}

	public void printWord() {
		// 단어출력
		System.out.println("--단어장--");
		Collections.sort(list);
		for(Word tmp : list) {
			System.out.println(tmp);
		}
	}

	public void filePrint() throws IOException {
		// 파일로 출력
		FileWriter fw = new FileWriter("word.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		StringBuffer sb = new StringBuffer();
		int cnt = 0;
		String data = "";
		while(cnt < list.size()) { // 리스트가 모두 소진될때까지
			sb.append(list.get(cnt).toString());
			sb.append("\r\n"); // 줄바꿈
			data = sb.toString();
			cnt++;
		}
		System.out.println(data);
		fw.write(data);
		fw.close();
		bw.close();
	}
	
}