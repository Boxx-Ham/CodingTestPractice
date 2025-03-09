package programmers.training.day16;

/*
 * 코딩 기초 트레이닝
 * Day 16 문자열
 * 
 * 문제 02 : 소문자로 바꾸기
 * 
 * 프로그래머스 181876번 (https://school.programmers.co.kr/learn/courses/30/lessons/181876)
 */

public class PROGRAMMERS181876 {
    public static void main(String[] args) {
        String inputString1 = "aBcDeFg";
        String inputString2 = "aaa";

        String outputString1 = solution(inputString1);
        String outputString2 = solution(inputString2);

        System.out.println(inputString1 + " -> " + outputString1);
        System.out.println(inputString2 + " -> " + outputString2);
    }

    public static String solution(String myString) {
        return myString.toLowerCase();
    }
}
