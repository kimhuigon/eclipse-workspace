package ch05;

public class 연습문제01 {
	public static void main(String[] args) {
		int[] arr = {21, 32, 13, 44, 25, 76, 97, 8, 89, 1};
		
		int sum = 0;
		float avg = 0f;
		
		for(int i : arr) {
			sum += i; 
		}
		
		avg = (float)sum / arr.length;
		
		System.out.println("합 : " + sum);
		System.out.println("평균 : " + avg);
	}

}
