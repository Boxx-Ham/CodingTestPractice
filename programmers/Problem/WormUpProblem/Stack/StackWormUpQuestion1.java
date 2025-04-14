package PROGRAMMERS.Problem.WormUpProblem.Stack;

/*
 * 문제 09 : 10진수를 2진수로 변환하기
 * 권장 시간 : 30분
 * 권장 시간 복잡도 : O(logN)
 * 코딩 테스트 합격자 되기
 */

import java.util.Stack;

public class StackWormUpQuestion1 {
    public static void main(String[] args) {
        int inputDecimal1 = 10;
        int inputDecimal2 = 27;
        int inputDecimal3 = 12345;

        String outputValue1 = solution(inputDecimal1);
        String outputValue2 = solution(inputDecimal2);
        String outputValue3 = solution(inputDecimal3);

        System.out.println(inputDecimal1 + " -> " + outputValue1);
        System.out.println(inputDecimal2 + " -> " + outputValue2);
        System.out.println(inputDecimal3 + " -> " + outputValue3);
    }

    static String solution(int decimal) {
        // 2진수를 담을 Stack 생성 및 리턴 값 담을 StringBuilder 생성
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        // decimal이 1보다 작아질 때까지 2진수 변환 작업 지속
        while (decimal > 0) {
            // decimal을 2로 나눈 나머지 stack에 저장
            stack.push(decimal % 2);

            // 다음 연산을 위해 decimal 2로 나눠줌
            decimal /= 2;
        }

        // stack이 빌 때까지 하나씩 꺼내서 StringBuilder에 넣기
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        return sb.toString();
    }
}
