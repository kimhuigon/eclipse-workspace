package ch05;

public class 연습문제02 {
	public static void main(String[] args) {
		char[] nums = { 'a', 'b', 'c', 'd', 'e', 'f', 'g' };
		for (int i = 0; i < nums.length - 1; i++) {
			// 임의의 값
		int position = (int)(Math.random() * nums.length); // 배열의 길이
		char temp = ' ';
		temp = nums[0];
		nums[0] = nums[position];
		nums[position] = temp;
		// 랜덤 position 위치의 요소와 다른 위치 섞어주기
		}
		System.out.println(nums);
	}
}