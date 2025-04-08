package PROGRAMMERS.DataStructure.Stack;

/*
 * 문제 10 : 괄호 회전하기
 * 권장 시간 : 30분
 * 권장 시간 복잡도 : O(N^2)
 * 프로그래머스 76502번 (https://school.programmers.co.kr/learn/courses/30/lessons/76502)
 */

import java.util.Stack;

public class PROGRAMMERS76502 {
    public static void main(String[] args) {
        // 반례 추가 : "({[)]}"
        String[] inputS = {"[](){}", "}]()[{", "[)(]", "}}}", "({[)]}"};

        for (int i = 0; i < inputS.length; i++) {
            System.out.println(inputS[i] + " -> " + solution(inputS[i]));
        }
    }

    static int solution(String s) {
        // s의 길이가 홀수이면 올바른 괄호 문자열이 절대 될 수 없으므로 미리 0 반환
        if (s.length() % 2 == 1) return 0;

        // 올바른 괄호 문자열의 개수를 담기 위한 변수 선언
        int count = 0;

        // x번 만큼 반복함
        for (int x = 0; x < s.length(); x++) {
            // x번 회전한 s 생성
            String str = s.substring(x) + s.substring(0, x);

            // str이 올바른 괄호 문자열인지 확인 : isValid() 함수 사용
            // 만약 올바른 괄호 문자열이면 count 증가
            if (isValid(str)) count++;
        }

        return count;
    }

    static boolean isValid(String s) {
        // s의 첫 문자가 닫는 괄호이거나 s의 마지막 문자가 여는 괄호인 경우 올바른 괄호 문자열이 아니므로 false 리턴
        int len = s.length();
        if (s.charAt(0) == ')' || s.charAt(0) == '}' || s.charAt(0) == ']' || s.charAt(len - 1) == '(' || s.charAt(len - 1) == '{' | s.charAt(len - 1) == '[') {
            return false;
        }

        // 올바른 괄호 문자열 판별을 위한 Stack 생성
        Stack<Character> stack = new Stack<>();

        // s가 올바른 괄호 문자열인지 판별
        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);

            // ch가 여는 괄호이면 stack에 넣기
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);

            // 닫는 괄호인 경우
            } else {
                // stack이 비어있는데 ch가 닫는 괄호인 경우 올바른 괄호 문자열이 아니므로 false 리턴
                if (stack.isEmpty()) {
                    return false;

                // stack이 비어있지 않다면 stack 안의 문자와 ch가 서로 같은 종류의 괄호인지 확인
                } else {
                    char open = stack.pop();

                    // 서로 같은 종류의 괄호가 아니면 올바른 괄호 문자열이 아니므로 false 리턴
                    if (!((open == '(' && ch == ')') || (open == '{' && ch == '}') || (open == '[' && ch == ']'))) {
                        return false;
                    }
                }
            }
        }

        // stack이 비어있지 않으면 false, 비어있으면 true 반환
        // 비어있으면 올바른 괄호 문자열이기 때문
        return stack.isEmpty();
    }
}
