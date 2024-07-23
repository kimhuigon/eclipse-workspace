package ch07;

public class StringTest {
	public static void main(String[] args) {
		long a = 0;
		long b = 0;
		
		String s = "";
		
		a = System.currentTimeMillis();
		
		for(int i = 0; i < 100000; i++) {
			s += i;
		}
		b = System.currentTimeMillis();
		System.out.println(b-a);
		
		a = System.currentTimeMillis();
		StringBuffer s2 = new StringBuffer();
		
		for(int i = 0; i < 1000000; i++) {
			s2.append(i);
		}
		b = System.currentTimeMillis();
		System.out.println(b-a);
	}

}
