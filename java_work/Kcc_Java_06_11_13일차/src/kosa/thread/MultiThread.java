package kosa.thread;

public class MultiThread implements Runnable {

	public void run() {
		for(char ch = 'a'; ch <='z' ; ch++) {
			System.out.println(ch);
		}
	}
		
}
