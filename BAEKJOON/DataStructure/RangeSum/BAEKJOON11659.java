package BAEKJOON.DataStructure.RangeSum;

/*
 * 문제 003 : 구간 합 구하기 4
 * 시간 제한 0.5초 (연산횟수 50,000,000)
 * 난이도 실버 III
 * 백준 11659번 (https://www.acmicpc.net/problem/11659)
 */

/*
 * 수 N개가 주어졌을 때 i 번째 수에서 j 번째 수까지의 합을 구하는 프로그램을 작성하시오.
 * 
 * 1. 입력
 * 1번째 줄에 수의 개수 N(1 <= N <= 100,000), 합을 구해야 하는 횟수 M(1 <= M <= 100,000)
 * 2번째 줄에 N 개의 수가 주어진다. 각 수는 1,000 보다 작거나 같은 자연수다.
 * 3번째 줄부터는 M개의 줄에 합을 구해야 하는 구간 i와 j가 주어진다.
 * 
 * 2. 출력
 * 총 M개의 줄에 입력으로 주어진 i 번째 수에서 j 번째 수까지의 합을 출력한다.
 * 
 * 3. 입출력 예시 (입력 / 출력)
 * 5 3 \n 5 4 3 2 1 \n 1 3 \n 2 4 \n 5 5    /   12 \n 9 \n 1
 */

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BAEKJOON11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 숫자 개수, 질의 개수 입력 받기
        StringTokenizer st = new StringTokenizer(br.readLine());
        int arraySize = Integer.parseInt(st.nextToken());
        int questionNo = Integer.parseInt(st.nextToken());
        
        // 합 배열 생성 (S[i] = S[i - 1] + A[i])
        st = new StringTokenizer(br.readLine());    // 배열 입력 받기
        long[] sumArray = new long[arraySize + 1];
        
        for (int i = 1; i <= arraySize; i++) {
            sumArray[i] = sumArray[i - 1] + Integer.parseInt(st.nextToken());
        }
        
        // 범위 내의 구간 합 출력 (S[j] - S[i - 1])
        for (int k = 0; k < questionNo; k++) {
            // 질의 범위 받기 (i, j)
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            
            System.out.println(sumArray[j] - sumArray[i - 1]);
        }
    }
}
