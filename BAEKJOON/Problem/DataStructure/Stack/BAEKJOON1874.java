package BAEKJOON.Problem.DataStructure.Stack;

/*
 * 문제 011 : 스택 수열
 * 시간 제한 2초 (연산횟수 200,000,000)
 * 난이도 : 실버 III
 * 백준 1874번 (https://www.acmicpc.net/problem/1874)
 */

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.Stack;

public class BAEKJOON1874 {
    public static void main(String[] args) throws IOException {
        // 1. 로직에 쓸 변수들 선언
        Stack<Integer> stack = new Stack<>();   // 수열 로직에 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   // 입력값 받는 데 사용
        StringBuilder sb = new StringBuilder(); // 출력값 작성에 사용
        int num = 1;    // 수열에 1부터 자연수를 담기 위해 사용
        boolean flag = true;    // 수열을 작성할 수 있는지 없는지에 대한 분기점으로 사용

        // 2. 수열의 개수 입력받기
        int N = Integer.parseInt(br.readLine());

        // 3. 수열 배열 작성
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        // 4. 수열 작성 가능한지 확인하는 로직
        for (int i = 0; i < N; i++) {
            // 5. 수열 값이 현재 num 값보다 커질 때까지 stack에 push 해야 함
            while(arr[i] >= num) {
                stack.push(num++);
                sb.append("+\n");
            }

            // 6. 만약 수열 값과 stack의 peek 값이 같다면 pop
            if (arr[i] == stack.peek()) {
                stack.pop();
                sb.append("-\n");
            // 7. 만약 다르다면 수열을 만들 수 없으므로 모든 로직 중단
            } else {
                System.out.println("NO");
                flag = false;
                break;
            }
        }

        // 8. flag가 true일 때만 수열이 완성된 것이므로 sb 출력
        if (flag) {
            System.out.println(sb);
        }
    }
}