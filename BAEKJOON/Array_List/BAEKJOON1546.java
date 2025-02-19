package BAEKJOON.Array_List;

/*
 * 문제 002 : 평균 구하기
 * 시간 제한 2초 (연산횟수 200,000,000)
 * 난이도 : 브론즈 I
 * 백준 1546번 (https://www.acmicpc.net/problem/1546)
 */

/*
 * 세준이는 기말고사를 망쳤다. 그래서 점수를 조작해 집에 가져가기로 결심했다.
 * 일단 세준이는 자기 점수 중 최댓값을 골랐다.
 * 그런 다음 최댓값을 M이라 할 때 모든 점수를 점수/M *100 으로 고쳤다.
 * e.g., 최고점 :70점, 수학 점수 : 50점 -> 수학 점수를 50/70*100 = 71.43 으로 고침
 * 세준이의 성적을 이 방법으로 계산했을 때 새로운 평균을 구하는 프로그램 작성
 * 
 * 1. 입력
 * 1번째 줄에 시험을 본 과목의 개수 N개가 주어짐 (N <= 1,000)
 * 2번째 줄에 세준이의 현재 성적이 주어짐 ( 0 < 성적 <= 100 / 적어도 1개의 갓은 0보다 큼)
 * 
 * 2. 출력
 * 1번째 줄에 새로운 평균 출력
 * 실제 정답과 출력값의 절대 오차 또는 상대 오차가 10^-2(1/100) 이하이면 정답
 * 
 * 3. 입출력 예시 (입력 / 출력)
 * 3 \n 40 80 60        /   75.0
 * 3 \n 10 20 30        /   66.666667
 * 4 \n 1 100 100 100   /   75.25
 * 5 \n 1 2 4 8 16      /   38.75
 * 2 \n 3 10            /   65.0
 */

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BAEKJOON1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 변수 num에 과목의 수 입력 받기
        int num = Integer.parseInt(br.readLine());

        // int[num] 변수 scores 선언
        int[] scores = new int[num];

        // scores[i]에 각 점수 저장
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < num; i++) {
            scores[i] = Integer.parseInt(st.nextToken());
            // System.out.println(scores[i]);
        }

        // 최고점은 max, 각 과목의 총 합은 sum에 저장
        int max = scores[0];
        int sum = 0;
        for (int i = 0; i < num; i++) {
            // 2025-02-19 BoxxHam : 삼항연산자로 축약해 표현
            // if (max < scores[i]) {
            //     max = scores[i];
            // }
            max = max < scores[i] ? scores[i] : max;

            sum += scores[i];
        }

        // sum / max * 100 / num double형으로 형변환해 출력
        // sum을 double형으로 전환하면 자동으로 실수 연산
        System.out.println(((double)sum / max) * 100.0 / num);
    }
}