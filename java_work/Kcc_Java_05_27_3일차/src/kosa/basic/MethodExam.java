package kosa.basic;

public class MethodExam {
	
	// Method�� ���� : ���뼺 ������
	// Method ����
	// ����������, (static), ������(void), Method �̸�(�Ķ����(����))

	public static void printCharacter(char w, int n) {
		for(int i = 1; i<=n; i++) {
			System.out.print(w);
		}
		System.out.println();
	}
	
	public static int add(int a, int b) {
		int sum = a+b;
		return sum;
	}
	
	public static void main(String[] args) {
		int sum = add(10,20);
		System.out.println(sum);
		
//		printCharacter('#', 10);
	}

}
