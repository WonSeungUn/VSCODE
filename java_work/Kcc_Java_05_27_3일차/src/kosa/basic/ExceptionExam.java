package kosa.basic;

public class ExceptionExam {
		
	public static void noEquals(int a, int b) throws Exception {
		if(a == b) {
			throw new Exception("같은 값 안돼");
		}
	}
	
	public static void main(String[] args) {

//		// 예외처리 안했을 경우
//		noEquals(10, 10);
//		
//		// 예외처리했을 경우
//		try {
//			noEquals(10, 10);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		
		// 1,3,4,5,done 실행
		// 1,2,4,5,done
		// try의 경우 예외 처리하는 대상을 기준으로 예외가 아닌경우에는 catch문이 출력이 안되고 예외 사항인 경우 try문에서 출력이 안된다. 
		// finally 부분과 try가 끝난 이후에는 출력에 문제 없음
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
