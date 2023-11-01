package Day10;

public class Method06 {

	public static void main(String[] args) {
		/* 메서드를 활용하여 배열을 활용
		 * */
		int arr[] = new int[] {1,3,5,7,4,8,9,6,2,10,11,15,14,13,12};
		printArray(arr);
		System.out.println();
		System.out.println("---정렬 후---");
		int arr2[] = sortArray1(arr);
		printArray(arr);
		System.out.println();
		System.out.println("---arr2---");
		printArray(arr2);

	}
	/* 주어진 정수 배열을 콘솔에 출력하는 메서드
	 * 매개변수 : 정수 배열(int arr[])
	 * 리턴타입 : 출력 => void
	 * 메서드명 : printArray
	 * 5개씩 한줄로 나열
	 * */
	public static void printArray(int arr[]) {
		for(int i = 0; i < arr.length ; i++) {
			if(i%5==0 && i!=0) {
				System.out.println();
			}
			System.out.print(arr[i]+" ");
		}
	}
	
	/* 배열이 주어지면 배열을 오름차순 정렬하는 기능
	 * 매개변수 : 정수 배열(int arr[])
	 * 리턴타입 : 없음 => void
	 * 메서드명 : sortArray
	 * */
	public static void sortArray(int arr[]) {
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
	}
	
	/* 배열이 주어지면 배열을 오름차순 정렬하고 배열을 리턴
	 * 매개변수 : 정수 배열(int arr[])
	 * 리턴타입 : 배열 자료형(int[])
	 * 메서드명 : sortArray1
	 * */
	public static int[] sortArray1(int arr[]) {
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		return arr;
		
	}

}
