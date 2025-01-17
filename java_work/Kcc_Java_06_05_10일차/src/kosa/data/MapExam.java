package kosa.data;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExam {
	public static void main(String[] args) {
		// Map : (key, value), (key, value), ..... => HashMap
		Map<String, String> map = new HashMap<String, String>(); // Map은 Generic이 붙으면 복잡해진다.
		map.put("1", "KIA");
		map.put("2", "LG");
		map.put("3", "Samsung");
		
		System.out.println("요소의 사이즈 : " + map.size());
		
		if(map.containsValue("LG")) {
			map.remove("2");
		}
		System.out.println("요소의 사이즈 : " + map.size());
		
		
		System.out.println("삼성팀 : " +map.get("3"));
		
		
		// Map 에는 순서가 없다.
		// Map 전체 목록 출력(key,value) : key없이ㅣ
		// Map => Set => Iterator
		// key => keySet() : Set (데이터 타입)
		// value => values : Collection (데이터 타입)
		
		// (key, value) => entrySet : Set (데이터 타입)
		Set set = map.entrySet();
		Iterator iter = set.iterator();
		
		while(iter.hasNext()) {
			Map.Entry<String, String> e = (Map.Entry<String, String>)iter.next(); // Map 인터페이스 안의 Entry 내부 인터페이스
			System.out.println("key :" + e.getKey() + " " + "value : " + e.getValue());
		}
		
		
	}
}
