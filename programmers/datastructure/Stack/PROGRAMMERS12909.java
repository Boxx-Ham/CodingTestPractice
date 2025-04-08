package PROGRAMMERS.DataStructure.Stack;

/*
 * 문제 08 : 올바른 괄호
 * 권장 시간 : 30분
 * 권장 시간 복잡도 : O(N)
 * 프로그래머스 12909번 (https://school.programmers.co.kr/learn/courses/30/lessons/12909)
 */

import java.util.Stack;

public class PROGRAMMERS12909 {
    public static void main(String[] args) {
        String inputS1 = "()()";
        String inputS2 = "(())()";
        String inputS3 = ")()(";
        String inputS4 = "(()(";
        String inputS5 = "((((";

        boolean outputanswer1 = solution(inputS1);
        boolean outputanswer2 = solution(inputS2);
        boolean outputanswer3 = solution(inputS3);
        boolean outputanswer4 = solution(inputS4);
        boolean outputanswer5 = solution(inputS5);

        System.out.println(inputS1 + " -> " + outputanswer1);
        System.out.println(inputS2 + " -> " + outputanswer2);
        System.out.println(inputS3 + " -> " + outputanswer3);
        System.out.println(inputS4 + " -> " + outputanswer4);
        System.out.println(inputS5 + " -> " + outputanswer5);
    }

    static boolean solution(String s) {
        // '(' 담을 Stack 생성
        Stack<Character> stack = new Stack<>();

        // 조기반환 (s의 길이가 홀수 or s의 시작이 ')' or s의 끝이 '(')
        if (s.length() % 2 != 0 || s.charAt(0) == ')' || s.charAt(s.length() - 1) == '(') {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            // '(' 이면 stack에 넣기
            if (s.charAt(i) == '(') {
                stack.push('(');
            }

            // stack이 비어있지 않고 ')'이면 '(' 빼기
            if (!stack.isEmpty() && s.charAt(i) == ')') {
                stack.pop();

            // stack이 비어있고 ')' 이면 false 반환
            } else if (stack.isEmpty() && s.charAt(i) == ')') {
                return false;
            }
        }
        
        // stack이 비어있으면 짝이 맞으므로 true 반환, 비어있지 않으면 짝이 맞지 않으므로 false 반환
        return stack.isEmpty();
    }
}
