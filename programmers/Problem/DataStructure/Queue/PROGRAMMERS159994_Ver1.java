package PROGRAMMERS.Problem.DataStructure.Queue;

/*
 * 문제 17 : 카드 뭉치
 * 권장 시간 : 40분
 * 권장 시간 복잡도 : O(N + M)
 * 프로그래머스 159994번 (https://school.programmers.co.kr/learn/courses/30/lessons/159994)
 */

/*
 * 두 가지의 방법 
 * 1. 인덱스를 사용하는 방법
 */

import java.util.Arrays;

public class PROGRAMMERS159994_Ver1 {
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

    static String solution(String[] cards1, String[] cards2, String[] goal) {
        // cards1, cards2의 인덱스를 각각 0으로 초기화
        int idx1 = 0;
        int idx2 = 0;

        for (String card : goal) {
            // card가 cards1[idx1]와 같다면 idx1++
            if (idx1 < cards1.length && card.equals(cards1[idx1])) {
                idx1++;
            
            // card가 cards2[idx2]와 같다면 idx2++
            } else if (idx2 < cards2.length && card.equals(cards2[idx2])) {
                idx2++;

            // 둘 다와 같지 않다면 goal은 완성할 수 없음
            } else {
                return "No";
            }
        }

        // for문을 나오면 goal이 완성되므로 "Yes" 반환
        return "Yes";
    }
}