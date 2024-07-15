package kosa.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class ListExam {

	public static void main(String[] args) {
		// 1 ~ 45 중복되지 않는 로또번호 6개 출력
		Random r = new Random();
		// 1. 배열로 구현
		int[] ar = new int[6];
		for(int i = 0 ; i<ar.length ; i++) {
			ar[i] = r.nextInt(45) +1;
			for(int j=0 ; j<i ; j++) {
				if(ar[i] == ar[j]) {
					i = i-1;
				}
			}
		}
		
		Arrays.sort(ar);
//		System.out.println(Arrays.toString(ar));

		// 2. List 구현
		List<Integer> list = new ArrayList<Integer>();
		
		while(true) {
			int n = r.nextInt(45)+1;
			if(list.contains(n)){
				continue;
			} else {
				list.add(n);
			}
			if(list.size() == 6) break;
		}
		Collections.sort(list);
//		System.out.println(list);
	
		
		// 3. Set 구현(TreeSet) ==> 중복 허용 X
		Set<Integer> set = new TreeSet<Integer>();
		for(int i = 0 ; set.size() < 6 ; i++) {
			set.add(r.nextInt(45)+1);
		}
		System.out.println(set);
		
		Set<Integer> set1 = new TreeSet<Integer>();
		for(int i = 0 ; set1.size() < 6 ; i++) {
			set1.add(r.nextInt(45)+1);
		}
		System.out.println(set1);
		
		Set<Integer> set2 = new TreeSet<Integer>();
		for(int i = 0 ; set2.size() < 6 ; i++) {
			set2.add(r.nextInt(45)+1);
		}
		System.out.println(set2);
		
		Set<Integer> set3 = new TreeSet<Integer>();
		for(int i = 0 ; set3.size() < 6 ; i++) {
			set3.add(r.nextInt(45)+1);
		}
		System.out.println(set3);
		
		Set<Integer> set4 = new TreeSet<Integer>();
		for(int i = 0 ; set4.size() < 6 ; i++) {
			set4.add(r.nextInt(45)+1);
		}
		System.out.println(set4);
	}

}
