package kosa.basic;

import java.util.Arrays;
import java.util.Comparator;

public class ArraySort {

	public static void main(String[] args) {
		// �迭 ���� ����
		int arr[] = { 3, 2, 5 };
		System.out.println(arr);
		System.out.println(Arrays.toString(arr));

		// �迭 ������ ������(��������)���� ���Ľ����ش�.
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

		// ����> �������� ���(for��)
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[arr.length - 1 - i] + " ");
		}

		System.out.println();

		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();

		// 2���� �迭�� �������� �迭
		int arr2[][] = { { 2, 90 }, { 1, 60 }, { 3, 20 } }; // [3][2]

		Arrays.sort(arr2, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				// ���ı��� �ۼ� => 2���� �迭 �ȿ� 1���� ù��° �������� ��������
				if (o1[0] < o2[0]) {
					// return - 1�� ��� �ڸ��� �ٲ��� �ʴ´�.
					return -1;
				} else if (o1[0] > o2[0]) {
					// return 1; �� �ڸ��� �ٲ۴ٴ� �ǹ�
					return 1;
				} else {
					return 0;
				}
			}
		});
		
		// 2���� �迭�� ��� deepToString ���� ������ ���� �� �� ����
		System.out.println(Arrays.deepToString(arr2));
		
		// 2���� �迭�� �������� ����
		int arr3[][] = { { 2, 90 }, { 1, 60 }, { 3, 20 } }; // [3][2]
		
		Arrays.sort(arr3, new Comparator<int[]>() {
			
			@Override
			public int compare(int[] o1, int[] o2) {
				// ���ı��� �ۼ� => 2���� �迭 �ȿ� 1���� ù��° �������� ��������
				if (o1[0] < o2[0]) {
					// return 1; �� �ڸ��� �ٲ۴ٴ� �ǹ�
					return 1;
				} else if (o1[0] > o2[0]) {
					// return - 1�� ��� �ڸ��� �ٲ��� �ʴ´�.
					return -1;
				} else {
					return 0;
				}
			}
		});
		
		// 2���� �迭�� ��� deepToString ���� ����
		System.out.println(Arrays.deepToString(arr3));

	}

}
