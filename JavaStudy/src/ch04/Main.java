package ch04;

public class Main {
	public static void main(String[] args) {
		/*boolean a = true;
		boolean b = false;
		
		if(a == true && b == false || a == false && b == true) {
		if(a  && !b || !a && b) { // 위에 거랑 똑같음, 코딩 간소화
			System.out.println("10년");
		} else if(a && b) {
			System.out.println("5년");
		} else {
			System.out.println("1년");
		}*/
		
		/*for(int i = 1; i <= 9; i++) {
//			System.out.println("i " + i);
			for(int j = 2; j <= 9; j++) {
				System.out.printf("%s * %s = %s  ", j, i, i*j); // %s 해당 자리를 비워놓음, \n 줄바꿈
			}
			System.out.println();
		}*/
		
		int num = 12345;
		int total = 0;
		
		while(num > 0) {
			System.out.println(num);
			total += num % 10; 
//			num /= 10;
			num = num / 10;
		}
		System.out.println(total);
		
	}
	
}
