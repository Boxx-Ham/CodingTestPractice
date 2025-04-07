package PROGRAMMERS.Training.Day17;

/*
 * 코딩 기초 트레이닝
 * Day 17 문자열
 * 
 * 문제 02 : 문자열이 몇 번 등장하는지 세기
 * 
 * 프로그래머스 181871번 (https://school.programmers.co.kr/learn/courses/30/lessons/181871)
 */

public class PROGRAMMERS181871 {
    public static void main(String[] args) {
        String myString1 = "banana";
        String myString2 = "aaaa";
        String pat1 = "ana";
        String pat2 = "aa";

        int result1 = solution(myString1, pat1);
        int result2 = solution(myString2, pat2);

        System.out.println(myString1 + ", " + pat1 + " -> " + result1);
        System.out.println(myString2 + ", " + pat2 + " -> " + result2);
    }

    public static int solution(String myString, String pat) {
        // 1. myString의 index와 pat이 등장하는 횟수를 담기 위한 변수 선언
        int idx = 0;
        int count = 0;

        // 2. myString의 인덱스부터의 길이가 pat의 길이보다 짧으면 끝
        while (idx <= myString.length() - pat.length()) {
            // 3. idx부터 pat -1 한 부분 문자열이랑 pat 비교하여 동일하면 count 증가
            if (myString.substring(idx, idx + pat.length()).equals(pat)) {
                count++;
            }

            // 4. 다음 부분 문자열 비교 위해 idx 증가
            idx++;
        }

        return count;
    }
}
