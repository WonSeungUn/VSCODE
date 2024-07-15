package kosa.basic;

import java.util.Arrays;
import java.util.Comparator;

public class ArraySort {

	public static void main(String[] args) {
		// 배열 내용 정렬
		int arr[] = { 3, 2, 5 };
		System.out.println(arr);
		System.out.println(Arrays.toString(arr));

		// 배열 내용을 순차적(오름차순)으로 정렬시켜준다.
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

		// 퀴즈> 내림차순 출력(for문)
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[arr.length - 1 - i] + " ");
		}

		System.out.println();

		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();

		// 2차원 배열의 오름차순 배열
		int arr2[][] = { { 2, 90 }, { 1, 60 }, { 3, 20 } }; // [3][2]

		Arrays.sort(arr2, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				// 정렬기준 작성 => 2차원 배열 안에 1차원 첫번째 기준으로 오름차순
				if (o1[0] < o2[0]) {
					// return - 1의 경우 자리를 바꾸지 않는다.
					return -1;
				} else if (o1[0] > o2[0]) {
					// return 1; 은 자리를 바꾼다는 의미
					return 1;
				} else {
					return 0;
				}
			}
		});
		
		// 2차원 배열의 경우 deepToString 으로 정렬한 값을 볼 수 있음
		System.out.println(Arrays.deepToString(arr2));
		
		// 2차원 배열의 내림차순 정렬
		int arr3[][] = { { 2, 90 }, { 1, 60 }, { 3, 20 } }; // [3][2]
		
		Arrays.sort(arr3, new Comparator<int[]>() {
			
			@Override
			public int compare(int[] o1, int[] o2) {
				// 정렬기준 작성 => 2차원 배열 안에 1차원 첫번째 기준으로 내림차순
				if (o1[0] < o2[0]) {
					// return 1; 은 자리를 바꾼다는 의미
					return 1;
				} else if (o1[0] > o2[0]) {
					// return - 1의 경우 자리를 바꾸지 않는다.
					return -1;
				} else {
					return 0;
				}
			}
		});
		
		// 2차원 배열의 경우 deepToString 으로 정렬
		System.out.println(Arrays.deepToString(arr3));

	}

}
