package Day13;

public class Ex {

	public static void main(String[] args) {
		Card c = new Card();
		c.print();
		c.setShape('@');
		c.setNum(14);
		c.print();
		System.out.println();
		System.out.println("---------------");
		
		CardPack pack = new CardPack();
		pack.shuffle();
		for(int i = 1; i <= 4; i++) { // 4줄로 출력
			for(int j = 1; j <= 13; j++) { // 모양대로 13개씩
				Card tmp = pack.pick();
				tmp.print();
			}
			System.out.println();
		}
		
		pack.init();
		pack.shuffle();
		pack.pick().print();

	}

}
