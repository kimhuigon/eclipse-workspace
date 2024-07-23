package ch15;

import java.util.ArrayList;
import java.util.Iterator;

public class 연습문제01 {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(2);
		numbers.add(3);
		numbers.add(3);
		numbers.add(2);
		numbers.add(2);
		numbers.add(4);
		numbers.add(1);
		numbers.add(8);
		numbers.add(7);
		System.out.println("삭제 전 데이터 : " + numbers);
		
		Iterator<Integer> iter = numbers.iterator(); // list -> iterator 형태 변경
		System.out.println(iter.next());
		

		// 값-foreach or index-for
//		numbers.remove(0);

		/*for (int i = 0; i < numbers.size(); i++) { // 앞에서부터 순차적으로 삭제
			if (numbers.get(i) % 2 == 0) {
				numbers.remove(i);
			}
		}*/
		
		for(int i = numbers.size() - 1; i >= 0; i--) { // 뒤에서부터 순차적으로 삭제
			if(numbers.get(i) % 2 == 0) {
				numbers.remove(i);
			}
		}
		System.out.println("삭제 후 데이터 : " + numbers);

	}

}
