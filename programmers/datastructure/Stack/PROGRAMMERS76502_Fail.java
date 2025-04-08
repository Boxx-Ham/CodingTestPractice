package PROGRAMMERS.DataStructure.Stack;

/*
 * 문제 10 : 괄호 회전하기
 * 권장 시간 : 30분
 * 권장 시간 복잡도 : O(N^2)
 * 프로그래머스 76502번 (https://school.programmers.co.kr/learn/courses/30/lessons/76502)
 */

import java.util.Stack;

public class PROGRAMMERS76502_Fail {
    public static void main(String[] args) {
        // 반례 추가 : "({[)]}"
        String[] inputS = {"[](){}", "}]()[{", "[)(]", "}}}", "({[)]}"};

        for (int i = 0; i < inputS.length; i++) {
            System.out.println(inputS[i] + " -> " + solution(inputS[i]));
        }
    }

    static int solution(String s) {
        // 조기 반환 : s의 길이를 변수 len에 담고 홀수이면 올바른 괄호가 나올 수 없으므로 0 반환
        int len = s.length();
        if (len % 2 != 0) {
            return 0;
        }

        // 올바른 괄호 로직에 쓸 Stack 생성
        Stack<Character> smallParen = new Stack<>();
        Stack<Character> curlyBrace = new Stack<>();
        Stack<Character> squareBracket = new Stack<>();

        // x 번 회전시킬 s를 담기 위한 CharArray, 올바른 괄호 문자열의 개수를 담기 위한 count 변수 생성
        char[] charArr = new char[len];
        int count = 0;

        // x번 회전시키기 위한 for 문
        for (int x = 0; x < len; x++) {
            // x번 회전시킨 s를 charArr에 담기
            for (int i = 0; i < len; i++) {
                charArr[(i + (x * 5)) % len] = s.charAt(i);
            }

            // 조기 반환 : 0번 인덱스가 닫는 괄호 혹은 len - 1번 인덱스가 여는 괄호이면 이번 괄호 문자열은 올바르지 않기 때문에 다음 회전으로 넘어감
            if (charArr[0] == ')' || charArr[0] == '}' || charArr[0] == ']' || charArr[len - 1] == '(' || charArr[len - 1] == '{' || charArr[len - 1] == '[') {
                continue;
            }

            // 올바른 괄호 문자열 찾는 로직
            for (int i = 0; i < len; i++) {
                char ch = charArr[i];

                // ch가 여는 괄호라면 해당하는 스택에 추가
                if (ch == '(') {
                    smallParen.push(ch);
                } else if (ch == '{') {
                    curlyBrace.push(ch);
                } else if (ch == '[') {
                    squareBracket.push(ch);

                // ch가 닫는 괄호이고 비어있지 않다면 pop, 비어있다면 break
                } else if (ch == ')') {
                    if (smallParen.isEmpty()) {
                        break;
                    } else {
                        smallParen.pop();
                    }
                } else if (ch == '}') {
                    if (curlyBrace.isEmpty()) {
                        break;
                    } else {
                        curlyBrace.pop();
                    }
                } else if (ch == ']') {
                    if (squareBracket.isEmpty()) {
                        break;
                    } else {
                        squareBracket.pop();
                    }
                }
            }

            // 세 개의 스택이 모두 비어 있다면 count++
            if (smallParen.isEmpty() && curlyBrace.isEmpty() && squareBracket.isEmpty()) {
                count++;
            }
        }

        return count;
    }
}
