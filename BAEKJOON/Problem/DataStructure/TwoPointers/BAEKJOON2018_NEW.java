package BAEKJOON.Problem.DataStructure.TwoPointers;

/*
 * 기존 코드의 문제점
 * 제한 시간 2초, N의 최댓값을 생각하지 않고 O(N^2) 방식으로 문제를 품.
 * 2초는 약 2억 번의 연산이고 이는 2*10^8
 * N의 최댓값은 10^7 이고 10^7 * 10^7 = 10^14 이므로 절대 2초안에 해결 불가능
 * 
 * 투 포인터 방식이라고 생각하고 작성한 코드가 브루트포스(Brute Force) 방식임.
 */

/*
 * p1 : 1, p2 : 1, sum : 1, count : 1 (자기 자신은 미리 포함)
 * 
 * 예제 N : 10
 * 
 * p1 : 1, p2 : 1, count : 1, sum : 1 < 10 -> p2 : 2(p2 증가), sum : 3(p2 더하기)
 * p1 : 1, p2 : 2, count : 1, sum : 3 < 10 -> p2 : 3, sum : 6
 * p1 : 1, p2 : 3, count : 1, sum : 6 < 10 -> p2 : 4, sum : 10
 * p1 : 1, p2 : 4, count : 1, sum : 10 = 10 -> p2 : 5(p2 증가), sum : 15(p2 더하기), count : 2
 * p1 : 1, p2 : 5, count : 2, sum : 15 > 10 -> sum : 14(p1 빼기), p1 : 2(p1 증가)
 * p1 : 2, p2 : 5, count : 2, sum : 14 > 10 -> sum : 12, p1 : 3
 * p1 : 3, p2 : 5, count : 2, sum : 12 > 10 -> sum : 9, p1 :4
 * p1 : 4, p2 : 5, count : 2, sum : 9 < 10 -> p2 : 6, sum : 15
 * p1 : 4, p2 : 6, count : 2, sum : 15 > 10 -> sum : 11, p1 : 5
 * p1 : 5, p2 : 6, count : 2, sum : 11 > 10 -> sum : 6, p1 : 6
 * p1 : 6, p2 : 6, count : 2, sum : 6 < 10 -> p2 : 7, sum : 13
 * p1 : 6, p2 : 7, count : 2, sum : 13 > 10 -> sum : 7, p1 : 7
 * p1 : 7, p2 : 7, count : 2, sum : 7 < 10 -> p2 : 8, sum : 15
 * p1 : 7, p2 : 8, count : 2, sum : 15 > 10 -> sum : 8, p1 : 8
 * p1 : 8, p2 : 8, count : 2, sum : 8 < 10 -> p2 : 16, p2 : 9
 * p1 : 8, p2 : 9, count : 2, sum : 16 > 10 -> sum : 8, p1 : 9
 * p1 : 9, p2 : 9, count : 2, sum : 8 < 10 -> p2 : 10, sum : 18
 * 
 * p2 : 10 < 10 을 만족하지 않음으로 종료
 */

/*
 * 4번의 시도만에 통과..
 */

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BAEKJOON2018_NEW {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // N 입력받기
        int N = Integer.parseInt(br.readLine());

        // 투 포인터 변수 초기화
        int p1 = 1;
        int p2 = 1;
        int sum = 1;
        int count = 1;  // 자기 자신 미리 경우의 수 넣음

        // 계산 시작
        while (p2 < N) {    // 자기 자신인 경우는 미리 넣음
            // 1. sum = N
            if (sum == N) {
                // p2 증가 -> sum에 p2 더하기 / count 증가
                sum += ++p2;
                count++;

            // 2. sum > N
            } else if (sum > N) {
                // sum에서 p1 빼고 p1 증가
                sum -= p1++;
            
            // 3. sum < N
            } else {
                // p2 증가 -> sum에 p2 더하기
                sum += ++p2;
            }
        }

        System.out.println(count);
    }
}