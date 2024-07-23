package ch05;

import java.util.Arrays;

public class arr1 {
	public static void main(String[] args) {
		float[] arr = new float[3];
		System.out.println(arr);
		System.out.println(Arrays.toString(arr)); // 항목 확인
		
		arr[0] = 9.9987f;
		arr[1] = 10.123f;
		
		for(int i = 0; i < arr.length; i++) {
			float 요소 = arr[i];
			System.out.printf(요소+" ");
			
		}
	}

}
