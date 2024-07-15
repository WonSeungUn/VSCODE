package kosa.oop4;

interface A1 {
	B1 abc();
}

class B1 {
	B1(){
		System.out.println("B ������");
	}
}

public class Main3 {

	public static void main(String[] args) {
		// 1. �͸� ����Ŭ����
		A1 a1 = new A1() {

			@Override
			public B1 abc() {
				return new B1();
			}
			
		};
		a1.abc();
		
		// 2. ���ٽ�
		A1 a2 = () -> {
			return new B1();
		};
		a1.abc();
		
		// 3. �ν��Ͻ� ����
		A1 a3 = B1::new;
		a3.abc();
	}

}
