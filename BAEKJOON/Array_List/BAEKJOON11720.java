package BAEKJOON.Array_List;

/*
 * 문제 001 : 숫자의 합
 * 시간 제한 1초 (연산횟수 100,000,000)
 * 난이도 : 브론즈 II
 * 백준 11720번 (https://www.acmicpc.net/problem/11720)
 */

/*
 * N개의 숫자가 공백 없이 써 있다.
 * 이 숫자를 모두 합해 출력하는 프로그램을 작성하시오.
 * 
 * 1. 입력
 * 1번째 줄에 숫자의 개수 N(1 <= N <= 100)
 * 2번째 줄에 숫자 N개가 공백 없이 주어진다.
 * 
 * 2. 출력
 * 입력으로 주어진 숫자 N개의 합을 출력한다.
 * 
 * 3. 입출력 예시 (입력 / 출력)
 * 1 \n 1                           /       1
 * 5 \n 54321                       /       15
 * 25 \n 7000000000000000000000000  /       7
 * 11 \n 10987654321                /       46
 */

import java.util.Scanner;

public class BAEKJOON11720 {
    public static void main(String[] args) {
        // N 값 입력받기
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        // 길이 N의 숫자 입력받아 String형 변수 sNum에 저장
        String sNum = scanner.next();

        // sNum을 다시 char []형 변수 cNum에 변환하여 저장
        char[] cNum = sNum.toCharArray();

        // int형 변수 sum 선언
        int sum = 0;

        // 2025-02-19 BoxxHam : cNum의 길이 만큼 반복 -> N 만큼 반복으로 수정
        // cNum의 길이만큼 반복
        for (int i = 0; i < N; i++) {
            // 배열의 각 자릿값을 정수형으로 변환해 sum에 더하여 누적
            sum += cNum[i] - '0';
        }

        // sum 출력
        System.out.println(sum);

        scanner.close();
    }
}
