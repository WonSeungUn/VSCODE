package kosa.mission;

import java.util.Scanner;

public class FindNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		System.out.println(solution(str));
		
	}

	private static int solution(String str) {
		
		String answer = "";
		
		for(char x : str.toCharArray()) {
		// if(Character.isDigit(x)) answer += x;
			if(x>=48 && x<=57) answer += x;
		}
		
		
		return Integer.parseInt(answer);
	}
}
