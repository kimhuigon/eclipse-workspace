package ch11;

public class S_USB extends USB {
	double capacity = 0;
	double speed = 0;

	public S_USB() {
		System.out.println("S_USB 객체 생성");
		capacity = 32.0;
		speed = 200.0;
	}

	@Override
	public void copy() {
		System.out.println(speed + "MB/s 복사");
	}

	public void checkCapacity() {
		System.out.println(capacity + "GB");
	}
}