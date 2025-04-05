package baekjoon.datastructure.slidingwindow;

/*
 * 문제 010 : 최솟값 찾기
 * 시간 제한 2.4초 (연산횟수 240,000,000)
 * 난이도 : 플래티넘
 * 백준 11003번 (https://www.acmicpc.net/problem/11003)
 */

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

import java.util.StringTokenizer;
import java.util.Deque;
import java.util.LinkedList;

public class BAEKJOON11003 {
    public static void main(String[] args) throws IOException {
        // N, L 입력 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        // A를 입력받아 바로 String으로 만들기 위해 BufferedWriter 사용 및 D를 구하기 위한 LinkedList 생성
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        st = new StringTokenizer(br.readLine());
        Deque<Node> D = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            // Ai의 값 변수에 담기
            int A = Integer.parseInt(st.nextToken());
            
            // D가 비어있지 않고 들어온 A 값이 D의 마지막 값보다 작으면 마지막 노드 삭제
            while (!D.isEmpty() && A < D.getLast().value) {
                D.removeLast();
            }

            // 새로운 A를 D에 저장
            D.addLast(new Node(i, A));

            // 구간 범위 넘어가면 삭제
            if (D.getFirst().index < i - L + 1) {
                D.removeFirst();
            }

            // 맨 앞의 노드가 최솟값이므로 bw에 넣어줌
            bw.write(D.getFirst().value + " ");
        }

        bw.flush(); // 출력
        bw.close();
    }   

    // index, value를 LinkedList에 담기 위해 클래스 선언
    static class Node {
        int index;
        int value;

        Node(int index, int value) {
            this.index = index;
            this.value = value;
        }
    }
}

