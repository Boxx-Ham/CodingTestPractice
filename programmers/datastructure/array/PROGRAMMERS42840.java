package programmers.datastructure.array;

/*
 * 문제 04 : 모의고사
 * 권장 시간 : 30분
 * 권장 시간 복잡도 : O(N)
 * 프로그래머스 68644번 (https://school.programmers.co.kr/learn/courses/30/lessons/42840)
 * 
 * 수포자는 수학을 포기한 사람을 줄인 표현입니다.
 * 수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다.
 * 수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.
 * 1번 수포자 : 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
 * 2번 수포자 : 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
 * 3번 수포자 : 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
 * 1번 문제부터 마지막 문제까지의 정답이 순서대로 저장된 배열 answers가 주어졌을 때 가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 반환하는 solution() 함수를 작성하세요.
 * 
 * 제약 조건
 * 1. 시험은 최대 10,000 문제로 구성되어 있습니다.
 * 2. 문제의 정답은 1, 2, 3, 4, 5 중 하나입니다.
 * 3. 가장 높은 점수를 받은 사람이 여럿이라면 반환하는 값을 오름차순으로 정렬하세요.
 * 
 * 입출력 예시(입력 / 출력)
 * [1, 2, 3, 4, 5]  /   [1]
 * [1, 3, 2, 4, 2]  /   [1, 2, 3]
 */

import java.util.ArrayList;
import java.util.Arrays;

public class PROGRAMMERS42840 {
    public static void main(String[] args) {
        int[] input1 = {1, 2, 3, 4, 5};
        int[] input2 = {1, 3, 2, 4, 2};

        int[] output1 = solution(input1);
        int[] output2 = solution(input2);

        System.out.println(Arrays.toString(input1) + " -> " + Arrays.toString(output1));
        System.out.println(Arrays.toString(input2) + " -> " + Arrays.toString(output2));
    }

    public static int[] solution(int[] answers) {
        // 수포자들의 패턴 생성
        int[] firstPattern = {1, 2, 3, 4, 5};
        int[] secondPattern = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] thirdPattern = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        // 채점을 위한 변수 선언
        int[] scores = new int[3];

        // 채점
        for (int i = 0; i < answers.length; i++) {
            // 1번 수포자 채점
            if (answers[i] == firstPattern[i % firstPattern.length]) {
                scores[0]++;
            }

            // 2번 수포자 채점
            if (answers[i] == secondPattern[i % secondPattern.length]) {
                scores[1]++;
            }

            // 3번 수포자 채점
            if (answers[i] == thirdPattern[i % thirdPattern.length]) {
                scores[2]++;
            }
        }

        // 최댓값 담는 변수 선언
        int maxScore = scores[0];

        // 최댓값 찾기
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > maxScore) {
                maxScore = scores[i];
            }
        }
        
        // 최고점자 담을 변수 선언
        ArrayList<Integer> winner = new ArrayList<>();

        // 최고점자 찾기
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == maxScore) {
                winner.add(i + 1);
            }
        }

        return winner.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}