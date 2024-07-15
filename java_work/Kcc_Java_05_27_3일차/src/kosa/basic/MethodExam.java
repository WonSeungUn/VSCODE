package kosa.basic;

public class MethodExam {
	
	// Method의 장점 : 재사용성 유용함
	// Method 정의
	// 접근제어자, (static), 리턴형(void), Method 이름(파라미터(인자))

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
