package ch04;

public class for01 {
	public static void main(String[] args) {
		int total = 0; // 누적할 곳
		for(int i = 1; i <= 100; i += 1) {
			//  조건		결과		증감
			
			total += i; // 결과 누적, total = total + 1;
			System.out.println(i);
		}
		System.out.println(total); // println 결과 하나마다 한 줄 바꿈 / print 결과값 한 번에 보여줌
	}
}
