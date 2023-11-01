package TrainManager;

import java.util.Scanner;

public class TrainManagerMain {

	public static void main(String[] args) throws InterruptedException{
		
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		TrManager tm = new TrManager();
		boolean run2 = true;
		boolean loding = false;
		tm.addTrain(); //열차리스트 생성
		tm.addId(); //테스트목적 자동생성 아이디
		//1.로그인 2.회원가입 3.종료하기 0.만든사람
//		Thread.sleep(2000);
		
		while(run) {
		
		tm.cs();	//공백
		tm.screen1();	// ui1 띄우기
		System.out.print("                                             메뉴> ");
		int mainMenu = scan.nextInt();
		
		switch(mainMenu) {
		
		case 1:
			int loginIndex = tm.login(scan);
			
		
			
			
			while(loginIndex != -1) {
//				if(loginIndex == -1) {
//					run2 = false;
//					break;
//				}
//				
				if(loding != true) {
					 tm.cs();
					 System.out.println("                                             Loding.");
					 tm.cs2();
				     Thread.sleep(1000);
				     tm.cs();
				     System.out.println("                                             Loding. .");
				     tm.cs2();
				     Thread.sleep(1000);
				     tm.cs();
				     System.out.println("                                             Loding. . .");
				     tm.cs2();
				     Thread.sleep(1000);
				     tm.cs();
				     System.out.println("                                             Loding. . . .");
				     tm.cs2();
				     Thread.sleep(1000);
				     tm.cs();
				     System.out.println("                                             Loding. . . . !");
				     tm.cs2();
				     Thread.sleep(1000);
					      
					}
				loding = true;
				tm.cs();//공백채우기	
				//로그인페이지 활성화
				tm.screen2(loginIndex,tm.cs.get(loginIndex).getTra());
				System.out.print("                                             메뉴> ");
				int menu = scan.nextInt();
				
				
				

				
				
				//로그인 한 사람의 로그인정보는 loginIndex만 필요하지만
				//메뉴 3,4은 Screen2 회원 열차정보 표시 때문에, 추가적으로 Tra 객체가 매개변수로 들어간다.
			switch(menu){
				case 1:
					tm.insertTrain(scan,loginIndex);
					break;
				case 2:
					tm.deleteTrain(scan,loginIndex,tm.cs.get(loginIndex).getTra());
					break;
				case 3:
					tm.printTarin(scan,loginIndex,tm.cs.get(loginIndex).getTra());
					break;
				case 4:
					tm.cashAdd(scan, loginIndex,tm.cs.get(loginIndex).getTra());
					break;
				case 5:
					System.out.println("                                                        [!]로그아웃 합니다.");
					loginIndex = -1;
					break;
				default:
					System.out.println("                                                        [!]1~4번 메뉴를 선택하세요.");
				}

			}
			
			break;
		case 2:
			tm.insertMember(scan);	
			break;
		case 3:
			tm.updateMember(scan);	
			break;
		case 4:
			tm.deleteMember(scan);	
			break;
		case 5:
			System.out.println("                                             [!]Train Manager를 종료합니다.");
			run = false;
			break;
		case 0:
			
			break;
		default:
			System.out.println("                                             [!]1~4번 메뉴를 선택하세요.");
		
		
		}
		
	
		}
		
		
	}
	

}
