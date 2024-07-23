package ch06;

import java.util.Arrays;

public class magicstick {

	public static void main(String[] args) {
		int[] sticks = {5, 4, 4, 2, 2, 8};
//						3  2  2  0  0  6
//						1  0  0  -2 -2 4
		
		// 의사 결정코드(슈도 코드, pseudo code)
		// 1. 최솟값 확인하기
		// 1-1. 정렬
		Arrays.sort(sticks);
		int min = sticks[0];
		System.out.println(min);
		//1-2. 모두 확인(반복문)
		min = sticks[0];
		for(int s : sticks) { // for each
			if(min > s) {
				min = s;	
			}
		}
		System.out.println(min);
		// 2. 배열의 요소에 최솟값을 빼기
		for(int i = 0; i < sticks.length; i++) {
			sticks[i] -= min;
		}
		System.out.println(Arrays.toString(sticks));
		// 3. 0보다 큰 요소의 개수 확인하기 4 -> 2
		int count = 0;
		for(int s : sticks) {
			if( s > 0) {
				count += 1;
			}
		}
		System.out.println(count);
		
	}

}
