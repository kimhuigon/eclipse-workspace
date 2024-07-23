package ch15;

import java.util.Iterator;
import java.util.TreeSet;

public class 연습문제02 {
	public static void main(String[] args) {
		TreeSet<Integer> lotto = new TreeSet<Integer>();
		lotto.add(2);
		lotto.add(7);
		lotto.add(11);
		while (true) {
			int num = (int) (Math.random() * 45 + 1);
			lotto.add(num);
			if (lotto.size() == 6)
				break; // TreeSet 객체에 랜덤숫자 저장
		}
		System.out.println(lotto);

	}

}
