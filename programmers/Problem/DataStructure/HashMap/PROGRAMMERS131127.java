package PROGRAMMERS.Problem.DataStructure.HashMap;

/*
 * 문제 20 : 할인 행사
 * 권장 시간 : 60분
 * 권장 시간 복잡도 : O(N)
 * 프로그래머스 131127번 (https://school.programmers.co.kr/learn/courses/30/lessons/131127)
 */

import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class PROGRAMMERS131127 {
    public static void main(String[] args) {
        String[] want1 = {"banana", "apple", "rice", "pork", "pot"};
        int[] number1 = {3, 2, 2, 2, 1};
        String[] discount1 = {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"};

        String[] want2 = {"apple"};
        int[] number2 = {10};
        String[] discount2 = {"banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana"};

        int result1 = solution(want1, number1, discount1);
        int result2 = solution(want2, number2, discount2);

        System.out.println(Arrays.toString(want1) + " / " + Arrays.toString(number1) + " / " + Arrays.toString(discount1) + " -> " + result1);
        System.out.println(Arrays.toString(want2) + " / " + Arrays.toString(number2) + " / " + Arrays.toString(discount2) + " -> " + result2);
    }

    static int solution(String[] want, int[] number, String[] discount) {
        // 1. 원하는 제품과 개수 HashMap에 담기
        Map<String, Integer> wantMap = new HashMap<>();

        for (int i = 0; i < want.length; i++) {
            wantMap.put(want[i], number[i]);
        }

        // 2. 회원가입 할 수 있는 총 일 수 담을 변수 선언
        int count = 0;

        // 3. discount를 10일 씩 훑으면서 wantMap이랑 비교
        for (int i = 0; i < discount.length - 9; i++) { // 1일부터 10일 간 비교 -> 0일부터 9일 간
            // 4. discount의 제품과 개수 담을 HashMap 선언
            Map<String, Integer> discountMap = new HashMap<>();

            // 5. discountMap에 10일간 할인하는 제품과 개수 담기
            for (int j = i; j < i + 10; j++) {
                discountMap.put(discount[j], discountMap.getOrDefault(discount[j], 0) + 1);
            }

            // 6. wantMap과 discountMap이 동일하면 count 증가
            if (wantMap.equals(discountMap)) {
                count++;
            }
        }

        return count;
    }
}