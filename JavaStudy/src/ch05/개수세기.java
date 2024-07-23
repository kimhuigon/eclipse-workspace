package ch05;

public class 개수세기 {
	public static void main(String[] args) {
		int[] nums = {1, 4, 1, 2, 4, 2, 4, 2, 3, 4, 4};
		int findNum = 4;
		int count = 0;
		
		for(int num : nums) {
			if(findNum == num) {
				count += 1;
			}
		}
		System.out.println(count);
	}
}
