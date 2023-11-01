package Day07;

public class Array03 {

	public static void main(String[] args) {
		int arr[] = new int[] {10,54,57,62,58,63,98,87};
		/* arr 배열의 합계, 평균, 최대값, 최소값을 출력
		 * if로 비교하여 max, min 구하기
		 * Math.max, Math.min 이용
		 * */
		int sum = 0;
		double avg;
		int max = 0;
		int min = arr[0];
		for(int i = 0; i<arr.length; i++) {
			sum = sum + arr[i];
//			if(max < arr[i]) {
//				max = arr[i];
//			}
//			if(min > arr[i]) {
//				min = arr[i];
//			}
			max = Math.max(max, arr[i]);
			min = Math.min(min, arr[i]);
		}
		System.out.println("점수의 합계 : "+sum);
		avg = (double)sum/arr.length;
		System.out.println("점수의 평균 : "+avg);
		System.out.println("점수의 최대값 : "+max);
		System.out.println("점수의 최소값 : "+min);

	}

}
