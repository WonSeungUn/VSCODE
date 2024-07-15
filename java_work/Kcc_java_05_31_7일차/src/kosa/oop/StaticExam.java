package kosa.oop;

public class StaticExam {
	int total;
	static int grandTotal;
	
	// 메모리의 생성 시점이 다르기 때문에 total 에러 발생
	// total 은 객체가 생성되어야 하는데 이 시점에서 객체 생성 x => 메모리 X
	// static의 경우 객체의 생성 유무와 상관없이 클래스가 로딩될 때 생성
	public static void add() {
		grandTotal += 10;
//		total += 20;
	}
	
	public static void main(String[] args) {
		add();
	}
}
