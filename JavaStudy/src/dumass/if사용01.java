package dumass;

public class if사용01 {
	public static void main(String[] args) {
		int num = 5;
		if(num > 10) {
			System.out.println("10보다 큼");
		} else if(num > 5) {
			System.out.println("5보다 큼");
		}else if(num == 5) {
			System.out.println("5와 같음");
		}else {
			if(num < 0) {
				System.out.println("음수");
			} else if(num == 0) {
				System.out.println("0임");
			} else {
				System.out.println("5보다 작은 양수");
			}
		}
	}

}
