package ch08;

public class Static {
	public static void main(String[] args) {
		Static s = new Static();
	}
	int a =  0;
	static int b = 0;
	void c() {
		System.out.println(b);
		System.out.println(a);
	}
	static void d() {
		Static s = new Static();
		System.out.println(s.a);
	}

}
