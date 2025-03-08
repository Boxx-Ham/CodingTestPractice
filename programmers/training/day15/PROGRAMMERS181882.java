package programmers.training.day15;

/*
 * 코딩 기초 트레이닝
 * Day 15 리스트(배열), 문자열
 * 프로그래머스 181882번 (https://school.programmers.co.kr/learn/courses/30/lessons/181882)
 * 
 * 문제 1 : 조건에 맞는 수열 변환하기 1
 * 정수 배열 arr가 주어집니다.
 * arr의 각 원소에 대해 값이 50보다 크거나 같은 짝수라면 2로 나누고, 50보다 작은 홀수라면 2를 곱합니다.
 * 그 결과인 정수 배열을 return하는 solution 함수를 완성해 주세요.
 * 
 * 제한사항
 * 1. 1 <= arr의 길이 <= 1,000,000
 * 2. 1 <= arr의 원소의 값 <= 100
 * 
 * 입출력 예시 (arr / result)
 * [1, 2, 3, 100, 99, 98]   /   [2, 2, 6, 50, 99, 49]
 */

import java.util.Arrays;

public class PROGRAMMERS181882 {
    public static void main(String[] args) {
        int[] input = {1, 2, 3, 100, 99, 98};

        int[] output = solution(input);

        System.out.println(Arrays.toString(input) + " -> " + Arrays.toString(output));
    }

    public static int[] solution(int[] arr) {
        // 결과값을 담을 result 배열을 arr의 크기로 만들기
        int[] result = new int[arr.length];
        
        for (int i = 0; i < arr.length; i++) {
            // 50 이상의 짝수는 / 2
            if (arr[i] >= 50 && arr[i] % 2 == 0) {
                result[i] = arr[i] / 2;

            // 50 미만의 홀수는 * 2
            } else if (arr[i] < 50 && arr[i] % 2== 1) {
                result[i] = arr[i] * 2;
            
            // 조건을 만족하지 않으면 그냥 arr[i] 담기
            } else {
                result[i] = arr[i];
            }
        }

        return result;
    }
}
