package ch14;

public class Login {
	public static void main(String[] args) {
		check("buson","1234");
	}

	static void check(String id, String pw) throws 아이디없음예외, 비밀번호틀렸음예외 {
		if (id.equals("busan")) {

		} else {
			// 예외 발생 "아이디없음예외"
			throw new 아이디없음예외();
		}

		if (pw.equals("1234")) {

		} else {
			// 예외 발생 "비밀번호들렸음예외"
			throw new 비밀번호틀렸음예외();
		}
	}
}