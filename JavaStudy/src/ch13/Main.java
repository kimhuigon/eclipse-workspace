package ch13;

public class Main {
	public static void main(String[] args) {
		Speaker a = new 삼성Speaker();
		a.sound();
		a.connect();
		
		Speaker b = new LGSpeaker();
		b.sound();
		b.connect();
	}
}