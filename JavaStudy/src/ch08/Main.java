package ch08;

public class Main {
	private int money;
	// 캡슐화
	public void setMoney(int m) {
		if(m > 1000) {
			System.out.println("1000 초과 금지");
			m = 1000;
		}
		money = m;
	}

}
