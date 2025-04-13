package PROGRAMMERS.DataStructure.Stack;

/*
 * 문제 13 : 크레인 인형뽑기 게임
 * 권장 시간 : 60분
 * 권장 시간 복잡도 : O(N^2 + M)
 * 프로그래머스 64061번 (https://school.programmers.co.kr/learn/courses/30/lessons/64061)
 */

import java.util.Arrays;
import java.util.Stack;

public class PROGRAMMERS64061 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}};
        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};

        int result = solution(board, moves);

        for (int[] b : board) {
            sb.append(Arrays.toString(b));
            sb.append(", ");
        }
        sb.delete(sb.length() - 2, sb.length());

        System.out.println(sb.toString() + " / " + Arrays.toString(moves) + " -> " + result);
    }

    static int solution(int[][] board, int[] moves) {
        // 1. 바구니는 Stack 으로, 터진 인형 개수 담을 count 선언
        Stack<Integer> basket = new Stack<>();
        int count = 0;

        // 2. 로직 실행
        for (int move : moves) {
            for (int i = 0; i < board.length; i++) {
                int doll = board[i][move - 1];

                // 3. 현재 뽑은 인형이 0이면 밑으로 이동해야 함
                if (doll == 0) {
                    continue;
                } else {
                    // 4. 인형이 뽑혔으니 0으로 값 변경
                    board[i][move - 1] = 0;

                    // 5. basket 안에 인형이 있고 제일 위의 인형과 현재 뽑은 인형이 서로 같은 인형이라면 터트리고 count + 2 해줘야함
                    if (!basket.isEmpty() && basket.peek() == doll) {
                        basket.pop();
                        count += 2;
                    } else {
                        // 다른 인형이면 쌓아주기
                        basket.push(doll);
                    }

                    // 인형을 뽑았으므로 다음 move로 이동해야함함
                    break;
                }
            }
        }

        return count;
    }
}