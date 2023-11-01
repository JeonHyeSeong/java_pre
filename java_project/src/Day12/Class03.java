package Day12;

public class Class03 {

	public static void main(String[] args) {
		Car c = new Car(); // 차의 객체가 만들어지는 상태
		c.setName("카니발");
		c.setYear("2023");
		c.setColor("black");
		c.setPower(true);
		c.setSpeed(50);
		c.carName();
		c.powerOn();
		c.speedUp();
		c.speedUp();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.powerOn();
		
		Car c3 = new Car("그랜저","2020","파랑");
		c3.carName();
		
		/* 객체를 생성할때 초기값을 지정하는 것을 생성자
		// 생성자를 이용하면 초기화를 쉽게 할 수 있다.
		// class를 생성하면 기본 아무것도 없는 생성자를 제공 => Car()
		// 다른 생성자를 추가하면 기본 생성자는 사라짐
		// 다른 생성자를 추가하더라도 기본 생성자를 같이 추가하여 
		// 생성자를 여러개 두는 것이 일반적임.
		 * - 생성자 선언 방법
		 * public 클래스명(){ // 리턴타입이 없음. 생성자명은 클래스명과 같아야 함.
		 * 
		 * }
		 */
		

	}

}
class Car{
	// 멤버변수 : name, year, color, power, speed
	private String name; // 변경될 수 없는 값
	private String year;
	private String color;
	private boolean power;
	private int speed;
	
	// 생성자 위치
	public Car() {
		// 기본생성자
	}
	// 생성자의 매개변수의 값이 다르면 사용가능.
	// 오버로딩(메서드 오버로딩, 생성자 오버로딩 가능)
	// 오버로딩 가능 조건 : 매개변수의 개수가 다름, 타입이 다름
	public Car(String name, String year, String color) {
		this.name = name;
		this.year = year;
		this.color = color;
	}
	
	// 메서드 : 내 차종의 정보를 출력하는 메서드(name,  year, color)
	// 내 멤버변수의 정보를 출력
	public void carName() {
		System.out.println("차종 : "+name);
		System.out.println("연식 : "+year);
		System.out.println("색상 : "+color);
	}
	
	// 시동켜기 : powerOn
	// power = true, 시동이 켜졌습니다.
	public void powerOn() {
		if(power) {
			System.out.println("이미 켜져있습니다.");
			return;
		}
		power = true;
		System.out.println("시동이 켜졌습니다.");
	}
	
	// 시동끄기 : powerOff
	// power = false, 시동이 꺼졌습니다.
	public void powerOff() {
		if(speed != 0) {
			System.out.println("시동을 끌 수 없습니다.");
			return;
		}
		power = false;
		System.out.println("시동이 꺼졌습니다.");
	}
	
	// 속도 올림 : speedUp
	// 최대속도 200이 넘어가면 더이상 speed가 올라가지 않는다
	public void speedUp() {
		if(power) {
			if(speed < 200) {
				speed+=10;
				System.out.println("현재속도 : "+speed);
			}else {
				System.out.println("speed가 올라가지 않습니다.");
			}
			
		}else {
			System.out.println("시동이 켜지지 않았습니다.");
		}
	}
	
	// 속도 내림 : speedDown
	// 속도가 0이 되면 더이상 내려가지 않는다.
	public void speedDown() {
		if(power) {
			if(speed <= 0) {
				System.out.println("speed가 내려가지 않습니다.");
			}else {
				speed-=10;
				System.out.println("현재속도 : "+speed);
			}
		}else {
			System.out.println("시동이 켜지지 않았습니다.");
		}
	}
	// getter/setter 생성
	public String getName() {
		return name;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
