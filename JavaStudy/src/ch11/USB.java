package ch11;

public class USB {
	double capacity = 16.0;
	double speed = 100.0;

	public USB() {
		System.out.println("USB 객체 생성");
	}

	public void copy() {
		System.out.println(speed + "MB/s 복사");
	}

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

}
