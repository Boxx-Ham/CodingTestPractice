package BAEKJOON.DataStructure.Stack;

/*
 * 문제 012 : 오큰수
 * 시간 제한 1초 (연산횟수 100,000,000)
 * 난이도 : 골드 IV
 * 백준 17298번 (https://www.acmicpc.net/problem/17298)
 */

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.Stack;
import java.util.StringTokenizer;

public class BAEKJOON17298 {
    public static void main(String[] args) throws IOException {
        // A의 개수, 원소 입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] A = new int[len];

        for (int i = 0; i < len; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        // 로직에 사용할 Stack, 출력에 사용할 StringBuilder 생성
        Stack<Integer> idx = new Stack<>();
        StringBuilder sb = new StringBuilder();

        // NGE 값을 담을 배열 선언
        int[] NGE = new int[len];

        // idx의 기본값은 0
        idx.push(0);

        // 로직 1 : 오른쪽에 큰 값이 있는 경우
        for (int i = 1; i < len; i++) {
            // A[i]가 A[idx]보다 클 때까지 반복 (여러 개의 idx의 NGE가 A[i]일 수 있기 때문)
            while (!idx.isEmpty() && A[i] > A[idx.peek()]) {
                NGE[idx.pop()] = A[i];
            }

            idx.push(i);
        }

        // 로직 2 : 오른쪽에 큰 값이 없는 경우
        while (!idx.isEmpty()) {
            NGE[idx.pop()] = -1;
        }

        // 출력을 위해 StringBuilder에 넣기
        for (int i = 0; i < len; i++) {
            sb.append(NGE[i]);
            sb.append(" ");
        }

        System.out.println(sb.substring(0, sb.length() - 1));
    }
}