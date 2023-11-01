package TrainManager;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class TrManager {
	

	ArrayList<Train> ktxList = new ArrayList<>();	//KTX 열차 리스트
	ArrayList<Train> saemaList = new ArrayList<>();	//새마을호 열차 리스트
	ArrayList<Train> rosList = new ArrayList<>();	//무궁화호 열차 리스트
	
	
	
	
	ArrayList<Custmor> cs = new ArrayList<>();	//회원정보 리스트
	//String trName, int trNum, String destination, int time
	
	
	
	public void addTrain() {
		ktxList.add(new Train("KTX",1,"서울",6));
		ktxList.add(new Train("KTX",2,"서울",8));
		ktxList.add(new Train("KTX",3,"서울",10));
		ktxList.add(new Train("KTX",4,"서울",12));
		ktxList.add(new Train("KTX",5,"서울",14));
		ktxList.add(new Train("KTX",6,"서울",16));
		ktxList.add(new Train("KTX",7,"서울",18));
		ktxList.add(new Train("KTX",8,"서울",20));
		ktxList.add(new Train("KTX",9,"서울",22));
		
		ktxList.add(new Train("KTX",10,"부산",6));
		ktxList.add(new Train("KTX",11,"부산",8));
		ktxList.add(new Train("KTX",12,"부산",10));
		ktxList.add(new Train("KTX",13,"부산",12));
		ktxList.add(new Train("KTX",14,"부산",14));
		ktxList.add(new Train("KTX",15,"부산",16));
		ktxList.add(new Train("KTX",16,"부산",18));
		ktxList.add(new Train("KTX",17,"부산",20));
		ktxList.add(new Train("KTX",18,"부산",22));
		
		saemaList.add(new Train("새마을",20,"서울",6));
		saemaList.add(new Train("새마을",21,"서울",8));
		saemaList.add(new Train("새마을",22,"서울",10));
		saemaList.add(new Train("새마을",23,"서울",12));
		saemaList.add(new Train("새마을",24,"서울",14));
		saemaList.add(new Train("새마을",25,"서울",16));
		saemaList.add(new Train("새마을",26,"서울",18));
		saemaList.add(new Train("새마을",27,"서울",20));
		saemaList.add(new Train("새마을",28,"서울",22));
		
		saemaList.add(new Train("새마을",29,"부산",6));
		saemaList.add(new Train("새마을",30,"부산",8));
		saemaList.add(new Train("새마을",31,"부산",10));
		saemaList.add(new Train("새마을",32,"부산",12));
		saemaList.add(new Train("새마을",33,"부산",14));
		saemaList.add(new Train("새마을",34,"부산",16));
		saemaList.add(new Train("새마을",35,"부산",18));
		saemaList.add(new Train("새마을",36,"부산",20));
		saemaList.add(new Train("새마을",37,"부산",22));
		
		rosList.add(new Train("무궁화",40,"서울",6));
		rosList.add(new Train("무궁화",41,"서울",8));
		rosList.add(new Train("무궁화",42,"서울",10));
		rosList.add(new Train("무궁화",43,"서울",12));
		rosList.add(new Train("무궁화",44,"서울",14));
		rosList.add(new Train("무궁화",45,"서울",16));
		rosList.add(new Train("무궁화",46,"서울",18));
		rosList.add(new Train("무궁화",47,"서울",20));
		rosList.add(new Train("무궁화",48,"서울",22));
		
		rosList.add(new Train("무궁화",49,"부산",6));
		rosList.add(new Train("무궁화",50,"부산",8));
		rosList.add(new Train("무궁화",51,"부산",10));
		rosList.add(new Train("무궁화",52,"부산",12));
		rosList.add(new Train("무궁화",53,"부산",14));
		rosList.add(new Train("무궁화",54,"부산",16));
		rosList.add(new Train("무궁화",55,"부산",18));
		rosList.add(new Train("무궁화",56,"부산",20));
		rosList.add(new Train("무궁화",57,"부산",22));
		
	
		
	}
	
	public void addId() {
		cs.add(new Custmor("ruwk", "1234", "김동완", 31));
	}

	public int login(Scanner scan) {
		
		//로그인
		
		int idCheck = 0;	//id체크
		int loginIndex = -1;
		System.out.println("                                             [로그인 선택하셨습니다.]");
		System.out.print("                                             ID> ");
		String id = scan.next();
		System.out.print("                                             비밀번호> ");
		String password = scan.next();
		
		
		for(int i=0; i<cs.size(); i++) {
			if(cs.get(i).getId().equals(id) && cs.get(i).getPassword().equals(password)) {
				idCheck++;
				loginIndex = i;
			}
		}
		
		if(idCheck == 0) {
			System.out.println("                                             [!]아이디 또는 비밀번호가 틀렸습니다.");
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				
			}
			return -1;
		}
		
		
		System.out.println("                                             [!]아이디 확인되었습니다. 로그인합니다.");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		
		}
		
		return loginIndex;

	}

	public void insertMember(Scanner scan) {
		//회원가입메뉴
		
		System.out.println("                                             [회원가입 선택하셨습니다.]");
		System.out.print("                                             [가입] ID> ");
		String id = scan.next();
		for(int i=0; i<cs.size(); i++) {
			if(cs.get(i).getId().equals(id)) {
				System.out.println("                                             [!]이미 가입된 아이디가 있습니다.");
				try {
					Thread.sleep(2000);
				} catch (Exception e) {

				}
				return;
			}
		}
		Custmor ct = new Custmor();	//비밀번호 확인용 일회용 객체
		System.out.print("                                             [가입] 비밀번호> ");
		String password = scan.next();
		try {
			ct.setPassword(password);
		} catch (PasswordException e) {
			System.out.println(e.getMessage());
			return;
		}
		
		System.out.print("                                             [가입] 이름> ");
		String name = scan.next();
		System.out.print("                                             [가입] 나이> ");
		int age = scan.nextInt();
		
		
		
		cs.add(new Custmor(id, password, name, age));	//회원가입 정보 객체에 담아서 회원List(cs) 추가
		
		
		System.out.println("                                             [!]가입완료!");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {

		}

		
	}



	public void updateMember(Scanner scan) {
		
		//회원정보수정
		int idCheck =0;	//id체크
		int index = -1;
		System.out.println("                                             [정보수정 선택하셨습니다.]");
		System.out.print("                                                        ID 확인> ");
		String id = scan.next();
		System.out.print("                                                        비밀번호 확인> ");
		String password = scan.next();
		for(int i=0; i<cs.size(); i++) {
			if(cs.get(i).getId().equals(id) && cs.get(i).getPassword().equals(password)) {
				idCheck++;
				index = i;
			}
		}
		
		if(idCheck == 0) {
			System.out.println("                                             [!]아이디 또는 비밀번호가 틀렸습니다.");
			try {
				Thread.sleep(2000);
			} catch (Exception e) {

			}
			return;
		}
		
		
		System.out.print("                                                        변경할 비밀번호를 입력>");
		password = scan.next();
		try {
			cs.get(index).setPassword(password);
			System.out.println("                                             [!]변경완료!");
			try {
				Thread.sleep(2000);
			} catch (Exception e) {

			}
		} catch (PasswordException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
	}
	

	public void deleteMember(Scanner scan) {
		int idCheck =0;	//id체크
		int index = -1;
		
		System.out.println("                                             [회원탈퇴 선택하셨습니다.]");
		System.out.print("                                                        ID 확인> ");
		String id = scan.next();
		System.out.print("                                                        비밀번호 확인> ");
		String password = scan.next();
		for(int i=0; i<cs.size(); i++) {
			if(cs.get(i).getId().equals(id) && cs.get(i).getPassword().equals(password)) {
				idCheck++;
				index = i;
			}
		}
		
		if(idCheck == 0) {
			System.out.println("                                             [!]아이디 또는 비밀번호가 틀렸습니다.");
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
		
			}
			return;
		}
		
		System.out.println("                                             [!]정말 회원탈퇴를 하시겠습니까? 하실거면 \"회원탈퇴\"입력");
		String check = scan.next();
		if("회원탈퇴".equals(check)) {
			cs.remove(index);
			System.out.println("                                             [!]회원탈퇴 완료...!");
			try {
				Thread.sleep(2000);
			} catch (Exception e) {

			}
		}else {
			return;
		}
		
	}
	
	
	public void insertTrain(Scanner scan,int index) {	//예매하기
		int cnt = -1;
		if(cs.get(index).isBuyLock() == true) {
			System.out.println("                                          [!]이미 구매한 티켓이 있습니다.");
			try {
				Thread.sleep(2000);
			} catch (Exception e) {

			}
			return;
		}
		
		
        //////////////////////////열차 정보를 담을 객체 생성/////////////////////////
		Train ta = new Train();	
		
		//열차 종류 입력
		System.out.print("                                          열차 종류선택(1.KTX/2.새마을/3.무궁화)> ");
		String trName = scan.next();	
		
		if("1".equals(trName)) {
			trName = "KTX";
		}else if("2".equals(trName)) {
			trName = "새마을";
		}else if("3".equals(trName)) {
			trName = "무궁화";
		}else if((trName.equals("KTX")||trName.equals("ktx")||trName.equals("무궁화")||trName.equals("새마을"))){
			
		}else {
			System.out.println("                                          잘못 입력하셨습니다.");
			return;
		}
		
		if(!(trName.equals("KTX") || trName.equals("ktx") || trName.equals("무궁화") || trName.equals("새마을"))) {
			System.out.println("                                          [!]열차종류를 정확히 입력하세요");
			try {
				Thread.sleep(2000);
			} catch (Exception e) {

			}
			return;
		}
		
		ta.setTrName(trName);
		
		
		
		int fee = 0;	//KTX , 새마을, 무궁화 요금 받을 변수
		
		//열차 리스트 출력
		cs();
		System.out.println("		■────────────────────────────────────시간표──────────────────────────────────■");
		
		if(trName.equals("KTX")||trName.equals("ktx")) {
			for(int i=0; i<ktxList.size();i++) {
				ktxList.get(i).printTrain();
			}
			System.out.println();
			System.out.println("                                       ● KTX  승객유형|성인  운임요금|40000원");
			System.out.println();
			fee = 40000;
		}else if(trName.equals("새마을")) {
			for(int i=0; i<saemaList.size();i++) {
				saemaList.get(i).printTrain();
			}
			System.out.println();
			System.out.println("                                       ● 새마을  승객유형|성인  운임요금|30000원");
			System.out.println();
			fee = 30000;
		}else if(trName.equals("무궁화")) {
			for(int i=0; i<rosList.size();i++) {
				rosList.get(i).printTrain();
			}
			System.out.println();
			System.out.println("                                       ● 무궁화  승객유형|성인  운임요금|20000원");
			System.out.println();
			fee = 20000;
		}
		
		screen2(index, ta);

		

		//열차 예약번호 입력
		cnt = -1;
		int trNum = 0;
		int cnt2 = 0; //열차번호 확인용 카운터
		
		
		
		while(cnt != 0) {		//위에 입력한 열차네임을 기준으로 list에서 찾고, 입력한 열차번호가 있다면 cnt++
			System.out.print("                                          예약열차번호> ");
			trNum = scan.nextInt();
			
			if(trName.equals("KTX")||trName.equals("ktx")) {
				for(int i=0; i<ktxList.size();i++) {
					if(trNum == ktxList.get(i).getTrNum()) {
						cnt2++;
						ta.setTime(ktxList.get(i).getTime());
						ta.setDestination(ktxList.get(i).getDestination());
					}
				}
			}else if(trName.equals("새마을")) {
				for(int i=0; i<saemaList.size();i++) {
					if(trNum == saemaList.get(i).getTrNum()) {
						cnt2++;
						ta.setTime(saemaList.get(i).getTime());
						ta.setDestination(saemaList.get(i).getDestination());
					}
				}
			}else if(trName.equals("무궁화")) {
				for(int i=0; i<rosList.size();i++) {
					if(trNum == rosList.get(i).getTrNum()) {
						cnt2++;
						ta.setTime(rosList.get(i).getTime());
						ta.setDestination(rosList.get(i).getDestination());
					}
				}
			}
		
			
			if(cnt2 == 0) {
				System.out.println("                                          [!]"+trName+"의 열차번호가 존재하지않습니다.");
				try {
					Thread.sleep(2000);
				} catch (Exception e) {

				}
				return;
			}
			
			System.out.print("                                          예약하신 "+trNum+"번 열차가 맞습니까? 예y / 아니오n");
			String temp = scan.next();
			if(temp.equals("y")) {
				cnt = 0;
			}
		}
			ta.setTrNum(trNum);
		
		
		//열차 예매인원 입력
		int people = 0;
		cnt = -1;
		
		while(cnt != 0) {		
			
			System.out.print("                                          예매인원(최대 4인)> ");
			people = scan.nextInt();
			System.out.print("                                          예매인원 "+people+"명이 맞습니까? 예y / 아니오n");
			String temp = scan.next();
			if(people > 4 || people <= 0) {
				System.out.println("                                          [!]최대 인원수를 초과하였습니다.");
				return;
			}
			
			if(temp.equals("y")) {
				cnt = 0;
			}
		}
		
		//계좌 계산 (잔고 불러옴)
		int account = (cs.get(index).getAccount());
		
		if(account < fee*people) {
			System.out.println("                                          [!]잔액이 부족합니다.");
			try {
				Thread.sleep(2000);
			} catch (Exception e) {

			}
			return;
		}else {
			
		account -= (fee*people);	//KTXor무궁화or새마을 요금* 인원수
		}
		cs.get(index).setAccount(account);
		

		ta.setPeople(people);
		
		
		
		
		int accountBack = (fee*people);	
			
			
		// 좌 석 선택 //
		int tempPeople = people;	//위에서 받은 인원수를 인원수차감 변수에 넣는다.
		int seatNum = 0;
		ArrayList <Integer> seatLock = new ArrayList<>();	//중복방지 좌석 리스트
		HashSet<Integer> seatSet = new HashSet<>();	//중복방지 좌석 set
		
		
		
		while(tempPeople != 0) {
			
		
			cs();
			screen2_2(index,ta,seatNum);
			screen2(index, ta);
			System.out.print("                                          좌석번호 선택>");
			seatNum = scan.nextInt();
			seatLock.add(seatNum);	//리스트랑 set에 동일한걸 넣고
			seatSet.add(seatNum);	//set은 중복을 쳐냄
			
			
			if(seatLock.size() != seatSet.size()) {	//리스트 size랑 set사이즈가 다르면 return선언
				System.out.println("                                          [!]좌석 중복구매는 불가능합니다.");
				try {
					Thread.sleep(2000);
				} catch (Exception e) {
	
				}
				account += accountBack;
				cs.get(index).setAccount(account);
				cs.get(index).getTicket().clear();
				return;
			}
			
			if(seatNum <= 20||seatNum <= 0) {
				
				
				
				ta.setSeatNum(seatNum-1);
				cs.get(index).getTicket().add(seatNum);
				
				
				
				cs();
				screen2_2(index,ta,seatNum-1);
				screen2(index, ta);
				
				
				tempPeople--;
			}else {
				System.out.println("                                          [!]좌석을 정확히 입력해주세요 1~20");
				return;
			}
		
		
		}
		
		//좌석 선택한걸 그대로 열차 리스트에 저장(구매정보 다른회원과 공유)
		
		
//		boolean[] a = new boolean[20]; 배열 회원 공유 테스트용
//		
//		
//		for(int i=0; i<ktxList.size(); i++) {	//1. 회원이 입력한 trNum이랑 ktx 리스트안에 넘버랑 동일한걸 찾음
//			if(ta.getTrNum() == ktxList.get(i).getTrNum()) {	//구매할 자리 지정
//				for(int j=0; j<seatLock.size(); j++) { 	//seatNum 배열을 찾아서 넣으면됨 1 2 3 / 1 11 12
//					int temp = seatLock.get(i);
//					a[temp] = true;
//					System.out.print(a[temp]+" ");
//				}
//				ktxList.get(i).setSeat(a);
//			}
//		}
		
		
		
		
		//예매정보를 ta 객체에 담아 유저리스트에 저장
		cs.get(index).setTra(ta);
		//티켓 구매완료후 추가구매 잠금
		cs.get(index).setBuyLock(true);	
		//사용한 좌석중복 방지 리스트는 리스트 청소
		seatLock.clear();
		seatSet.clear();
		
		
		System.out.println("                                          [!]예매 완료!!!!!!!!!!");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {

		}


	}
		
	

	public void deleteTrain(Scanner scan,int loginIndex, Train tr) {	//예매취소
		int idIndex = 0;
		
		//예매취소 전 회원 확인
		System.out.println("                                          [예매취소 선택하셨습니다.]");
		System.out.println("                                          [!]회원님의 아이디, 비밀번호를 입력해주세요.");
		System.out.print("                                          아이디> ");
		String id = scan.next();
		System.out.print("                                          비밀번호> ");
		String password = scan.next();
		
		
		for(int i=0; i<cs.size();i++) {
			if(cs.get(i).getId().equals(id)) {
				idIndex = i;
				if(loginIndex != idIndex) {
					System.out.println("                                          [!]아이디 또는 비밀번호가 틀렸습니다.");
					try {
						Thread.sleep(2000);
					} catch (Exception e) {
						
					}
					return;
				}
			}
			
		}
		
	
		
		if(!(cs.get(loginIndex).getName().equals(id) || (cs.get(loginIndex).getPassword().equals(password)) )) {
			System.out.println("                                          [!]아이디 또는 비밀번호가 틀렸습니다.");
			return;
		}else {
			System.out.println("                                          [!]회원정보 확인!");
			try {
				Thread.sleep(2000);
			} catch (Exception e) {

			}
			
			
			cs();
			screen2(loginIndex, tr);
			int fee = 0;
			String trName = cs.get(loginIndex).getTra().getTrName();
			if(trName.equals("KTX")||trName.equals("ktx")) {
				
				fee = 40000;
			}else if(trName.equals("새마을")) {
			
				fee = 30000;
			}else if(trName.equals("무궁화")) {
			
				fee = 20000;
			}
			
			
			int people = cs.get(loginIndex).getTra().getPeople();	//회원정보에 있는 구매 인원수
			int money = fee * people;	//요금표 * 인원수
			int account = cs.get(loginIndex).getAccount();
			
			cs.get(loginIndex).setAccount(account + money);
			
			
			
			
			System.out.println("                                          [!]환불 완료!");
			
			try {
				Thread.sleep(2000);
			} catch (Exception e) {

			}
			
			cs.get(loginIndex).setTra(new Train());		//티켓 정보 삭제
			cs.get(loginIndex).setBuyLock(false);	//회원의 재구매 잠금 해제
			
		}
		
		
		
		
		
		
	}

	public void printTarin(Scanner scan,int loginIndex,Train tr) {	//열차조회
		cs();
		screen2(loginIndex, tr);
		System.out.println("                                          [열차조회 선택하셨습니다.]");
		
		
		System.out.print("                                          조회할 열차 종류선택(1.KTX/2.새마을/3.무궁화)> ");
		String trName = scan.next();
		
		if("1".equals(trName)) {
			trName = "KTX";
		}else if("2".equals(trName)) {
			trName = "새마을";
		}else if("3".equals(trName)) {
			trName = "무궁화";
		}else if((trName.equals("KTX")||trName.equals("ktx")||trName.equals("무궁화")||trName.equals("새마을"))){
			
		}else {
			System.out.println("                                          잘못 입력하셨습니다.");
			return;
		}
		
		
		
		if(!(trName.equals("KTX")||trName.equals("ktx")||trName.equals("무궁화")||trName.equals("새마을"))) {
			System.out.println("                                          [!]열차종류를 정확히 입력하세요");
			try {
				Thread.sleep(2000);
			} catch (Exception e) {

			}
			return;
		}
		
		
		cs();
		System.out.println("		■────────────────────────────────────시간표──────────────────────────────────■");
		
		if(trName.equals("KTX")||trName.equals("ktx")) {
			for(int i=0; i<ktxList.size();i++) {
				ktxList.get(i).printTrain();
			}
			System.out.println();
			System.out.println("                                       ● KTX  승객유형|성인  운임요금|40000원");
			System.out.println();
		}else if(trName.equals("새마을")) {
			for(int i=0; i<saemaList.size();i++) {
				saemaList.get(i).printTrain();
			}
			System.out.println();
			System.out.println("                                       ● 새마을  승객유형|성인  운임요금|30000원");
			System.out.println();
		}else if(trName.equals("무궁화")) {
			for(int i=0; i<rosList.size();i++) {
				rosList.get(i).printTrain();
			}
			System.out.println();
			System.out.println("                                       ● 무궁화  승객유형|성인  운임요금|20000원");
			System.out.println();
		}
		
		
		
		
		screen2(loginIndex, tr);
		
		System.out.print("                                          [!]그만보시려면 아무키나 입력하세요. .");
		String temp = scan.next();
		
		
		
	}

	public void cashAdd(Scanner scan,int loginIndex,Train tr) {	//계좌
		int idIndex = 0;
		
		//계좌 충전 전 회원 확인
		System.out.println("                                          [금액충전 메뉴입니다.]");
		
		System.out.println("                                          [!]회원님의 아이디, 비밀번호를 입력해주세요.");
		System.out.print("                                          아이디> ");
		String id = scan.next();
		System.out.print("                                          비밀번호> ");
		String password = scan.next();
		
		for(int i=0; i<cs.size();i++) {
			if(cs.get(i).getId().equals(id)) {
				idIndex = i;
				if(loginIndex != idIndex) {
					System.out.println("                                          [!]아이디 또는 비밀번호가 틀렸습니다.");
					try {
						Thread.sleep(2000);
					} catch (Exception e) {
						
					}
					return;
				}
			}
			
		}
		
		
			//검색한 id 인덱스
			//로그인한 id 인덱스 맞는지
		
		
		if(!(cs.get(loginIndex).getName().equals(id) || (cs.get(loginIndex).getPassword().equals(password)) )) {
				
			System.out.println("                                          [!]아이디 또는 비밀번호가 틀렸습니다.");
			return;
		}else {
			System.out.println("                                          [!]회원정보 확인!");
		}
		
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			
		}
		

		
		cs();
		screen2(loginIndex, tr);
		
		//충전코너 시작
		
		System.out.print("                                          충전하실 금액> ");
		int money = scan.nextInt();
		
		if(money <=0) {
			System.out.println("                                          [!]금액을 정확히 입력해주세요");
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				
			}
			return;
		}else if(money >500001) {
			System.out.println("                                          [!]50만원이상 충전 불가능합니다.");
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				
			}
			return;
		}else {
		
		int account = cs.get(loginIndex).getAccount();
		cs.get(loginIndex).setAccount(account+money);
			
		System.out.println("                                          "+money+"원 충전완료!");
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
	
			}
		
		}
		
		
		
		
	}
	
	
	
	
	
	public void screen1() {
		System.out.println("		■─────────────────────────────────────────────────────────────────────────┐");
		System.out.println("		│     ■■■■■■■■  ■■■■■■■■     ■■■    ■■  ■■     ■■                         │");
		System.out.println("		│     ■■■■■■■■  ■■■■■■■■■    ■■■    ■■  ■■■    ■■                         │");
		System.out.println("		│        ■■     ■■     ■■   ■■ ■■       ■■■■   ■■                         │");
		System.out.println("		│        ■■     ■■     ■■   ■■ ■■   ■■  ■■■■   ■■                         │");
		System.out.println("		│        ■■     ■■     ■■   ■■ ■■   ■■  ■■ ■■  ■■                         │");
		System.out.println("		│        ■■     ■■■■■■■■   ■■   ■■  ■■  ■■ ■■  ■■                         │");
		System.out.println("		│        ■■     ■■■■■■■    ■■■■■■■  ■■  ■■  ■■ ■■                         │");
		System.out.println("		│        ■■     ■■   ■■■   ■■■■■■■  ■■  ■■   ■■■■                         │");
		System.out.println("		│        ■■     ■■    ■■■ ■■     ■■ ■■  ■■   ■■■■                         │");
		System.out.println("		│        ■■     ■■     ■■ ■■     ■■ ■■  ■■    ■■■                         │");
		System.out.println("		│                                                                         │");
		System.out.println("		│                                      ■■ ■■                              │");
		System.out.println("		│                                      ■■ ■■ ■■■ ■■■■ ■■■  ■■■  ■  ■■■    │");
		System.out.println("		│                                      ■■ ■■ ■ ■ ■  ■ ■ ■ ■  ■ ■ ■ ■      │");
		System.out.println("		│                                      ■■ ■■  ■■ ■  ■  ■■ ■  ■ ■■■ ■      │");
		System.out.println("		│                                      ■ ■ ■ ■ ■ ■  ■ ■ ■ ■  ■ ■ ■ ■      │");
		System.out.println("		│                                      ■ ■ ■ ■■■ ■  ■ ■■■  ■■■  ■  ■      │");
		System.out.println("		│                                                         ■  ■            │");
		System.out.println("		│                                                         ■■■             │");
		System.out.println("		│                              [1].로그인                                   │");
		System.out.println("		│                              [2].회원가입　                          	  │");
		System.out.println("		│                              [3].정보수정　                          	  │");
		System.out.println("		│                              [4].회원탈퇴　                          	  │");
		System.out.println("		│                              [5].종료　　                         	  │");
		System.out.println("		│                              [0].만든사람들                          	  │");
		System.out.println("		│                                                                         │");
		System.out.println("		└─────────────────────────────────────────────────────────────────────────┘");
	}
	

	
	
	public void screen2(int index, Train ta) {
		System.out.println("		                                  ==========                                ");
		System.out.println("		■─────────────────────────────────==========───────────────────────────────■");
		System.out.println("");
		System.out.print("		  ○ ");cs.get(index).printCustmor();System.out.println();
		System.out.print("		  ○ ");cs.get(index).printInfo(ta);System.out.println();
		System.out.println("");
		System.out.println("		■──────────┬──────────┬──────────┬──────────┬──────────┐");
		System.out.println("		│          │          │          │          │          │");
		System.out.print("		│　1.열차예매　│　2.예매취소　│　3.열차조회　│　4.금액충전　│　5.로그아웃　│  ■ 잔액: ");System.out.println(cs.get(index).getAccount()+" 원");
		System.out.println("		│          │          │          │          │          │");
		System.out.println("		■──────────┴──────────┴──────────┴──────────┴──────────┴───────────────────■");
	}
//	
//	public void screen2_1(int index) {
//		System.out.println("		                                  ==========                                ");
//		System.out.println("		┌─────────────────────────────────==========───────────────────────────────┐");
//		System.out.println("		│                                                                          │");
//		System.out.print("		│ ■");System.out.println("                                                    │");
//		System.out.println("		│                                                                          │");
//		System.out.println("		├─────────────────────┬──────────┐                                         │");
//		System.out.println("		│          │          │          │                                         │");
//		System.out.print("		│　1.KTX　 　│　2.무궁화호　│　3.새마을호　│                       ■잔액:");System.out.println();
//		System.out.println("		│          │          │          │                                         │");
//		System.out.println("		└──────────┴──────────┴──────────┴─────────────────────────────────────────┘");
//	}
	

	public void screen2_2(int index, Train ta,int seatNum) {
		System.out.println("		■─────────────────────────────────좌석 선택─────────────────────────────────■");
		System.out.println("		           ┏─────-───-───-───-───-───-───-───-───-───-──────┓");
		System.out.println("		           │     1   2   3   4   5   6   7   8   9   10     │");
		System.out.print("		           │     ");box(index, ta,seatNum);System.out.println("   │");
		System.out.println("  열차방향   ◀◀◀◀◀◀◀◀◀   [앞]                                                      [뒤]     ◀◀◀◀◀◀◀◀◀◀◀◀");    
		System.out.println("		           │     11  12  13  14  15  16  17  18  19  20     │");
		System.out.print("		           │     ");box2(index, ta,seatNum);System.out.println("   │");
		System.out.println("		           ┗────-────-───-───-───-───-───-───-───-───-──────┛");
	}
	
	
	
	
	public void box(int index,Train ta,int seatNum) {
		ta.seatPrint();


	}
	
	
	public void box2(int index,Train ta,int seatNum) {
		ta.seatPrint2();

	}

	

	public void cs() {	//칸 채우기
	    for (int i = 0; i < 30; i++)
	      System.out.println("");
	  }
	public void cs2() {	//칸 채우기
	    for (int i = 0; i < 17; i++)
	      System.out.println("");
	  }
	
	

	
}
