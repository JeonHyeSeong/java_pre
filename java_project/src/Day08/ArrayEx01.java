package Day08;

public class ArrayEx01 {

	public static void main(String[] args) {
		/* 1~10까지 담고있는 배열을 생성 => 출력
		 * */
		int arr[] = new int[10];
		for(int i = 0; i<arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		// 배열 섞는 코드
		// 랜덤 번지를 선택해서 순차적으로 하나씩 교환
		/* 교환 코드
		 * int tmp = arr[i];
		 * arr[i] = arr[j];
		 * arr[j] = tmp;
		 * */
		// (int)(Math.random()*개수)+시작
		// 범위를 min = 0, max = arr.length // 10개
		// 범위로 나온다면 min = 1, max = 15까지
		// 개수(max - min + 1) 시작 = min
		// 0~9까지 10개(9 - 0 + 1) 0
		int min = 0;
		int max = arr.length;
		for(int i = 0; i<arr.length; i++) {
			int random = (int)(Math.random()*max)+min;
			int tmp = arr[i];
			arr[i] = arr[random];
			arr[random] = tmp;
		}
		System.out.println();
		System.out.println("-- 섞은 후 --");
		for(int tmp : arr) {
			System.out.print(tmp+" ");
		}
		
		// 오름차순 정렬 : 작은수부터 정렬
		// 내림차순 정렬 : 큰수부터 정렬
		
		for(int i = 0; i<arr.length-1; i++) {
			for(int j = i + 1; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					// 교환코드
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		System.out.println();
		System.out.println("--정렬 후--");
		for(int tmp : arr) {
			System.out.print(tmp+" ");
		}
		
		

	}

}
