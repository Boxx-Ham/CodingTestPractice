package PROGRAMMERS.Problem.Training.Day17;

/*
 * 코딩 기초 트레이닝
 * Day 17 문자열
 * 
 * 문제 03 : ad 제거하기
 * 
 * 프로그래머스 181870번 (https://school.programmers.co.kr/learn/courses/30/lessons/181870)
 */

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class PROGRAMMERS181870_new {
    public static void main(String[] args) {
        String[] strArr1 = {"and", "notad", "abcd"};
        String[] strArr2 = {"there", "are", "no", "a", "ds"};

        String[] result1 = solution(strArr1);
        String[] result2 = solution(strArr2);

        System.out.println(Arrays.toString(strArr1) + " -> " + Arrays.toString(result1));
        System.out.println(Arrays.toString(strArr2) + " -> " + Arrays.toString(result2));
    }

    public static String[] solution(String[] strArr) {
        // "ad"가 포함되어있지 않은 문자열을 담기 위한 ArrayList 선언
        List<String> result = new ArrayList<>();

        // constains 메서드 사용해서 "ad"가 들어있는지 확인
        for (String str : strArr) {
            // 안들어있으면 담기
            if (!str.contains("ad")) {
                result.add(str);
            }
        }

        // String 배열로 바꿔 변환
        return result.toArray(new String[0]);
    }
}
