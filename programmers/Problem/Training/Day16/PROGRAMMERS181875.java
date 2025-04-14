package PROGRAMMERS.Problem.Training.Day16;

/*
 * 코딩 기초 트레이닝
 * Day 16 문자열
 * 
 * 문제 03 : 배열에서 문자열 대소문자 변환하기
 * 
 * 프로그래머스 181875번 (https://school.programmers.co.kr/learn/courses/30/lessons/181875)
 */

import java.util.Arrays;

public class PROGRAMMERS181875 {
    public static void main(String[] args) {
        String[] inputStringArray1 = {"AAA", "BBB", "CCC", "DDD"};
        String[] inputStringArray2 = {"aBc", "AbC"};

        String[] outputStringArray1 = solution(inputStringArray1);
        String[] outputStringArray2 = solution(inputStringArray2);

        System.out.println(Arrays.toString(inputStringArray1) + " -> " + Arrays.toString(outputStringArray1));
        System.out.println(Arrays.toString(inputStringArray2) + " -> " + Arrays.toString(outputStringArray2));
    }
    
    public static String[] solution(String[] strArr) {
        // 결과 담을 배열 선언
        String[] result = new String[strArr.length];

        for (int i = 0; i < strArr.length; i++) {
            // 경우 1 : 인덱스가 짝수인 경우
            if (i % 2 == 0) {
                // 소문자로 변환
                result[i] = strArr[i].toLowerCase();

            // 경우 2 : 인덱스가 홀수인 경우
            } else {
                // 대문자로 변환
                result[i] = strArr[i].toUpperCase();
            }
        }

        // result 반환
        return result;
    }
}
