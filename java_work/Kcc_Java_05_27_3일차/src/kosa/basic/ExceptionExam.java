package kosa.basic;

public class ExceptionExam {
		
	public static void noEquals(int a, int b) throws Exception {
		if(a == b) {
			throw new Exception("���� �� �ȵ�");
		}
	}
	
	public static void main(String[] args) {

//		// ����ó�� ������ ���
//		noEquals(10, 10);
//		
//		// ����ó������ ���
//		try {
//			noEquals(10, 10);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		
		// 1,3,4,5,done ����
		// 1,2,4,5,done
		// try�� ��� ���� ó���ϴ� ����� �������� ���ܰ� �ƴѰ�쿡�� catch���� ����� �ȵǰ� ���� ������ ��� try������ ����� �ȵȴ�. 
		// finally �κа� try�� ���� ���Ŀ��� ��¿� ���� ����
		try {
			System.out.println("1");
			noEquals(10, 10);
			System.out.println("2");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("3");
		} finally {
			System.out.println("4");
		}
		System.out.println("5");
		
		System.out.println("done...");
		
		
	}
}
