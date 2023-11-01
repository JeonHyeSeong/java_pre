package Day13;

/* Card 클래스 생성
 * - 숫자 : 1~10, J, Q, K
 * - 모양 : ♥, ◆, ♣, ♠
 * - 한장의 카드 정보를 출력하는 기능
 * */
/* 클래스의 구성
 * - 멤버변수 : 모양, 숫자 => private선언 => getter/setter생성
 * - 메서드 : print 메서드
 * - 생성자 : 기본생성자만 생성 => ♥1
 * */

public class Card {
	private char shape;
	private int num;
	
	// 생성자는 설정하지 않아도 기본 생성자 제공
	// 생성자는 객체 생성시 (new)에만 작동
	// Card c = new Card(); // Card() 생성자
	public Card() {
		num = 1;
		shape = '♥';
	}
	
	public void print() {
		System.out.print(shape);
		switch(num) {
		case 11 : System.out.print("J ");break;
		case 12 : System.out.print("Q ");break;
		case 13 : System.out.print("K ");break;
		default : System.out.print(num+" ");break;
		}
		
	}

	public char getShape() {
		return shape;
	}

	public void setShape(char shape) {
		// 값을 변경할 경우
		switch(shape) {
		case '♥' : case '◆' : case '♣' : case '♠' : 
			this.shape = shape;
			break;
			default : 
				this.shape = '♥';
		}
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		// 값을 변경할 경우
		if(num < 1 || num > 13) {
			this.num = 1; // 기본값
		}else {
			this.num = num; // 1~13까지의 값만 받아들임
		}
	}
	
	

}
