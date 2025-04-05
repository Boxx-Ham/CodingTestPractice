package PROGRAMMERS.Training.Day15;

/*
 * 코딩 기초 트레이닝
 * Day 15 리스트(배열), 문자열
 * 프로그래머스 181880번 (https://school.programmers.co.kr/learn/courses/30/lessons/181880)
 * 
 * 문제 3 : 1로 만들기
 * 정수가 있을 때, 짝수라면 반으로 나누고 홀수라면 1을 뺀 뒤 반으로 나누면, 마지막엔 1이 됩니다.
 * 예를 들어 10이 있다면 다음과 같은 과정으로 1이 됩니다.
 * 10 / 2 = 5
 * (5 - 1) / 2 = 2
 * 2 / 2 = 1
 * 위와 같이 3번의 나누기 연산으로 1이 되었습니다.
 * 정수들이 담긴 리스트 num_list가 주어질 때, num_list의 모든 원소를 1로 만들기 위해서 필요한 나누기 연산의 횟수를 return하도록 solution 함수를 완성해주세요.
 * 
 * 제한 사항
 * 3 <= num_list의 길이 <= 15
 * 1 <= num_list의 원소 <= 30
 * 
 * 입출력 예시 (num_list / result)
 * [12, 4, 15, 1, 14]   /   11
 */

import java.util.Arrays;

public class PROGRAMMERS181880 {
    public static void main(String[] args) {
        int[] inputList = {12, 4, 15, 1, 14};

        int output = solution(inputList);

        System.out.println(Arrays.toString(inputList) + " -> " + output);
    }

    public static int solution(int[] num_list) {
        int count = 0;

        for (int i = 0; i < num_list.length; i++) {
            // num_list[i]가 1이면 횟수는 0이므로 그냥 다음 원소로 넘어감
            if (num_list[i] == 1) {
                continue;
            }

            // num_list의 최댓값: 30 < 2^5 이므로 4번의 for문 반복
            for (int j = 1; j < 5; j++) {
                // 2^j <= num_list[i] < 2^(j+1)
                if (Math.pow(2, j) <= num_list[i] && num_list[i] < Math.pow(2, j + 1)) {
                    count += j;
                    break;
                }
            }
        }

        return count;
    }
}
