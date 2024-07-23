
public class 연산 {
	public static void main(String[] args) {
		int sum = sum(10, 20, 30, 40, 1, 2, 3, 4);
		System.out.printf("%s %s %s", 1, 2, 3 + "\n");
		System.out.println(sum);
		
		long time = System.currentTimeMillis();
		// 1713838549644 = Unix Time
		// 1713838564890 // milli second 0.001
		// 뒤 3자리 제거 -> 17억 초
		// 1970년 1월 1일 00시
		System.out.println(time);
	}
	
	static int sum(int ... values) {
		int sum = 0;
		for(int i = 0; i < values.length; i++) {
			sum += values[i];
			
		}
		return sum;
	}
	
	static int sum1(int a, int b) {
		return a + b;
	}

}
