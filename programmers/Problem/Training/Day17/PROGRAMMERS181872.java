package PROGRAMMERS.Problem.Training.Day17;

/*
 * 코딩 기초 트레이닝
 * Day 17 문자열
 * 
 * 문제 01 : 특정 문자열로 끝나는 가장 긴 부분 문자열 찾기
 * 
 * 프로그래머스 181872번 (https://school.programmers.co.kr/learn/courses/30/lessons/181872)
 */

public class PROGRAMMERS181872 {
    public static void main(String[] args) {
        String inputMyString1 = "AbCdEFG";
        String inputMyString2 = "AAAAaaaa";
        String inputPat1 = "dE";
        String inputPat2 = "a";

        String outputResult1 = solution(inputMyString1, inputPat1);
        String outputResult2 = solution(inputMyString2, inputPat2);

        System.out.println(inputMyString1 + ", " + inputPat1 + " -> " + outputResult1);
        System.out.println(inputMyString2 + ", " + inputPat2 + " -> " + outputResult2);
    }

    public static String solution(String myString, String pat) {
        // myString 안에서 pat이 마지막으로 등장하는 시작 인덱스 추출
        int lastIdx = myString.lastIndexOf(pat);

        //반환 시 pat의 끝 인덱스까지 추출해야 하므로 시작지점 + 길이 지점 앞까지 반환
        return myString.substring(0, lastIdx + pat.length());
    }
}
