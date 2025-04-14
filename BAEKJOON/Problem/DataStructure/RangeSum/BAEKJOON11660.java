package BAEKJOON.Problem.DataStructure.RangeSum;

/*
 * 문제 004 : 구간 합 구하기 5
 * 시간 제한 1초 (연산횟수 100,000,000)
 * 난이도 실버 I
 * 백준 11660번 (https://www.acmicpc.net/problem/11660)
 */

/*
 * N * N 개의 수가 N * N 크기의 표에 채워져 있다.
 * 표 안의 수 중 (X1, Y1)에서 (X2, Y2)까지의 합을 구하려 한다.
 * X는 행, Y는 열을 의미한다.
 * 
 * e.g., N = 4이고 
 * {1, 2, 3, 4}
 * {2, 3, 4, 5}
 * {3, 4, 5, 6}
 * {4, 5, 6, 7}
 * 이렇게 채워져 있을 때를 살표보자.
 * (2, 2)에서 (3, 4)까지의 합을 구하면 
 * {3, 4, 5}
 * {4, 5, 6}
 * 의 합이므로 3 + 4 + 5 + 4 + 5 + 6 = 27
 * (4, 4)에서 (4, 4) 까지의 합을 구하면
 * {7}
 * 의 합이므로 7
 * 
 * 표에 채워져 있는 수와 합을 구하는 연산이 주어졌을 때 이를 처리하는 프로그램을 작성하시오.
 * 
 * 1. 입력
 * 1번째 줄에 표의 크기 N과 합을 구해야 하는 횟수 M이 주어진다.(1 <= N <= 1024, 1 <= M <= 100,000)
 * 2번째 줄부터 N개의 줄에는 표에 채워져 있는 수가 1행부터 차례대로 주어진다.
 * 다음 M개의 줄에는 4개의 정수 X1, Y1, X2, Y2 가 주어지며 (X1, Y1)에서 (X2, Y2)의 합을 구해 출력해야 함
 * 표에 채워져 있는 수는 1,000보다 작거나 같은 자연수다 (X1 <= X2, Y1 <= Y2)
 * 
 * 2. 출력 
 * 총 M줄에 걸쳐 (X1, Y1)에서 (X2, Y2) 까지 합을 구해 출력
 * 
 * 3. 입출력 예시
 * 4 3 \n 1 2 3 4 \n 2 3 4 5 \n 3 4 5 6 \n 4 5 6 7 \n 2 2 3 4 \n 3 4 3 4 \n 1 1 4 4     /   27 \n 6 \n 64
 */

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BAEKJOON11660 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 2차원 배열의 크기와 질의 횟수 입력받기
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 원본 배열
        int[][] array = new int[N + 1][N + 1];

        // 원본 배열에 데이터 입력받기
        for (int i = 1; i <= N; i++) {
            // 한 줄에 한 행을 입력받음
            st = new StringTokenizer(br.readLine());

            for (int j = 1; j <= N; j++) {
                array[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 2차원 구간 합 배열
        int[][] sumArray = new int[N + 1][N + 1];

        // 구간 합 구하기
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <=N; j++) {
                sumArray[i][j] = sumArray[i - 1][j] + sumArray[i][j - 1] - sumArray[i - 1][j - 1] + array[i][j];
            }
        }

        // 질의 계산
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());

            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            System.out.println(sumArray[x2][y2] - sumArray[x1 - 1][y2] - sumArray[x2][y1 - 1] + sumArray[x1 - 1][y1 - 1]);
        }
    }
}
