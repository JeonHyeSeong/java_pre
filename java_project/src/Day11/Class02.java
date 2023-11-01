package Day11;

public class Class02 {

	public static void main(String[] args) {
		Car c = new Car();
		c.setColor("red");
		c.setPower(true);
		c.setSpeed(2000);
		System.out.println("My Car Color : "+c.getColor());
		System.out.println("My Car Power : "+c.getPower());
		System.out.println("My Car Speed : "+c.getSpeed());
		
		
		//Car c2 = new Car(); // 새로생긴 객체(새자동차)
	}

}

class Car{ // 클래스명은 대문자로 시작
	// 멤버변수 = private 설정
	// 메서드 = public 설정 => getter/setter 메서드
	private String color;
	private boolean power;
	private int speed;
	
	public void power() {
		power =! power;
	}
	public void speedUp() {
		speed+=10;
	}
	public void speedDowm() {
		speed-=10;
	}
	// getter / setter
	public String getColor() {
		return this.color;
	}
	public boolean getPower() {
		return this.power;
	}
	public int getSpeed() {
		return this.speed;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
}
