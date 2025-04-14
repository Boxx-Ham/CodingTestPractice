package PROGRAMMERS.Problem.DataStructure.Array;

/*
 * 문제 06 : 실패율
 * 권장 시간 : 60분
 * 권장 시간 복잡도 : O(M + NlogN)
 * 프로그래머스 42889번 (https://school.programmers.co.kr/learn/courses/30/lessons/42889)
 */

import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class PROGRAMMERS42889 {
    public static void main(String[] args) {
        int inputN1 = 5;
        int inputN2 = 4;

        int[] inputStages1 = {2, 1, 2, 6, 2, 4, 3, 3};
        int[] inputStages2 = {4, 4, 4, 4, 4};

        int[] outputresult1 = solution(inputN1, inputStages1);
        int[] outputresult2 = solution(inputN2, inputStages2);

        System.out.println(inputN1 + ", " + Arrays.toString(inputStages1) + " -> " + Arrays.toString(outputresult1));
        System.out.println(inputN2 + ", " + Arrays.toString(inputStages2) + " -> " + Arrays.toString(outputresult2));
    }

    public static int[] solution(int N, int[] stages) {
        // 실패율을 구하기 위해 필요한 값들
        // 1. 도달한 사람 : 첫 번째 스테이지에는 모든 사람이 도달하므로 전체 플레이어 수
        // 머물고 있는 사람을 빼면 그 다음 스테이지에 도달한 사람이 됨
        int totalPlayer = stages.length;

        // 2. 머물고 있는 사람
        // stages의 각 원소가 막힌 지점을 나타냄
        int[] stay = new int[N + 2];
        for (int stage : stages) {
            stay[stage]++;
        }

        // 실패율 구하기
        Map<Integer, Double> failureMap = new HashMap<>();
        for (int i = 1; i <= N; i++) {
            // 도달한 사람이 0이면 실패율 0
            if (totalPlayer == 0) {
                failureMap.put(i, 0.0);
            // 0이 아니면 실패율 구해야 함
            } else {
                failureMap.put(i, (double) stay[i] / totalPlayer);
            }

            // 다음 스테이지로 넘어가기 전에 도달한 사람 업데이트
            totalPlayer -= stay[i];
        }

        // 정렬 후 반환하기 위한 list 사용
        List<Integer> failureList = new ArrayList<>(failureMap.keySet());

        failureList.sort((m1, m2) -> (Double.compare(failureMap.get(m2), failureMap.get(m1))));

        return failureList.stream().mapToInt(Integer::intValue).toArray();
    }
}
