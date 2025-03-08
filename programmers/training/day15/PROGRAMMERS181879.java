package programmers.training.day15;

/*
 * 코딩 기초 트레이닝
 * Day 15 리스트(배열), 문자열
 * 프로그래머스 181879번 (https://school.programmers.co.kr/learn/courses/30/lessons/181879)
 * 
 * 문제 4 : 길이에 따른 연산
 * 정수가 담긴 리스트 num_list가 주어질 때, 리스트의 길이가 11 이상이면 리스트에 있는 모든 원소의 합을,
 * 10 이하이면 모든 원소의 곱을 return 하도록 solution 함수를 완성해주세요.
 * 
 * 제한사항
 * 2 <= num_list의 길이 <= 20
 * 1 <= num_list의 원소 <= 9
 * num_list의 원소를 모두 곱했을 때 2,147,483,647를 넘는 입력은 주어지지 않습니다.
 * 
 * 입출력 예시 (num_list / result)
 * [3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1]  /   51
 * [2, 3, 4, 5]                             /   120
 */

import java.util.Arrays;

public class PROGRAMMERS181879 {
    public static void main(String[] args) {
        int[] inputList1 = {3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1};
        int[] inputList2 = {2, 3, 4, 5};

        int output1 = solution(inputList1);
        int output2 = solution(inputList2);

        System.out.println(Arrays.toString(inputList1) + " -> " + output1);
        System.out.println(Arrays.toString(inputList2) + " -> " + output2);
    }

    public static int solution(int[] num_list) {
        int length = num_list.length;
        // num_list의 길이가 11 이상인 경우에는 합이므로 result가 0
        // num_list의 길이가 10 이하인 경우에는 곱이므로 result가 1
        int result = length >= 11 ? 0 : 1;

        for (int i = 0; i < length; i++) {
            // num_list의 길이가 11 이상인 경우
            if (length >= 11) {
                // 모든 원소의 합
                result += num_list[i];

            // num_list의 길이가 최소 2이므로 else로 사용
            // num_list의 길이가 10 이하인 경우
            } else {
                // 모든 원소의 곱
                result *= num_list[i];
            }
        }

        return result;
    }
}
