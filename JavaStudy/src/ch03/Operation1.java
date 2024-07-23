package ch03;

public class Operation1 {
	public static void main(String[] args) {
		int a = 10;
		a = -a;
		System.out.println(a);
		System.out.println(a++);
		System.out.println(a);
		System.out.println(--a);
		System.out.println(--a);
		System.out.println(a);
		
		boolean b = true;
		System.out.println(b != false);
		
		char c1 = 'a';
		char c2 = c1++;
		char c3 = ++c1;
		System.out.println(c2);
		System.out.println(c3);
		
		int s = 10;
		int q = 5;
		int result = ++s + q++;
		System.out.println(result);
		System.out.println(s);
		System.out.println(q);
		
		for(int i = 0; i < 100; i++) {
			if(i == 100) {
				
			}
			System.out.println(i);
		}
	}
}
