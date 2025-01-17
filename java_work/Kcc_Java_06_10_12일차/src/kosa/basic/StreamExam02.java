package kosa.basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExam02 {
	public static int sum;
	public static int sum1;
	public static int sum2;
	public static void main(String[] args) {
		String[] strArray = {"홍길동", "박길동", "이길동"};
		Stream<String> strStream = Arrays.stream(strArray);
		strStream.forEach(str -> System.out.print(str + ","));
		
		System.out.println();
		
		int[] num = {1,2,3,4,5};
		IntStream intStream = Arrays.stream(num);
//		intStream.forEach(number -> System.out.println(number));
		
		// 클래스 타입 변경 가능!
		intStream.asDoubleStream().forEach(d -> System.out.println(d));
		
//		intStream.asDoubleStream().boxed().forEach(obj -> System.out.println(obj.intValue()));
		
		// range의 경우 끝 숫자를 포함하지 않음! 
		// rangeClosed의 경우 끝 숫자 포함함!!
		IntStream intStream2 = IntStream.range(0, 100);
		IntStream intStream3 = IntStream.rangeClosed(0, 100);
		// sum의 경우 상수이어야한다.
		intStream2.forEach(number1 -> sum1 +=number1);
		intStream3.forEach(number2 -> sum2 +=number2);
		System.out.println(sum1);
		System.out.println(sum2);
		
		List<Integer> list = IntStream.of(2,3,4,5,6,7,8).boxed().collect(Collectors.toList());
		list.stream().forEach(l -> sum +=l);
		System.out.println(sum);
	
		// 문자여 배열 => List, Stream 변환
		String[] arr = {"B","C","A"};
//		List<String> arrList = Arrays.asList(arr);
//		
//		Stream<String> streamArr = arrList.stream();
//		streamArr.sorted(new Comparator<String>() {
//
//			@Override
//			public int compare(String o1, String o2) {
//				if(o1.compareTo(o2) < 0) {
//					return 1;
//				} else if(o1.compareTo(o2) >0) {
//					return -1;
//				}
//				return 0;
//			}
//		}).forEach(System.out::println);
		
		Stream<String> arrList = Arrays.stream(arr);
		arrList.sorted().forEach(System.out::println);
		
	
	
	
	
	}
	
	
}
