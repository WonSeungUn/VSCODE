package kosa.basic;

public class CallByExam {

	public static void change(int num) {
		// 지금의 num은 change 안에 있을 때만 메모리가 남는다. change 메서드 범위 밖에 벗어나면 메모리가 사라진다.
		num +=10;
	}
	
	// 이 시점에서는 change 메서드의 num은 사라진다.

	public static int change2(int num) {
		num +=10;
		return num;
	}
	
	// 참조형 데이터에 대한 메서드를 정의할 때는 return 값이 꼭 필요한 것은 아니다.
	public static void change2(int brr[]) {
		brr[0] = 200;
	}
	
	public static void main(String[] args) {
		
		int num = 10;
		change(num);
		
		// 지금 num을 출력하면 10이 나오는데 그 이유는 서로 다른 메서드에서 지역변수인 num이 각각의 범위에서만 사용할 수 있으므로 서로 다른 num이기 때문이다.
		// 지금의 num은 main 메서드에서의 num이고 이 시점에서는 change 메서드의 num의 메모리는 사라졌기 때문에 여기서는 main 메서드의 num인 10만 남는다.
//		System.out.println(num);
		
		int change2 = change2(num);

		// change2의 경우 main 메서드 안에 지역변수 change2를 받았고 change2의 메서드의 return 값이 있으므로 change2의 num인 10과 main 메서드의 num인 10을 더해 20이된다.
//		System.out.println(change2);
		
		// arr은 실제 값이 아닌 주소값을 가지고 있다.
		int arr[] = {100};
		
		// arr는 change2 메서드의 파라미터인 brr[] 에게 주소값인 {100}을 줬다.
		// change2 메서드는 주소값을 접근할 수 있다.
		// 주소값의 경우 return 값이 없더라도 직접 값을 바꾸는 것이 아니기 때문에 주소값을 변경할 수 있음.
		// 즉, change2(arr) 의 경우 arr[0] = 200; 으로 바뀌게 할 수 있다.
		change2(arr);
		
		// 그러므로 arr을 출력했을 때 200이 출력된다.
		System.out.println(arr[0]);
		
		int arr1[] = {1,2,3};
		int brr1[] = arr1;
		for(int i = 0; i<brr1.length ; i++) {
			System.out.print(brr1[i] + " ");
		}
		System.out.println();
		brr1[0] = 100;
		System.out.println(arr1[0]);
		
	}

}
