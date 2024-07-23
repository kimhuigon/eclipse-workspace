package ch07;

public class LastOne {
	public static void main(String[] args) {
		int n = 3332;
		int k = 1111; // 1110
		while(n > 1) {
			if(n % k == 0) {
				n = n / k;
			} else {
//				n = n - 1;
				n = n - (n % k); // 코드 간소화
			}
			System.out.printf("n -> %s\n", n);
		}
		/*int a = 25;
		int b = 3;
		int count = 0;
		
		for(int i = 0; i > a ; i++) {
			 i = (a - 1) / b;
			if( i != 0) {
				i = a / b;
				System.out.println(i);
			}else {
				System.out.println(i);
			}
			
		}*/
	}

}
