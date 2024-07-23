package ch15;

import java.util.ArrayList;
import java.util.Random;

public class 리스트 {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("1번");
		arrayList.add("2번");
		arrayList.add("3번");
		arrayList.add("=> 4번");
		arrayList.add("=> 5번");
		
		arrayList.set(1, "1-1번");
		arrayList.remove(2);
		
		for(String a : arrayList ) { // for-each
			System.out.println(a);
		}
		
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}

		/*
		  Integer i = 10; int i3 = i;
		  
		  Integer i2 = new Integer("10");
		  
		  ArrayList<Integer> list3 = new ArrayList<Integer>(); // 정상적인 방법 list3.add(1);
		  list3.add(2);
		  
		  int c = list3.get(0); Integer d = list3.get(1);
		  
		  System.out.printf("%s %s\n", c, d);
		  
		  
		  
		  ArrayList<String> list2 = new ArrayList<String>(); // 정상적인 방법
		  list2.add("1번"); int num = 2; // 숫자를 넣기 위한 꼼수 list2.add(num + "");
		  
		  String a = list2.get(0); String b = list2.get(1);
		  
		  System.out.printf("%s %s\n", a, b);
		  
		  
		  
		  ArrayList list = new ArrayList(); // 엉터리 방법 // 입력 list.add("1번");
		  list.add(2); list.add(new Random());
		  
		  // 조회 // 다운캐스팅(down casting) String s = (String) list.get(0); int n = (int)
		  list.get(1); Random r = (Random) list.get(2);
		  
		  System.out.println(s); System.out.println(n); System.out.println(r);
		 */
	}

}
