package kosa.basic;

public class CallByExam {

	public static void change(int num) {
		// ������ num�� change �ȿ� ���� ���� �޸𸮰� ���´�. change �޼��� ���� �ۿ� ����� �޸𸮰� �������.
		num +=10;
	}
	
	// �� ���������� change �޼����� num�� �������.

	public static int change2(int num) {
		num +=10;
		return num;
	}
	
	// ������ �����Ϳ� ���� �޼��带 ������ ���� return ���� �� �ʿ��� ���� �ƴϴ�.
	public static void change2(int brr[]) {
		brr[0] = 200;
	}
	
	public static void main(String[] args) {
		
		int num = 10;
		change(num);
		
		// ���� num�� ����ϸ� 10�� �����µ� �� ������ ���� �ٸ� �޼��忡�� ���������� num�� ������ ���������� ����� �� �����Ƿ� ���� �ٸ� num�̱� �����̴�.
		// ������ num�� main �޼��忡���� num�̰� �� ���������� change �޼����� num�� �޸𸮴� ������� ������ ���⼭�� main �޼����� num�� 10�� ���´�.
//		System.out.println(num);
		
		int change2 = change2(num);

		// change2�� ��� main �޼��� �ȿ� �������� change2�� �޾Ұ� change2�� �޼����� return ���� �����Ƿ� change2�� num�� 10�� main �޼����� num�� 10�� ���� 20�̵ȴ�.
//		System.out.println(change2);
		
		// arr�� ���� ���� �ƴ� �ּҰ��� ������ �ִ�.
		int arr[] = {100};
		
		// arr�� change2 �޼����� �Ķ������ brr[] ���� �ּҰ��� {100}�� ���.
		// change2 �޼���� �ּҰ��� ������ �� �ִ�.
		// �ּҰ��� ��� return ���� ������ ���� ���� �ٲٴ� ���� �ƴϱ� ������ �ּҰ��� ������ �� ����.
		// ��, change2(arr) �� ��� arr[0] = 200; ���� �ٲ�� �� �� �ִ�.
		change2(arr);
		
		// �׷��Ƿ� arr�� ������� �� 200�� ��µȴ�.
		System.out.println(arr[0]);
		
		int arr1[] = {1,2,3};
		int brr1[] = arr1;
		for(int i = 0; i<brr1.length ; i++) {
			System.out.print(brr1[i] + " ");
		}
		System.out.println();
		brr1[0] = 100;
		System.out.println(arr1[0]);
		
	}

}
