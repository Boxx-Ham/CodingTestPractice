package BAEKJOON.Problem.DataStructure.TwoPointers;

/*
 * 문제 006 : 수들의 합 5
 * 시간 제한 2초 (연산횟수 200,000,000)
 * 난이도 실버 V
 * 백준 2018번 (https://www.acmicpc.net/problem/2018)
 */

/*
 * 어떠한 자연수 N은 몇 개의 연속된 자연수의 합으로 나타낼 수 있다.
 * 당신은 어떤 자연수 N(1 <= N <= 10,000,000)을 몇 개의 연속된 자연수의 합으로 나타내는 가짓수를 알고 싶다.
 * 이때 사용하는 자연수는 N이어야 한다.
 * 예를 들어 15를 나타내는 방법은 15, 7+8, 4+5+6, 1+2+3+4+5이다.
 * 반면, 10을 나타내는 방법은 10, 1+2+3+4이다. N을 입력받아 연속된 자연수의 합으로 나타내는 가짓수를 출력하는 프로그램을 작성하시오.
 * 
 * 1. 입력
 * 1번째 줄에 정수 N이 주어진다.
 * 
 * 2. 출력
 * 입력된 자연수 N을 자연수의 합으로 나타내는 가짓수를 출력한다.
 * 
 * 3. 입출력 예시 (입력 / 출력)
 * 15   /   4
 */

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class BAEKJOON2018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // N 입력받기
        int N = Integer.parseInt(br.readLine());

        // 가짓수의 갯수를 담을 변수 count 선언
        int count = 0;

        // p1
        for (int i = 1; i <= N; i++) {
            // 자연수의 합을 담을 변수 sum 선언
            int sum = 0;
            
            //p2
            for (int j = i; j <= N; j++) {
                

                // 자연수의 합을 담음.
                sum += j;
                // System.out.println("p1 : " + i + " / p2 : " + j + " / sum : " + sum);

                // sum이 N이랑 같으면 count++, sum이 N을 넘어서면 break
                if (sum >= N) {
                    if (sum == N) {
                        count++;
                        // System.out.println("count : " + count);
                    }

                    break;
                }
            }
        }

        // 자연수의 가짓수 출력
        System.out.println(count);
    }
}
