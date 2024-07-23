package ch11;

public class L_USB extends USB {
	double capacity = 0;
	double speed = 0;

	public L_USB() {
		System.out.println("L_USB 객체 생성");
		capacity = 31.0;
		speed = 210.0;
	}

	@Override
	public void copy() {
		System.out.println(speed + "MB/s 복사");
	}

	public void checkCapacity() {
		System.out.println(capacity + "GB");
	}
}