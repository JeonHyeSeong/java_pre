package Day12;

public class Class04 {

	public static void main(String[] args) {
		// Card 객체를 생성하고, ♣Q를  출력하려고 한다.
		// 아무값도 안넣으면 ♥1
		// ♥ , ♣, ◆, ♠ 가 아닌 다른 모양이 들어가면 => ♥1
		// 숫자도 1~13이 아닌 다른 수가 들어가면 => 1
		Card c = new Card('♣',12);
		c.print();
		
		c.setShape('$');
		c.setNum(100000000);
		c.print();
		
		c.setShape('♠');
		c.setNum(11);
		c.print();
		
	}

}

/* Card 클래스 : 포커게임에서 사용하는 카드를 나타내는 클래스
 * 모양 : 하트, 클로버, 다이아, 스페이드
 * 숫자 : 1~10 J(11) Q(12) K(13)
 * 카드 정보를 출력
 * 
 * 클래스의 구성
 * - 멤버변수 : char shape, int num
 * - 생성자 : 객체 생성시 멤버변수를 초기화하는 메서드 (♥1)
 * - 메서드 : print,  getter/setter
 */
class Card{
	private char shape = '♥';
	private int num = 1;
	
	public Card() {
		
	}
	public Card(char shape, int num) {
		this.shape = shape;
		this.num = num;
	}
	
	public void print() {
		if(shape != '♥' && shape != '♣' && shape != '◆' && shape != '♠') {
			System.out.print('♥');
		}else {
			System.out.print(shape);
		}
		if(num <= 10) {
			System.out.println(num);
		}else {
			switch(num) {
			case 11 : System.out.println("J");break;
			case 12 : System.out.println("Q");break;
			case 13 : System.out.println("K");break;
			default : System.out.println(1);break;
			}
		}
	}

	public char getShape() {
		return shape;
	}

	public void setShape(char shape) {
		this.shape = shape;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	
}
