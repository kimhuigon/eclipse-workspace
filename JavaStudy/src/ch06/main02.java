package ch06;

public class main02 {

	public static void main(String[] args) {
		// 인자, arguments 아규먼트
		double m = Math.random();
		String s = print(5, "*"); // '' : char , "" : String
		System.out.println(s);
	}

	static String print(int count, String c) { // 같이 있는 곳에는 public이 필요하지 않음, 다른 위치에서 불러올 때 public이 필요함
		// 반환값, 리턴값 (매개변수, parameters 파라미터)
		String s = " ";
		for (int i = 1; i <= count; i++) {
			for (int j = 1; j <= i; j++) {
				/* System.out.print(c); */ // At
				s += c;
			}
			/* System.out.println(); */
			s += "\n";
		}
		return s;
	}

}