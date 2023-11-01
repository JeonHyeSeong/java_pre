package TrainManager;

import java.util.ArrayList;

public class Custmor {
	
	/***************손님관련****************/
	private String name;	//회원 이름
	private int age;	//회원 나이
	private int account; //계좌
	boolean buyLock;	//티켓 구매 잠금
	/***************회원가입관련****************/
	private String id;	//id
	private String password;	//password
	
	
	
	private ArrayList<Integer> ticket = new ArrayList<>();	//좌석 상세 구매내역 상태창에 표기하려고 만든 리스트
	private Train tra = new Train();	//train 객체 받아서 사용하기
	
	
	
	
	
	
	

	public Custmor() {
		
	}
	
	public Custmor(String id,String password,String name, int age) {	//회원가입을 받는 생성자
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
	}
	
	public Custmor(Train tra) {
		this.tra = tra;
	}
	

	
	

	public boolean isBuyLock() {
		return buyLock;
	}

	public void setBuyLock(boolean buyLock) {
		this.buyLock = buyLock;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {	//중복검사 비밀번호 set 받는곳

	// throw 발생 처리
		/*- 비밀번호는 null일수 없다.
		 * - 비밀번호는 길이가 5자이상
		 * - 비밀번호는 문자로만 이루어지면 안됨(문자+숫자 또는 특수문자 포함.) */
				
		if(password == null) {
			throw new PasswordException("                                             [!]비밀번호는 null일수 없습니다.");
			
		}else if(password.length() < 4) {
			throw new PasswordException("                                             [!]비밀번호는 4자 이상이여야 합니다.");
			
		}

		this.password = password;

	}
	
	
	
	
	
	public ArrayList<Integer> getTicket() {
		return ticket;
	}

	public void setTicket(ArrayList<Integer> ticket) {
		this.ticket = ticket;
	}

	public Train getTra() {
		return tra;
	}
	
	public void setTra(Train tra) {
		this.tra = tra;
	}
	
	

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAccount() {
		return account;
	}
	
	public void setAccount(int account) {
		if(account < 0 ) {	//계좌 0원 밑으로 내려가는거 방지
			account = 0;
		}
		this.account = account;
	}
	
	
	
	public void printCustmor() {	//info창 로그인 상태 출력
		System.out.print(name+"님"+"("+getId()+")"+" 환영합니다!");
	}

	
	
	public void printInfo(Train ta) {	//info창 구매내역 출력
		if(ta.getTrNum() == 0||ta.getTrName() == null ||ta == null) {
			System.out.print("예매 정보가 없습니다.");
			return;
		}else {
			if(ta.getTime() > 13) {
				System.out.print(ta.getTrName()+"(열차번호:"+ta.getTrNum()+")"+"   출발시간|오후 "+ta.getTime()+"시"+"   출발역|"+ta.getDestination()+"    구매좌석|");
				for(int i=0; i<ticket.size();i++) {
					System.out.print(ticket.get(i)+"번 ");
				}
			}else {
				System.out.print(ta.getTrName()+"(열차번호:"+ta.getTrNum()+")"+"   출발시간|오전 "+ta.getTime()+"시"+"   출발역|"+ta.getDestination()+"    구매좌석|");
				for(int i=0; i<ticket.size();i++) {
					System.out.print(ticket.get(i)+"번 ");
				}
			}
			
			
			
		}
	}

}
	
