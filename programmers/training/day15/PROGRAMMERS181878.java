package programmers.training.day15;

/*
 * 코딩 기초 트레이닝
 * Day 15 리스트(배열), 문자열
 * 프로그래머스 181878번 (https://school.programmers.co.kr/learn/courses/30/lessons/181878)
 * 
 * 문제 5 : 원하는 문자열 찾기
 * 알파벳으로 이루어진 문자열 myString과 pat이 주어집니다.
 * myString의 연속된 부분 문자열 중 pat이 존재하면 1을, 그렇지 않으면 0을 return하는 solution 함수를 완성해 주세요.
 * 단, 알파벳 대문자와 소문자는 구분하지 않습니다.
 * 
 * 제한 사항
 * 1 <= myString의 길이 <= 100,000
 * 1 <= pat의 길이 <= 300
 * myString과 pat은 모두 알파벳으로 이루어진 문자열입니다.
 * 
 * 입출력 예시 (myString / pat / return)
 * "AbCdEfG"    /   "aBc"       /   1
 * "aaAA"       /   "aaaaa"     /   0
 */

public class PROGRAMMERS181878 {
    public static void main(String[] args) {
        String inputMyString1 = "AbCdEfG";
        String inputPat1 = "aBc";
        String inputMyString2 = "aaAA";
        String inputPat2 = "aaaaa";

        int outputInt1 = solution(inputMyString1, inputPat1);
        int outputInt2 = solution(inputMyString2, inputPat2);

        System.out.println(inputMyString1 + ", " + inputPat1 + " -> " + outputInt1);
        System.out.println(inputMyString2 + ", " + inputPat2 + " -> " + outputInt2);
    }

    public static int solution(String myString, String pat) {
        return myString.toUpperCase().contains(pat.toUpperCase()) ? 1 : 0;
    }
}
