package PROGRAMMERS.Problem.Training.Day15;

/*
 * 코딩 기초 트레이닝
 * Day 15 리스트(배열), 문자열
 * 프로그래머스 181881번 (https://school.programmers.co.kr/learn/courses/30/lessons/181881)
 * 
 * 문제 2 : 조건에 맞는 수열 변환하기 2
 * 정수 배열 arr가 주어집니다.
 * arr의 각 원소에 대해 값이 50보다 크거나 같은 짝수라면 2로 나누고, 50보다 작은 홀수라면 2를 곱하고 다시 1을 더합니다.
 * 이러한 작업을 x번 반복한 결과인 배열을 arr(x)라고 표현했을 때, arr(x) = arr(x + 1)인 x가 항상 존재합니다.
 * 이러한 x 중 가장 작은 값을 return 하는 solution 함수를 완성해주세요.
 * 단, 두 배열에 대한 "="는 두 배열의 크기가 서로 같으며, 같은 인덱스의 원소가 각각 서로 같음을 의미합니다.
 * 
 * 제한사항
 * 1 <= arr의 길이 <= 1,000,000
 * 1 <= arr의 원소의 값 <= 100
 * 
 * 입출력 예시 (arr / result)
 * [1, 2, 3, 100, 99, 98]   /   5
 */

import java.util.Arrays;

public class PROGRAMMERS181881 {
    public static void main(String[] args) {
        int[] input = {1, 2, 3, 100, 99, 98};

        int output = solution(input);

        System.out.println(Arrays.toString(input) + " -> " + output);
    }

    public static int solution(int[] arr) {
        boolean mainFlag = true;
        int count = 0;  // x의 값을 담을 변수

        // arr 배열이 더 이상 변하지 않을 때까지 반복
        while (mainFlag) {
            boolean firFlag = true;
            boolean secFlag = true;

            // arr 배열 계산
            for (int i = 0; i < arr.length; i++) {
                // 조건 1 : arr[i]가 50 이상의 짝수인 경우
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    // 나누기 2하기
                    arr[i] /= 2;

                    // 조건 1이 실행되면 이전 배열과 변화가 있음으로 다시 반복해야 함
                    firFlag = false;

                // 조건 2 : arr[i]가 50 미만의 홀수인 경우
                } else if (arr[i] < 50 && arr[i] % 2 == 1) {
                    // 곱하기 2 하고 1 더하기
                    arr[i] = arr[i] * 2 + 1;

                    // 조건 2가 실행되면 이전 배열과 변화가 있음으로 다시 반복
                    secFlag = false;
                }
            }

            // flag들이 둘 다 true이면 이전 배열과 같다는 의미
            if (firFlag && secFlag) {
                // 이전 배열과 같다면 이제 while문 나가도 됨
                mainFlag = false;
            
            // 둘 중 하나라도 false이면 이전 배열과 달라짐 의미
            } else {
                // count 증가시키고 다시 반복
                count++;
            }
        }

        return count;
    }
}
