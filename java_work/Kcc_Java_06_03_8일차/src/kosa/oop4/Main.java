package kosa.oop4;

public class Main {

	public static void main(String[] args) {
		// MyType => �͸���Ŭ������ ����
		MyType mt = new MyType() {
			
			@Override
			public void hello() {
				System.out.println("�ȳ��ϼ���");
			}
			
		};
		mt.hello();
		
		// ���ٽ����� ���� (���ǻ��� : �߻� �޼��尡 1���� �� ����)
		MyType mt2 = () -> {
			System.out.println("���ٽ� �����Դϴ�.");
		};
		mt2.hello();
		
		MyType mt3 = () -> System.out.println("���ٽ� 2��° �����̴�");
		mt3.hello();
		
		YourType you = (String message) -> {
			System.out.println("�޼��� : " + message);
		};
		
		you.talk("�ȳ�");
		
		YourType you2 = message -> System.out.println("�޼��� :" + message);
		you2.talk("hello");
		
		// �ش��ϴ� MyNumber �߻�޼��� ����(���ٽ�)
		MyNumber mn = (num1,num2) -> {return Math.max(num1, num2);};
		System.out.println(mn.getMax(5,1));
		
		// Runnable ���ٽ� ����
		Runnable r = () -> {
			for(int i = 1 ; i<=10 ; i++) {
				try {
					Thread.sleep(1000);
				} catch (Exception e) {}
				System.out.println(i);
			}
		};
		
		Thread t = new Thread(r);
		t.start();
	}

}
