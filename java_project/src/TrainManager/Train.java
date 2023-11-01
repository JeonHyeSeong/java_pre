package TrainManager;


public class Train {
	private String trName;	//열차종류 KTX(대문자)/무궁화/새마을
	private int trNum;	//열차넘버
	private String destination;	//출발역
	private int time;	//시간
	private int people; //사람수
	
	
	private boolean[] seat = new boolean[20];	//좌석
	private int seatNum;	//좌석 번호
							//쉽게말해 위에 boolean배열에 사용될 index ex) seat[seatNum];
	
	
	
	public Train() {
		
	}

	
	
	
	public Train(String trName, int trNum, int people, int seatNum  ) {	//열차 예약 할때 쓰는 생성자
		this.trName = trName;
		this.trNum = trNum;
		this.people = people;
		this.seatNum = seatNum;

	
	}		
	
	
	public Train(String trName, int trNum, String destination, int time) {	//열차정보 생성자
		this.trName = trName;
		this.trNum = trNum;
		this.destination = destination;
		this.time = time;
		
	}
	




	public boolean getSeat(int seatNum) {
		boolean bl = this.seat[seatNum];
		return bl;
	}






	public void setSeat(boolean[] seat) {
		this.seat = seat;
	}



	public int getSeatNum() {
		return seatNum;
	}



	public void setSeatNum(int seatNum) {
		this.seatNum = seatNum;
		if(seat[seatNum] == false) {
			seat[seatNum] = true;
			setSeat(seat);
		}else {
			seat[seatNum] = false;
			setSeat(seat);
		}
	}



	public int getPeople() {
		return people;
	}


	public void setPeople(int people) {
		this.people = people;
	}



	public String getTrName() {
		return trName;
	}

	public void setTrName(String trName) {
		this.trName = trName;
	}

	public int getTrNum() {
		return trNum;
	}

	public void setTrNum(int trNum) {
		this.trNum = trNum;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public String getDestination() {
		if("서울".equals(destination)) {
			return "서울->부산";
		}else if("부산".equals(destination)){
			return "부산->서울";
		}
		return destination;
		
		
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}
	
	public void printCustmorTrain() {
		
		
	}

	public void seatPrint() {
		
		for(int i=0; i<=9;i++) {
			if(seat[i] == false) {
				System.out.print("□   ");
			}else {
				System.out.print("■   ");
			}
		}
	}
	
	public void seatPrint2() {
		
		for(int i=10; i<=19;i++) {
			if(seat[i] == false) {
				System.out.print("□   ");
			}else {
				System.out.print("■   ");
			}
		}
	}



	public void printTrain() {	//열차리스트 조회
		if(time > 13) {
		System.out.println("		       열차번호|"+trNum+"      열차종류|"+trName+"      출발역|"+getDestination()+"      출발시간| 오후 "+(time-12)+"시");
		}else {
		System.out.println("		       열차번호|"+trNum+"      열차종류|"+trName+"      출발역|"+getDestination()+"      출발시간| 오전 "+time+"시");
		}
	}
	

	
}

