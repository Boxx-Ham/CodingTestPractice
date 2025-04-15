package PROGRAMMERS.Problem.WormUpProblem.Queue;

/*
 * 문제 15 : 요세푸스 문제
 * 권장 시간 : 30분
 * 권장 시간 복잡도 : O(N * K)
 * 코딩 테스트 합격자 되기
 */

import java.util.ArrayDeque;

public class QueueWormUpQuestion1 {
    public static void main(String[] args) {
        int N = 5;
        int K = 2;

        int result = solution(N, K);

        System.out.println(N + " / " + K + " -> " + result);
    }

    static int solution(int N, int K) {
        // Queue 선언
        ArrayDeque<Integer> queue = new ArrayDeque<>();

        // Queue 안에 1부터 N까지 데이터 삽입
        for (int i = 1; i <= N; i++) {
            queue.addLast(i);
        }

        // poll 한 데이터를 담고 마지막 poll 한 데이터를 반환하기 위한 변수 선언
        int num = 0;

        // 요세푸스 로직 실행
        while (!queue.isEmpty()) {
            // K번째 사람 : K 번 만큼 poll, add 반복
            for (int i = 1; i < K; i++) {
                queue.addLast(queue.pollFirst());
            }

            // 첫 번째 있는 데이터를 삭제
            num = queue.pollFirst();
        }

        // queue가 비게 되면 마지막 남은 숫자가 num에 들어감.
        // 따라서 num을 반환하면 됨
        return num;
    }
}