package BAEKJOON.DataStructure.TwoPointers;

/*
 * 문제 008 : 좋다
 * 시간 제한 2초 (연산횟수 200,000,000)
 * 난이도 : 골드 IV
 * 백준 1253번 (https://www.acmicpc.net/problem/1253)
 */

/*
 * N개의 수 중에서 어떤 수가 다른 수 두 개의 합으로 나타낼 수 있다면 그 수를 "좋다(GOOD)"고 한다.
 * N개의 수가 주어지면 그 중에서 좋은 수의 개수는 몇 개인지 출력하라.
 * 수의 위치가 다르면 값이 같아도 다른 수이다.
 * 
 * 1. 입력
 * 첫째 줄에는 수의 개수 N(1 <= N <= 2,000)
 * 둘째 줄에는 i번째 수를 나타내는 Ai가 N개 주어진다. (|Ai| <= 1,000,000,000, Ai는 정수)
 * 
 * 2. 출력
 * 좋은 수의 개수를 첫 번째 줄에 출력한다.
 * 
 * 3. 입출력 예시 (입력 / 출력)
 * 10 \n 1 2 3 4 5 6 7 8 9 10   /   8
 */

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.StringTokenizer;
import java.util.Arrays;

public class BAEKJOON1253 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // N 입력받기
        int N = Integer.parseInt(br.readLine());

        // N 크기의 배열 만들고 입력받기
        long[] arr = new long[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }

        
        int count = 0;
        Arrays.sort(arr);

        for (int i = 0; i < N; i++) {
            // 투 포인터 선언
            int p1 = 0;
            int p2 = N - 1;
            // Ai의 최댓값은 10억이므로 long 타입 선언
            long find = arr[i];

            // 좋은 수 찾기
            while (p1 < p2) {
                // 경우 1 : arr[p1] + arr[p2] = find
                if (arr[p1] + arr[p2] == find) {
                    // 좋은 수 찾음
                    // 근데 p1, p2가 i가 아니어야 함.(자기 자신은 포함되면 안됨)
                    if (p1 != i && p2 != i) {
                        // 아니라면 찾고 중복은 허용하지 않으므로 다음 for문 진행
                        count++;
                        break;

                    // p1이 i이면 넘어감 (자기 자신 포함 X)
                    } else if (p1 == i) {
                        p1++;

                    // p2가 i이면 넘어감 (자기 자신 포함 X)
                    } else if (p2 == i) {
                        p2--;
                    }

                // 경우 2 : arr[p1] + arr[p2] > find
                } else if (arr[p1] + arr[p2] > find) {
                    // 제일 큰 수를 하나씩 줄여가며 find 탐색
                    p2--;
                // 경우 3 : arr[p1] + arr[p2] < find
                } else {
                    // 제일 큰 수를 더해도 작으면 제일 작은 수를 증가 
                    // 제일 큰 수보다 작은 수들을 제일 작은 수와 더해봤자 
                    // 제일 큰 수를 더한 것보다 작음
                    p1++;
                }
            }
        }

        System.out.println(count);
    }
}
