package Test;

public class CardPack2 {
	private char shape;
	private int num;

	public CardPack2() {
		num = 1;
		shape = '♥';
		int cnt = 0;
		for(int i = 1; i <= 4; i++) { 
			switch(i) {
			case 1 : shape = '♥'; break;
			case 2 : shape = '◆'; break;
			case 3 : shape = '♣'; break;
			case 4 : shape = '♠'; break;
			}
			for(int j = 1; j <= 13; j++) {
				setShape(shape);
				setNum(j);
				print();
				if(cnt == 13) {
					cnt++;
				}
			}
			System.out.println();
		}
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
		if(num < 1 || num > 13) {
			this.num = 1;
		}else {
			this.num = num;
		}
	}

	public static void main(String[] args) {
		Card2 c = new Card2();
		c.setShape('♥');
		c.setNum(1);
		c.print();
		
		CardPack2 cp = new CardPack2();
		
	}



}

