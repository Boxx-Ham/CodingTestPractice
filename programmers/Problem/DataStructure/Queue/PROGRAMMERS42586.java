package PROGRAMMERS.Problem.DataStructure.Queue;

/*
 * 문제 16 : 기능개발
 * 권장 시간 : 40분
 * 권장 시간 복잡도 : O(N)
 * 프로그래머스 42586번 (https://school.programmers.co.kr/learn/courses/30/lessons/42586)
 */

import java.util.Arrays;

public class PROGRAMMERS42586 {
    public static void main(String[] args) {
        int[] progresses1 = {93, 30, 55};
        int[] progresses2 = {95, 90, 99, 99, 80, 99};

        int[] speeds1 = {1, 30, 5};
        int[] speeds2 = {1, 1, 1, 1, 1, 1};

        int[] result1 = solution(progresses1, speeds1);
        int[] result2 = solution(progresses2, speeds2);

        System.out.println(Arrays.toString(progresses1) + " / " + Arrays.toString(speeds1) + " -> " + Arrays.toString(result1));
        System.out.println(Arrays.toString(progresses2) + " / " + Arrays.toString(speeds2) + " -> " + Arrays.toString(result2));
    }

    static int[] solution(int[] progresses, int[] speeds) {
        return new int[0];
    }
}
