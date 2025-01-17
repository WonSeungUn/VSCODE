package kosa.basic;

import java.util.Comparator;
import java.util.Random;
import java.util.TreeSet;

public class SortExam {
	public static void main(String[] args) {
		// 정렬
		// 기본 정렬 : Comparable => compareTo() 오버라이딩
		// 정렬기준 변경 : Comparator => compare() 오버라이딩
		
		Random r = new Random();
		TreeSet<Integer> tree = new TreeSet<Integer>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// 내림차순 정렬
				if(o1 < o2) {
					// o2 가 o1보다 클 경우 o2가 o1자리로 가기!
					return 1;
				} else if(o1 >o2) {
					// o1 이 o2보다 클 경우 그대로 두기!
					return -1;
				}
				return 0;
			}
			
		});
		
		for(int i = 0 ; tree.size()<6 ; i++) {
			tree.add(r.nextInt(45) + 1);
			
		}
		System.out.println(tree);
	}
}
