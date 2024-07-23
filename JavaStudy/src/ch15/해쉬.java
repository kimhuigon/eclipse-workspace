package ch15;

import java.util.HashSet;
import java.util.Iterator;

public class 해쉬 {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("1");
		hs.add("A");
		hs.add("3");
		hs.add("B");
		hs.add("2");
		hs.add("C");
		System.out.println(hs);
		Iterator<String> iter = hs.iterator();
		while(iter.hasNext()) {
			String value = iter.next();
			System.out.println(value);
		}

	}

}
