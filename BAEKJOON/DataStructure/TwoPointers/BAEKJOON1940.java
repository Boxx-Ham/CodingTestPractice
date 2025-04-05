package BAEKJOON.DataStructure.TwoPointers;

/*
 * 문제 007 : 주몽
 * 시간 제한 2초 (연산횟수 200,000,000)
 * 난이도 : 실버 IV
 * 백준 1940번 (https://www.acmicpc.net/problem/1940)
 */

/*
 * 주몽은 철기군을 양성하기 위한 프로젝트에 나섰다.
 * 그래서 야철대장에게 철기군이 입을 갑옷을 만들라고 명령했다.
 * 야철대장은 주몽의 명령에 따르기 위해 연구에 착수하던 중 갑옷을 만드는 재료들은 각각 고유한 번호가 있고, 
 * 갑옷은 2개의 재료로 만드는 데 2가지 재료의 고유한 번호를 합쳐 M(1 <= M <= 10,000,000)이 되면 갑옷이 만들어진다는 사실을 발견했다.
 * 야철대장은 자신이 만들고 있는 재료로 갑옷을 몇 개나 만들 수 있는지 궁금해졌다.
 * 야철대장의 궁금증을 풀어 주기 위해 N(1 <= N <= 15,000)개의 재료와 M이 주어졌을 때 몇 개의 갑옷을 만들 수 있는지를 구하는 프로그램을 작성하시오.
 * 
 * 1. 입력
 * 1번째 줄에 재료의 개수 N(1 <= N <= 15,000)
 * 2번째 줄에 갑옷을 만드는 데 필요한 수 M(1 <= M <= 10,000,000)이 주어진다.
 * 3번째 줄에는 N개의 재료들이 가진 고유한 번호들이 공백을 사이에 두고 주어진다.
 * 고유한 번호는 100,000보다 작거나 같은 자연수다.
 * 
 * 2. 출력
 * 1번째 줄에 갑옷을 만들 수 있는 개수를 출력한다.
 * 
 * 3. 입출력 예시 (입력 / 출력)
 * 6 \n 9 \n 2 7 4 1 5 3    /   2
 */

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.StringTokenizer;
import java.util.Arrays;

public class BAEKJOON1940 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // N 입력받기
        int N = Integer.parseInt(br.readLine());

        // M 입력받기
        int M = Integer.parseInt(br.readLine());

        // N 크기의 배열 arr 만들기
        int[] arr = new int[N];

        // arr의 값 입력 받기
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // arr 정렬하기
        Arrays.sort(arr);

        int p1 = 0;
        int p2 = N - 1;
        int count = 0;

        // 갑옷 몇 개 만들 수 있는지 확인 로직
        while (p1 < p2) {
            // 경우 1 : arr[p1] + arr[p2] = M 인 경우
            if (arr[p1] + arr[p2] == M) {
                // 제일 작은 수와 제일 큰 수를 더했을 때 M이 나옴으로 제일 작은 수는 이제 끝남.
                // 제일 큰 수보다 작은 수들을 제일 작은 수와 더해봤자 M이 나오지 않음으로 제일 큰 수 끝남.
                // 따라서 p1 증가, p2 감소, count 증가
                count++;
                p1++;
                p2--;

            // 경우 2 : arr[p1] + arr[p2] < M 인 경우
            } else if (arr[p1] + arr[p2] < M) {
                // 제일 작은 수와 제일 큰 수를 더했어도 M보다 작다는 것은 제일 작은 수와 다른 수들을 더해도 M보다 작다는 것 의미
                // 따라서 p1 증가
                p1++;

            // 경우 3 : arr[p1] + arr[p2] > M 인 경우
            } else {
                // 제일 작은 수와 제일 큰 수를 더했더니 M보다 커졌으므로 제일 큰 수보다 하나 작은 수로 변경해서 다시 비교
                // 따라서 p2 감소
                p2--;
            }
        }

        System.out.println(count);
    }
}
