package ch13;

public class 삼성Speaker implements Speaker {
	// 재정의 오버라이드 override
	public void connect() {
		System.out.println("무선으로 기기연결");
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		
	}

}
