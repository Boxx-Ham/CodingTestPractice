package BAEKJOON.DataStructure.Queue;

/*
 * 문제 014 : 절댓값 힙
 * 시간 제한 2초 (연산횟수 200,000,000)
 * 난이도 : 실버 I
 * 백준 11286번 (https://www.acmicpc.net/problem/11286)
 */

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.PriorityQueue;


public class BAEKJOON11286 {
    public static void main(String[] args) throws IOException {
        // 1. 연산의 개수 N 입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // 2. 우선순위 큐 선언 (정렬을 해야 하기 때문)
        PriorityQueue<Integer> queue = new PriorityQueue<>((e1, e2) -> {
            int firstAbs = Math.abs(e1);
            int secondAbs = Math.abs(e2);

            // 절대값이 같은 경우 음수가 먼저 큐에 들어가야 함
            if (firstAbs == secondAbs) {
                return e1 > e2 ? 1 : -1;
            } else {
                // 절대값이 작은 것이 먼저 큐에 들어가야 함
                return firstAbs - secondAbs;
            }
        });

        // 3. 로직 시작
        for (int i = 0; i < N; i++) {
            int input = Integer.parseInt(br.readLine());

            // 0은 출력
            if (input == 0) {
                // 큐가 비어있다면 0 출력
                if (queue.isEmpty()) {
                    System.out.println(0);

                // 비어있지 않다면 제일 작은 절댓값(음수) 출력
                } else {
                    System.out.println(queue.poll());
                }

            // 0이 아니면 input을 queue에 넣기
            } else {
                queue.add(input);
            }
        }
    }
}