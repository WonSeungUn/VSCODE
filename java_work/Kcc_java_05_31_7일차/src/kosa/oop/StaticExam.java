package kosa.oop;

public class StaticExam {
	int total;
	static int grandTotal;
	
	// �޸��� ���� ������ �ٸ��� ������ total ���� �߻�
	// total �� ��ü�� �����Ǿ�� �ϴµ� �� �������� ��ü ���� x => �޸� X
	// static�� ��� ��ü�� ���� ������ ������� Ŭ������ �ε��� �� ����
	public static void add() {
		grandTotal += 10;
//		total += 20;
	}
	
	public static void main(String[] args) {
		add();
	}
}
