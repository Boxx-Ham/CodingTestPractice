package PROGRAMMERS.Problem.DataStructure.Array;

/*
 * 문제 03 : 두 개 뽑아서 더하기
 * 권장 시간 : 30분
 * 권장 시간 복잡도 : O(N^2log(N^2))
 * 프로그래머스 68644번 (https://school.programmers.co.kr/learn/courses/30/lessons/68644)
 * 
 * 정수 배열 numbers가 주어집니다.
 * numbers에서 서로 다른 인덱스에 있는 2개의 수를 뽑아 더해 만들 수 있는 모든 수를 배열에 오름차순으로 담아 반환하는 solution() 함수를 완성하세요.
 * 
 * 제약 조건
 * 1. numbers의 길이는 2 이상 100 이하
 * 2. numbers의 모든 수는 0 이상 100 이하
 * 
 * 입출력 예시(입력 / 출력)
 * [2, 1, 3, 4, 1]  /   [2, 3, 4, 5, 6, 7]
 * [5, 0, 2, 7]     /   [2, 5, 7, 9, 12]
 */

import java.util.HashSet;
import java.util.Arrays;

public class PROGRAMMERS68644 {
    public static void main(String[] args) {
        int[] input1 = {2, 1, 3, 4, 1};
        int[] input2 = {5, 0, 2, 7};

        int[] output1 = solution(input1);
        int[] output2 = solution(input2);

        System.out.println(Arrays.toString(input1) + " -> " + Arrays.toString(output1));
        System.out.println(Arrays.toString(input2) + " -> " + Arrays.toString(output2));
    }

    public static int[] solution(int[] numbers) {
        // HashSet 선언하기
        HashSet<Integer> result = new HashSet<>();

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                result.add(numbers[i] + numbers[j]);
            }
        }

        return result.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}
