package Day09;

public class ArrayEx03 {

	public static void main(String[] args) {
		/* 1~45까지 숫자를 랜덤으로 6개 추출하는 로또번호 추출
		 * 오름차순 정렬되도록 출력
		 * */
		
		int arr[] = new int[6];
		for(int i = 0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*45)+1;
		}
		
		for(int i = 0; i<arr.length-1; i++) {
			for(int j = i + 1; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		for(int tmp : arr) {
			System.out.print(tmp+" ");
		}

	}

}
