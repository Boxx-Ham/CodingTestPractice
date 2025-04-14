package PROGRAMMERS.Problem.DataStructure.Queue;

/*
 * 문제 17 : 카드 뭉치
 * 권장 시간 : 40분
 * 권장 시간 복잡도 : O(N + M)
 * 프로그래머스 159994번 (https://school.programmers.co.kr/learn/courses/30/lessons/159994)
 */

import java.util.Arrays;

public class PROGRAMMERS159994 {
    public static void main(String[] args) {
        String[] firstCards1 = {"i", "drink", "water"};
        String[] secondCards1 = {"i", "water", "drink"};
        String[] cards2 = {"want", "to"};
        String[] goal = {"i", "want", "to", "drink", "water"};

        String result1 = solution(firstCards1, cards2, goal);
        String result2 = solution(secondCards1, cards2, goal);

        System.out.println(Arrays.toString(firstCards1) + " / " + Arrays.toString(cards2) + " / " + Arrays.toString(goal) + " -> " + result1);
        System.out.println(Arrays.toString(secondCards1) + " / " + Arrays.toString(cards2) + " / " + Arrays.toString(goal) + " -> " + result2);
    }

    static String solution(String[] card1, String[] card2, String[] goal) {
        return "";
    }
}
