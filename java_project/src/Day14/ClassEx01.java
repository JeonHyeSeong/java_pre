package Day14;

public class ClassEx01 {

	public static void main(String[] args) {
		// Car class를 활용한 생성자 연습
		Car c = new Car();
		c.setName("카니발");
		c.setColor("white");
		c.setYear("2023");
		c.setDoor("4");
		c.setAirback("4");
		c.prinfInfo();
		c.powerOnOff();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		// toString 호출
		System.out.println(c);
		

	}

}
// Car class 작성 위치
class Car{
	// 멤버변수 : name, color, year, door, airback, power, speed
	// 멤버변수 생성 => getter/setter 생성
	// 생성자 : 기본생성자
	// name, color, year 받는 생성자
	// name, color, year, door 받는 생성자
	// name, coloe, year, door, airback 받는 생성자
	// 전체 받는 생성자
	
	// 메서드
	// printInfo() : name, color, year, door, airback 출력
	
	// powerOnOff()
	
	// speedUp()
	
	// speedDowm()
	
	private String name;
	private String color;
	private String year;
	private String door;
	private String airback;
	private boolean power;
	private int speed;
	
	public Car() {
		
	}
	
	public Car(String name, String color, String year) {
		this.name = name;
		this.color = color;
		this.year = year;
	}
	
	public Car(String name, String color, String year, String door) {
		this(name,color,year);
		this.door = door;
	}
	
	public Car(String name, String color, String year, String door,
			String airback) {
		this(name,color,year,door);
		this.airback = airback;
	}
	
	public Car(String name, String color, String year, String door,
			String airback, boolean power, int speed) {
		super(); // 상속자가 가지고 있는 생성자
		this.name = name;
		this.color = color;
		this.year = year;
		this.door = door;
		this.airback = airback;
		this.power = power;
		this.speed = speed;
	}

	public void prinfInfo() {
		System.out.println("차종 : "+name);
		System.out.println("색상 : "+color);
		System.out.println("연식 : "+year);
		System.out.println("도어 : "+door);
		System.out.println("에어백 : "+airback);
	}
	
	// toString : 멤버변수를 출력하는 기능
	@Override
	public String toString() {
		return "Car [name=" + name + ", color=" + color + ", year=" + year + ", door=" + door + ", airback=" + airback
				+ ", power=" + power + ", speed=" + speed + "]";
	}
	
	
	public void powerOnOff() {
		power = !power;
		if(power) {
			System.out.println("시동이 켜졌습니다");
			return;
		}else {
			System.out.println("시동이 꺼져있습니다");
		}
	}
	

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getDoor() {
		return door;
	}

	public void setDoor(String door) {
		this.door = door;
	}

	public String getAirback() {
		return airback;
	}

	public void setAirback(String airback) {
		this.airback = airback;
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
	
	
	
	
	
	
	
	
	
	
}





