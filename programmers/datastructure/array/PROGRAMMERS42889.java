package programmers.datastructure.array;

/*
 * 문제 06 : 실패율
 * 권장 시간 : 60분
 * 권장 시간 복잡도 : O(M + NlogN)
 * 프로그래머스 42889번 (https://school.programmers.co.kr/learn/courses/30/lessons/42889)
 */

import java.util.Arrays;

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
        return new int[0];
    }
}
