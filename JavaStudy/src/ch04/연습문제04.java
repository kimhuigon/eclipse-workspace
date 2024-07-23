package ch04;

public class 연습문제04 {
	public static void main(String[] args) {
		for(int i = 1; i <= 20; i++) {
			/*String s = "";
			if(i < 10) {
				s = "0" + i;
			} else {
				s = i + "";
			} 스트링을 사용해서 결과를 사용*/
			
			System.out.print( (i < 10 ? "0" + i : i) + " "); // 삼항 연산자를 사용해서 결과를 뽑는 과정
			
			if(i % 5 == 0) {
			System.out.println("");
			}
		}
	}
}