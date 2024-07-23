package ch08;

public class 최대공약수2 {
//	int lcm multiple 최소 공배수
	int gcd(int A, int B) {
		int R = A % B;
		if(R == 0) {
			return B;
		}
		return gcd(B, R);
	}
	
	public static void main(String[] args) {
		int A = 21;
		int B = 9;
		최대공약수2 c = new 최대공약수2();
		c.gcd(A, B);
		System.out.println(c.gcd(A, B));
		int 최소공배수 = A * B / c.gcd(A, B);
		System.out.println(최소공배수);
	}
}