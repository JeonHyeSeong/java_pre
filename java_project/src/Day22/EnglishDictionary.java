package Day22;

import java.util.Scanner;

public class EnglishDictionary {

	public static void main(String[] args) {
		// 영어사전
				/* 메뉴
				* 1.단어등록|2.단어검색|3.단어수정|4.단어출력|5.종료
				* 파일로 저장
				* 클래스로 단어 구성(word, mean) 단어, 뜻
				* -- 단어대로 오름차순정렬
				* */
				Scanner scan = new Scanner(System.in);
				English eng = new English();
				
				int menu = 0;
				
				do {
					System.out.println("--메뉴--");
					System.out.println("1.단어등록|2.단어검색|3.단어수정|4.단어출력|5.종료");
					System.out.print("메뉴선택 > ");
					menu = scan.nextInt();
					
					switch(menu) {
					case 1 : eng.wordAdd(scan); break;
					case 2 : eng.searchWord(scan); break;
					case 3 : eng.updateWord(scan); break;
					case 4 : eng.printWord(); break;
					case 5 : break;
					default :
						System.out.println("잘못된 입력입니다.");
						break;
					}
				}while(menu != 5);
				System.out.println("프로그램 종료");
				
				
				
				scan.close();
				
			}

		}
