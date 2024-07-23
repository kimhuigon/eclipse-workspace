package ch15;

import java.util.HashMap;

public class WordCount {
	public static void main(String[] args) {
		String text = "안촉촉한 초코칩 나라에 살던 안촉촉한 초코칩이 촉촉한 초코칩 나라의 촉촉한 초코칩을 보고 촉촉한 초코칩이 되고 싶어서 촉촉한 초코칩 나라에 갔는데 촉촉한 초코칩 나라의 촉촉한 초코칩 문지기가 넌 촉촉한 초코칩이 아니고 안촉촉한 초코칩이니까 안촉촉한 초코칩나라에서 살아 라고해서 안촉촉한 초코칩은 촉촉한 초코칩이 되는 것을 포기하고 안촉촉한 초코칩 나라로 돌아갔다.";
		String[] words = text.split(" ");
		HashMap<String, Integer> map = new HashMap<>();
		for(String word : words) {
			// map에 word가 있는가?
			if(map.containsKey(word)) {
				map.put(word, map.get(word)+1);
			} else {
				map.put(word, 1);
			}
		}
		System.out.println(map);
	}
}