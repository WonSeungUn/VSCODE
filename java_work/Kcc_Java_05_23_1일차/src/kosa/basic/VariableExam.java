package kosa.basic;

public class VariableExam {

	public static void main(String[] args) {	
		// ������ �����͸� ��� �׸� ex) ȫ�浿, 100, 3.14, true, false ���
		// byte, short, int, long, float, double, boolean, char : �⺻�� ������ Ÿ��(primitive data type)
		// �⺻�� ������ Ÿ�� / ������ ������ Ÿ��
		// ������ ������ ���� ���� ������ Ÿ���� ���ش�.
		// �������� ������ �پ��ϱ� ������ ������ Ÿ�� ���� �پ��ϴ�.
		
		int num; // ������ ���� �� �޸� �Ҵ�   // �޸𸮿� �Ҵ�� ���� ������ Ÿ���� �ִ� ��
		int arr[]; // �迭 ���� �� Object Type
		
		// ���� ������ ������ �ִ� Ư¡ - local variable(��������) �� ���������� �ʱ�ȭ�ؾ� �Ѵ�.
		
		// ���� ������ = : �������� 10 ���� num�� �����Ѵ�. �� ���� �ʱ�ȭ
		num = 10;
//		System.out.println("num�� ����" + num);
	
		// ���� ����� �ʱ�ȭ
		int num2 = 100;
//		System.out.println("num2�� ����" + num2);
		
		// ���ڿ� : String �� ������ ������ Ÿ�� 
		// String Class
		String name = "ȫ�浿";
//		System.out.println(name + "��");

		
		// �������� ���ǻ���
		// ������ : Ư������ X , ���ڷ� ���� X, �ҹ��� ����, _������ ��� ����
		
		// 100, "", true,'',3.124 �� ������ Ÿ�� ����
		// �⺻ ���ͷ� : ���� ������ ������ Ÿ�� 
		// 100 => int , "" => String, 'A' => char, true => boolean, 3.14 => double
//		float a = 3.14;
		
		// casting : ����ȯ
		// casting ���� : byte < short < int < long < float < double < String
		// int <=> char
		float a1 = 3.14f;
		
		double a2 = 3.14;
		
		// 100�� �⺻ ���ͷ��� int�ε� double�� int���� casting �������� ũ�� ������ ������.
		// ������ ĳ������ ��
		double b = 100;
		System.out.println(b);
		
		// ���� ����ȯ
		int c = (int)3.14;
		System.out.println(c);
		
		float num3 = 3.14f;
//		System.out.println(num3);
		
		long num4 = 100L;
//		System.out.println(num4);
		
		// num5�� 8���� 010 �̹Ƿ� ���ڷ� print�ϸ� 8�� ����
		int num5 = 010;
//		System.out.println(num5);
		
		
	}

}
