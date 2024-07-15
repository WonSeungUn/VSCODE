package kosa.api;

import java.util.Arrays;

public class StringExam {
	public static void main(String[] args) {
		// 1. String 객체 생성 방법과 차이점
		String str = "ABC";
		String str2 = "ABC";
		String str3 = new String("ABC");
		
		
		if(str == str2) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
		if(str == str3) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
		// 2. String 클래스 불변성의 특징 => 메소드를 통해서 어떠한 변화를 주더라도 자기 자신에게 그 변화가 전달이 안된다. => 연산자를 통해서 변화는 가능함 
		// => StringBuffer, StringBuilder (가변성의 특징을 지님)
		// 리턴을 해서 변경된 문자는 반영할 수 있지만 기존의 문자를 수정할 수 없다.
		String str4 = str.concat("DEF");
		System.out.println(str4);
		
		
		StringBuffer sb = new StringBuffer("ABC");
		sb.append("DEF");
		System.out.println(sb);
		
		// 연산자 (+) 변경 가능
		String sql = "select * from board ";
		int num = 10;
		
		if(num ==10) {
			sql += "where num = 10";
		}
		System.out.println(sql);
		
		// 해당 문자열의 위치를 파악 => indexOf("문자열") => 해당 문자열의 인덱스 리턴 (0부터 시작해서 나옴), 없으면 -1 리턴
		System.out.println(sql.indexOf("b"));
		
		// 문자열 길이
		System.out.println(sql.length());
		for(int i = 0 ; i< sql.length() ; i ++) {
			System.out.print(sql.charAt(i));
			}
		
		System.out.println();
		 
		// 문자열 부분 추출 : subString(5), subString(5,10) => index로 보면 6번째부터 9번째까지
		// 퀴즈 : sql 변수 "board" 문자열만 출력
		System.out.println(sql.substring(sql.indexOf("board"),sql.indexOf("b") + 5));
		
		// 퀴즈>
		String fileName = "kosa.jpg";
		String head = "";
		String pattern = "";
		
		head = fileName.substring(0,fileName.indexOf("."));
		pattern = fileName.substring(fileName.indexOf(".")+1);
		System.out.println(head + " : " + pattern);
		
		String id = "kosa";
		String m_id = "Kosa ";
		
		// equalsIgnoreCase : 대소문자 무시
		// .trim() : 공백 제거
		if(id.equalsIgnoreCase(m_id.trim())) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
		// 문자열 ==> String []
		String fruits = "사과, 포도, 수박, 배";
		String arr[] = fruits.split(",");
		System.out.println(Arrays.toString(arr));
		
		
		// 문자열 ==> char[] 변환
		String str5 = "abcdef";
		char arr2[] = str5.toCharArray();
		System.out.println(Arrays.toString(arr2));
		
		
		// 문자열 ==> byte[] 변환
		byte arr3[] = str5.getBytes();
		System.out.println(Arrays.toString(arr3));
		
		
		// 문자열 <==> 정수형
		String str6 = "100";
		int num2 = Integer.parseInt(str6);
		System.out.println(num2);
		
		int num3 = 10;
		String str8 = 10 + "";
		System.out.println(str8);
		
		
		
		
		
		
		
		
		
		
	}
}
