package kosa.basic;

public class ArrayExam02 {

	public static void main(String[] args) {
		// 2차원 배열 생성 방법
		// 1. 모든 2차원 배열의 크기가 일정할 경우
		int arr[][];
		arr = new int[3][2];

		// 2. 각 2차원의 크기가 다를 경우
		int arr2[][] = new int[3][];
		arr2[0] = new int[2];
		arr2[1] = new int[3];
		arr2[2] = new int[4];
		
		// 3. 2차원 배열 선언, 생성, 초기화
		//		int arr3[][] = {{1,2},{3,4},{8,9}}; // int[3][2];
		int arr3[][] = {{1,2},{3,4,5},{6,7,8,9}}; // int[3][];
		
		
		// 3번 전체 출력
		for(int i = 0 ; i < arr3.length; i++) {
			for(int j = 0 ; j < arr3[i].length ; j++) {
				System.out.println("arr3["+i+"]["+j+"]="+arr3[i][j]);
			}
		}
		
		
		
		
		
		
	}

}
