package ch08;

public class Test {
	public static void main(String[] args) {
		// instance
		노트북[] books = new 노트북[3];
		삼성갤럭시북 a = new 삼성갤럭시북();
		a.on();
		a.off();
		books[0] = a;
	}
}
