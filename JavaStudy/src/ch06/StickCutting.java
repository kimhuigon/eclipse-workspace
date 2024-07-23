package ch06;

import java.util.ArrayList;
import java.util.List;

public class StickCutting {

    public static void cutSticks(List<Integer> sticks) {
        while (!sticks.isEmpty()) {
            // 현재 막대기들 중 가장 짧은 길이를 찾기
            int minLength = findMinLength(sticks);

            // 자르기 연산을 수행하고, 남은 막대기들의 수를 세기
            List<Integer> remainingSticks = new ArrayList<>();
            for (int length : sticks) {
                if (length - minLength > 0) {
                    remainingSticks.add(length - minLength);
                }
            }

            // 현재 자르기 연산 후 남은 막대기의 수 출력
            System.out.println(sticks.size());

            // 다음 자르기 연산을 위해 남은 막대기들로 업데이트
            sticks = remainingSticks;
        }
    }

    private static int findMinLength(List<Integer> sticks) {
        int minLength = Integer.MAX_VALUE;
        for (int length : sticks) {
            if (length < minLength) {
                minLength = length;
            }
        }
        return minLength;
    }

    public static void main(String[] args) {
        List<Integer> sticks = new ArrayList<>(List.of(5, 4, 4, 2, 2, 8));
        cutSticks(sticks);
    }
}
