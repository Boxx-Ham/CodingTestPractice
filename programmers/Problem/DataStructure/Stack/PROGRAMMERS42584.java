package PROGRAMMERS.Problem.DataStructure.Stack;

/*
 * 문제 12 : 주식가격
 * 권장 시간 : 40분
 * 권장 시간 복잡도 : O(N)
 * 프로그래머스 42584번 (https://school.programmers.co.kr/learn/courses/30/lessons/42584)
 */

import java.util.Arrays;
import java.util.Stack;

public class PROGRAMMERS42584 {
    public static void main(String[] args) {
        int[] prices = new int[]{1, 2, 3, 2, 3};

        int[] output = solution(prices);

        System.out.println(Arrays.toString(prices) + " -> " + Arrays.toString(output));
    }

    static int[] solution(int[] prices) {
        // 로직 담당 Stack, 결과값 담을 배열 생성
        Stack<Integer> stack = new Stack<>();
        int[] priod = new int[prices.length];

        // 1. 중간에 주식 가격이 떨어지는 가격의 초 계산
        for (int i = 0; i < prices.length; i++) {
            // 주식 가격이 떨어짐 : stack이 비어있지 않고 현재 가격이 이전 가격보다 작음
            while(!stack.isEmpty() && prices[i] < prices[stack.peek()]) {
                // 주식 가격이 떨어진 기간을 체크했으므로 priod[stack.peek]에 i - stack.peek() 넣음
                priod[stack.peek()] = i - stack.peek();

                // stack.peek 제거
                stack.pop();
            }

            // 스택이 비어있거나 현재 가격이 이전 가격보다 크면 push
            stack.push(i);
        }

        // 2. 끝까지 주식 가격이 떨어지지 않는 가격의 초 계산
        while(!stack.isEmpty()) {
            priod[stack.peek()] = prices.length - stack.peek() - 1;

            stack.pop();
        }

        return priod;
    }
}