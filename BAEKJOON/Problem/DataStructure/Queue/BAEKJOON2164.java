package BAEKJOON.Problem.DataStructure.Queue;

/*
 * 문제 013 : 카드2
 * 시간 제한 2초 (연산횟수 200,000,000)
 * 난이도 : 실버 IV
 * 백준 2164번 (https://www.acmicpc.net/problem/2164)
 */

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.Queue;
import java.util.LinkedList;

public class BAEKJOON2164 {
    public static void main(String[] args) throws IOException {
        // 1. N 입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // 2. Queue 선언 및 1부터 N까지 채우기
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }

        // 로직 실행
        while (queue.size() > 1) {
            // 1. 맨 끝의 카드 버림
            queue.remove();

            // 2. 맨 끝의 카드를 맨 처음으로 넣기
            queue.add(queue.poll());
        }

        System.out.println(queue.poll());
    }
}