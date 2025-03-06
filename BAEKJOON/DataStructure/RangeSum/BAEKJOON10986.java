package baekjoon.datastructure.rangesum;

/*
 * 문제 005 : 나머지 합
 * 시간 제한 1초 (연산횟수 100,000,000)
 * 난이도 : 골드 III
 * 백준 10986번 (https://www.acmicpc.net/problem/10986)
 */

/*
 * N개의 수 A1, A2, ..., AN이 주어졌을 때 연속된 부분의 합이 M으로 나누어 떨어지는 구간의 개수를 구하는 프로그램을 작성하시오.
 * 즉, Ai + ... + Aj(i <= j)의 합이 M으로 나누어 떨어지는 (i, j)쌍의 개수를 구하시오.
 * 
 * 1. 입력
 * 1번째 줄에 N과 M(1 <= N <= 10^6, 2 <= M <= 10^3)
 * 2번째 줄에 N개의 수 A1, A2, ..., AN이 주어진다. (0 <= Ai <= 10^9)
 * 
 * 2. 출력
 * 1번재 줄에 연속된 부분의 합이 M으로 나누어 떨어지는 구간의 개수를 출력한다.
 * 
 * 3. 입출력 예시(입력 / 출력)
 * 5 3 \n 1 2 3 1 2     /   7
 */

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.StringTokenizer;

public class BAEKJOON10986 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // N과 M 입력받기
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 나머지의 개수를 각각 저장하기 위해 나머지를 인덱스로 하는 배열 선언
        int[] modArray = new int[M];

        // 부분 합 S0 = 0이므로 인덱스 0의 초기값 1로 설정
        modArray[0] = 1;

        // 출력할 변수를 0으로 선언 
        // 주의점 : i, j 쌍의 개수를 구하는 것인데 i가 10^9까지 가능함
        // int형은 대략 2*10^9 이므로 long형으로 선언
        long result = 0;
        
        // 데이터의 크기가 크기때문에 부분합을 구해 계산에 사용하지 않고 바로 모듈러 연산 실행을 위해 부분합을 모듈러 한 값을 담을 변수 선언
        // 이 또한 int형이 아닌 long형으로 선언
        int prefixSumMod = 0; // S0=0이므로 0 % 3 = 0으로 초기화

        // N개의 수 입력받기
        st = new StringTokenizer(br.readLine());

        // 결과 연산
        for (int i = 0; i < N; i++) {
            // 부분 합 공식 : (S[i] = S[i - 1] + A[i]) % 3
            prefixSumMod = (prefixSumMod + Integer.parseInt(st.nextToken())) % M;

            // prefixSumMod를 인덱스로 하는 modArray의 값을 result에 저장
            result += modArray[(int) prefixSumMod];

            // prefixSumMod를 인덱스로 하는 modArray의 값 + 1
            modArray[(int) prefixSumMod]++;
        }

        // result 출력
        System.out.println(result);
    }
}
