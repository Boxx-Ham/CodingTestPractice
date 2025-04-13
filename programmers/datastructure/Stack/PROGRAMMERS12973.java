package PROGRAMMERS.DataStructure.Stack;

/*
 * 문제 11 : 짝지어 제거하기
 * 권장 시간 : 30분
 * 권장 시간 복잡도 : O(N)
 * 프로그래머스 12973번 (https://school.programmers.co.kr/learn/courses/30/lessons/12973)
 */

import java.util.Stack;

public class PROGRAMMERS12973 {
    public static void main(String[] args) {
        String inputS1 = "baabaa";
        String inputS2 = "cdcd";

        int result1 = solution(inputS1);
        int result2 = solution(inputS2);

        System.out.println("\""+ inputS1 + "\" -> " + result1);
        System.out.println('"' + inputS2 + "\" -> " + result2);
    }

    static int solution(String s) {
        // 1. 짝지어 제거하기 위한 Stack 선언
        Stack<Character> stack = new Stack<>();

        // 2. 짝지어 제거하기 로직 시작
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // 3. 비어있는 경우에 stack에 push 하기
            if (stack.isEmpty()) {
                stack.push(ch);
            
            // 4. 비어있지 않은 경우
            } else {
                // 5. 비어있지 않고 ch랑 stack의 제일 위의 문자랑 같은 경우에는 짝지은 문자열이기 때문에 제거
                if (stack.peek() == ch) {
                    stack.pop();

                // 6. 비어있지 않고 ch랑 stack의 제일 위의 문자가 다른 경우에는 stack에 push
                } else {
                    stack.push(ch);
                }
            }
        }

        return stack.isEmpty() ? 1 : 0;
    }
}