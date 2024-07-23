package ch15;

import java.util.ArrayList;
import java.util.HashMap;

public class 연습문제03 {
	public static void main(String[] args) {
		ArrayList<HashMap<String,String>> list = new ArrayList<>(); // HashMap을 담을 ArrayList 생성
		HashMap<String, String> map = new HashMap<>(); // 매장 정보를 저장할 HashMap 생성
		map.put("img", "a.jpg");
		map.put("shopName", "통아구찜");
		map.put("rating", "4.6");
		map.put("distance", "314");
		list.add(map); // ArrayList에 HashMap 저장
		
		map = new HashMap<>(); // 매장 정보를 저장할 HashMap 생성
		map.put("img", "b.jpg");
		map.put("shopName", "소래포구회직판장");
		map.put("rating", "-");
		map.put("distance", "338");
		list.add(map); // ArrayList에 HashMap 저장
		System.out.println(list);

	}
}
