package Day07;

public class 숙제 {

	public static void main(String[] args) {
		/* 10개짜리 배열을 생성한 후
		 * 1~50사이의 랜덤수를 생성한 후 배열에 저장
		 * 배열을 출력
		 * 합계, 평균, 최대, 최소값을 출력
		 * */
		int arr[] = new int[10];
		int sum = 0;
		int max = arr[0];
		int min = 50;
		double avg;
		for(int i = 0; i<arr.length; i++) {
			int random = (int)(Math.random()*50)+1;
			arr[i] = random;
			System.out.println(arr[i]);
			sum = sum + arr[i];
			max = Math.max(max, arr[i]);
			min = Math.min(min, arr[i]);
		}
		System.out.println("합계 : "+sum);
		avg = (double)sum/arr.length;
		System.out.println("평균 : "+avg);
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);

	}

}
