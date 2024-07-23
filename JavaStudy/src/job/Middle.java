package job;

public class Middle {
	public static void main(String[] args) {
		int a = 3;
		int b = 2;
		int c = 1;
		
		if(a >= b && a <= c || a >= c && a <= b) {
			System.out.println(a);
		}else if (b >= a && b <= c || b <= a && c >= c) {
			System.out.println(b);
		}else {
			System.out.println(c);
		}
	}
}