package Day23;

class MyThread3 extends Thread{
	private int min;
	private int max;
	private int sum;
	
	public MyThread3(int min, int max) {
		this.min = min;
		this.max = max;
		this.sum = 0;
	}
	
	@Override
	public void run() {
		for(int i = min; i <= max; i++) {
			sum += i;
		}
	}
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	
	
}
	
	
	


public class Thread03 {

	public static void main(String[] args) {
		// 1~50, 51~100까지의 합을 구하는 두개의 Thread를 만들어 그 결과를 확인
		// 두개의 Thread가 실행되고 난 후
		// thread1의 합계출력
		// thread2의 합계출력
		// thread1 + thread2 출력
		MyThread3 th = new MyThread3(1,50);
		MyThread3 th1 = new MyThread3(51, 100);
		th.start();
		th1.start();
		
		try {
			th.join();
			th1.join();
			Thread.sleep(1000); // 1초 기다렸다 실행 1/1000
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("1~50까지 합계 : "+th.getSum());
		System.out.println("51~100까지 합계 : "+th1.getSum());
		System.out.println("1~100까지 합계 : "+(th.getSum()+th1.getSum()));
		
		
		
		

	}

}
