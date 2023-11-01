package Day12;

public class Class05 {

	public static void main(String[] args) {
		/* Tv 클래스 생성
		 * - power
		 * - ch  (up : +1씩 증가 / down : -1씩 감소)
		 *   ch은 20까지 있음. 20이 넘어가면 다시 0번으로
		 * - vol (up : +1씩 증가 / down : -1씩 감소)
		 *   vol은 10까지 있음. 10이 넘으면 10, 0이면 음소거
		 * 
		 * */
		Tv t = new Tv();
		t.powerOn();
		t.setCh(19);
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chDown();
		t.chDown();
		t.chDown();
		t.setVol(8);
		t.volUp();
		t.volUp();
		t.volUp();
		t.volDown();
		t.volDown();
		t.volDown();
		t.volDown();
		t.volDown();
		t.volDown();
		t.volDown();
		t.volDown();
		t.volDown();
		t.volDown();
		t.volDown();
		t.volDown();
		
		
	}
}
// 클래스 생성 위치
class Tv {
	private boolean power; // false
	private int ch; // 0
	private int vol; // 0
	
	public void powerOn() {
		power = true;
		System.out.println("전원이 켜졌습니다");
	}
	
	public void powerOff() {
		power = false;
		System.out.println("전원이 꺼졌습니다");
	}
	// 멤버변수의 기본값은 별도 값을 주지 않더라도 기본셋팅 0 / null
	public void chUp() {
		if(power) {
			ch++;
			if(ch > 20) {
				ch = 0;
			}
			System.out.println("채널 "+ch+"번");
		}else {
			System.out.println("전원이 꺼져있습니다");
		}
	}
	
	public void chDown() {
		if(power) {
			ch--;
			if(ch < 0) {
				ch = 20;
			}
			System.out.println("채널 "+ch+"번");
		}else {
			System.out.println("전원이 꺼져있습니다");
		}
	}
	
	public void volUp() {
		if(power) {
			if(vol >= 0 && vol < 10) {
				vol++;
				System.out.println("볼륨 "+vol);
			}else if(vol == 10) {
				vol = 10;
				System.out.println("최대볼륨 입니다");
			}
		}else {
			System.out.println("전원이 꺼져있습니다");
		}
	}
	
	public void volDown() {
		if(power) {
			if(vol > 0 && vol <= 10) {
				vol--;
				System.out.println("볼륨 "+vol);
			}else if(vol <= 0) {
				vol = 0;
				System.out.println("음소거");
			}
		}else {
			System.out.println("전원이 꺼져있습니다");
		}
	}
	public boolean isPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	public int getCh() {
		return ch;
	}
	public void setCh(int ch) {
		this.ch = ch;
	}
	public int getVol() {
		return vol;
	}
	public void setVol(int vol) {
		this.vol = vol;
	}
	
	
}