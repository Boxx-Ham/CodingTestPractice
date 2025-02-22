package PROGRAMMERS.Array;

import java.util.Arrays;
import java.util.ArrayList;

public class PROGRAMMERS42840_NEW {
    public static void main(String[] args) {
        int[] input1 = {1, 2, 3, 4, 5};
        int[] input2 = {1, 3, 2, 4, 2};

        int[] output1 = solution(input1);
        int[] output2 = solution(input2);

        System.out.println(Arrays.toString(input1) + " -> " + Arrays.toString(output1));
        System.out.println(Arrays.toString(input2) + " -> " + Arrays.toString(output2));
    }

    public static int[] solution(int[] answers) {
        /*
         * 기존에는 수포자들의 패턴을 1차원 배열로 담았으나
         * 2차원 배열로 담음으로써 메모리 절약
         */
        int[][] patterns = {
            {1, 2, 3, 4, 5},    // 1번 수포자
            {2, 1, 2, 3, 2, 4, 2, 5},   // 2번 수포자
            {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}  // 번 수포자
        };

        // 수포자들의 점수를 담을 int 배열 변수 선언
        int[] scores = new int[patterns.length];

        /*
         * 채점 
         * 기존에는 for 문 하나를 사용해서 O(N) 맞추고
         * 중첩 for 문 사용 시 O(N^2)이 된다고 생각했지만
         * 문제의 길이는 N, 수포자들의 길이는 3으로 고정
         * 충첩 for 문 사용해도 O(N*3)이 됨 -> O(N)
         */
        for (int i = 0; i < answers.length; i++) {  // 문제의 길이 : N
            for (int j = 0; j < patterns.length; j++) { // 학생의 수 : 3
                if (answers[i] == patterns[j][i % patterns[j].length]) {
                    scores[j]++;
                }
            }
        }

        /*
         * 최고점 구하기
         * 기존은 for문을 돌렸지만 
         * Arrays 클래스의 stream 사용해서 간결하게 표현 가능
         */
        int maxScore = Arrays.stream(scores).max().getAsInt();

        /*
         * 최고점자 구하기
         * 기존에 반환 시 sorted() 메서드 사용했으나
         * for 문 돌면서 오름차순으로 인덱스가 커짐으로 
         * 자동적으로 오름차순 정렬되어 들어감
         * 
         * 따라서 반환 시 sorted() 메서드 사용하지 않고 
         * 빼고 반환해도 됨
         */
        ArrayList<Integer> winner = new ArrayList<>();

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == maxScore) {
                winner.add(i + 1);
            }
        }

        return winner.stream().mapToInt(Integer::intValue).toArray();
    }
}
