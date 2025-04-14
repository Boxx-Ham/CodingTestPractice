package PROGRAMMERS.Problem.Training.Day16;

/*
 * 코딩 기초 트레이닝
 * Day 16 문자열
 * 
 * 문제 05 : 특정한 문자를 대문자로 바꾸기
 * 
 * 프로그래머스 181873번 (https://school.programmers.co.kr/learn/courses/30/lessons/181873)
 */

public class PROGRAMMERS181873 {
    public static void main(String[] args) {
        String inputString1 = "programmers";
        String inputString2 = "lowercase";

        String inputAlp1 = "p";
        String inputAlp2 = "x";

        String outputString1 = solution(inputString1, inputAlp1);
        String outputString2 = solution(inputString2, inputAlp2);

        System.out.println(inputString1 + " / " + inputAlp1 + " -> " + outputString1);
        System.out.println(inputString2 + " / " + inputAlp2 + " -> " + outputString2);
    }

    public static String solution(String my_string, String alp) {
        // replace 사용을 위해 String alp를 alpChar로 변환
        char alpChar = alp.charAt(0);
        
        // 유니코드를 사용해 대문자로 변환 후 다시 char 형으로 변환하여 문자가 되도록 함.
        return my_string.replace(alpChar, (char) (alpChar - 32));
    }
}
