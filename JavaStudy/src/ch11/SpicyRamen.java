package ch11;

public class SpicyRamen extends Ramen{
	void run() {}
	void run(int b) {}
	void run (byte b) {}
	void run(String b) {}
	void run(int b, int c) {}
	
	void run(int b, String s) {}
	void run(String s, int b) {}
	
	
	public SpicyRamen(String name) {
		super.name = name;
	}
	
	@Override
	public String getTaste() {
		return "불 라면 => 매운 라면맛";
	}

}
