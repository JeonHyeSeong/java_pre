package Day22;

import java.util.ArrayList;
import java.util.Scanner;

public class English implements EnglishInterface{

	ArrayList<EnglishWord> list = new ArrayList<>();

	@Override
	public void wordAdd(Scanner scan) {
		// 단어등록
		System.out.print("등록할 단어를 입력하세요 > ");
		String word = scan.next();
		System.out.print("단어의 뜻을 입력하세요 > ");
		String mean = scan.next();
		EnglishWord Word = new EnglishWord(word,mean);
		list.add(Word);
	}

	@Override
	public void searchWord(Scanner scan) {
		// 단어검색
		System.out.print("검색할 단어를 입력하세요 > ");
		String word = scan.next();
		for(EnglishWord tmp : list) {
			if(tmp.getWord().equals(word)) {
				System.out.println("단어 : "+tmp.getWord()+", 뜻 : "+tmp.getMean());
				return;
			}
		}
		System.out.println("찾는 단어가 없습니다.");
	}

	@Override
	public void updateWord(Scanner scan) {
		// 단어수정
		System.out.print("수정할 단어를 입력하세요 > ");
		String word = scan.next();
		for(EnglishWord tmp : list) {
			if(tmp.getWord().equals(word)) {
				System.out.print("수정할 뜻을 입력하세요 > ");
				String mean = scan.next();
				tmp.setMean(mean);
				System.out.println("단어가 수정되었습니다.");
				return;
			}
		}
		System.out.println("찾는 단어가 없습니다.");
	}

	@Override
	public void printWord() {
		// 단어출력
		System.out.println("---영어사전---");
		for(EnglishWord tmp : list) {
			System.out.println("단어 : "+tmp.getWord()+", 뜻 : "+tmp.getMean());
		}
	}

}
