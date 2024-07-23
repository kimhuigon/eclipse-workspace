package ch09;

public class 연습문제01 {
	float bottom;
	float height;
	
	
	public float getBottom() {
		return bottom;
	}

	public void setBottom(float bottom) {
		this.bottom = bottom;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}
	
	public float getArea() {
		return bottom * height;
	}

	public 연습문제01() {
		this(10f, 20f);
	}
	
	public 연습문제01(float bottom, float height) {
		this.bottom = bottom; // 전역 변수에 접근하는 방법 this
		this.height = height;
		
	}
}
