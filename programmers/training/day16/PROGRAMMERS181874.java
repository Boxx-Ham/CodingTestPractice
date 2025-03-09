package programmers.training.day16;

/*
 * 코딩 기초 트레이닝
 * Day 16 문자열
 * 
 * 문제 04 : A 강조하기
 * 
 * 프로그래머스 181874번 (https://school.programmers.co.kr/learn/courses/30/lessons/181874)
 */

public class PROGRAMMERS181874 {
    public static void main(String[] args) {
        String inputString1 = "abstract algebra";
        String inputString2 = "PrOgRaMmErS";

        String outputString1 = solution(inputString1);
        String outputString2 = solution(inputString2);

        System.out.println(inputString1 + " -> " + outputString1);
        System.out.println(inputString2 + " -> " + outputString2);
    }

    public static String solution(String myString) {
        // 조건 2를 만족하며 조건 1을 수행하기 위해 소문자로 바꾸고 charArray로 변환
        char[] charArr = myString.toLowerCase().toCharArray();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < charArr.length; i++) {
            // 조건 1 : "a" -> "A"
            if (charArr[i] == 'a') {
                sb.append("A");
            } else {
                sb.append(charArr[i]);
            }
        }

        return sb.toString();
    }
}
