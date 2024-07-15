package kosa.thread;

public class ThreadExam {
	public static void main(String[] args) {
		// Thread 상속
//		Thread thread = new DigitThread();
//		thread.start();
//		for (char ch = 'A'; ch <= 'Z'; ch++) {
//			System.out.println(ch);
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				System.out.println(e.getMessage());
//			}
//		}
		
		// Runnable 인터페이스를 통한 Thread 구현
		
		Thread thread = new Thread(new MultiThread());
		thread.start();
		char[] arr = {'ㄱ','ㄴ','ㄷ','ㄹ','ㅁ','ㅂ','ㅅ',
				'ㅇ','ㅈ','ㅊ','ㅋ','ㅌ','ㅍ','ㅎ'};
		for(char ch : arr) {
			System.out.println(ch);
		}
		
		}
}
