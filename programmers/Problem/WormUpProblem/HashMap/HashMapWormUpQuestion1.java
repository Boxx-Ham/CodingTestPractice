package PROGRAMMERS.Problem.WormUpProblem.HashMap;

/*
 * 문제 18 : 두 개의 수로 특정값 만들기
 * 권장 시간 : 30분
 * 권장 시간 복잡도 : O(N + K)
 * 코딩 테스트 합격자 되기
 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashMapWormUpQuestion1 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 8};
        int target1 = 6;

        int[] arr2 = {2, 3, 5, 9};
        int target2 = 10;

        boolean result1 = solution(arr1, target1);
        boolean result2 = solution(arr2, target2);

        System.out.println(Arrays.toString(arr1) + " / " + target1 + " -> " + result1);
        System.out.println(Arrays.toString(arr2) + " / " + target2 + " -> " + result2);
    }

    static boolean solution(int[] arr, int target) {
        // 로직에 사용할 HashSet 선언
        Set<Integer> hashSet = new HashSet<>();

        // target 보다 작은 arr의 원소 HashSet 안에 넣기
        // 중복되는 원소가 존재하지 않으므로 짝수의 경우 num + num = target이 되는 수가 나올 수 있으므로 target / 2 제외
        for (int num : arr) {
            if (num < target && num != target / 2) {
                hashSet.add(num);
            }
        }

        // 로직 시작
        for (int num : arr) {
            // target - num 이 arr 안에 있으면 arr의 원소 두 개를 합쳐서 target이 나올 수 있음
            if (hashSet.contains(target - num)) {
                return true;
            } 
        }

        return false;
    }
}
