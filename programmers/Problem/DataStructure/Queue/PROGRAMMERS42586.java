package PROGRAMMERS.Problem.DataStructure.Queue;

/*
 * 문제 16 : 기능개발
 * 권장 시간 : 40분
 * 권장 시간 복잡도 : O(N)
 * 프로그래머스 42586번 (https://school.programmers.co.kr/learn/courses/30/lessons/42586)
 */

import java.util.Arrays;
import java.util.ArrayDeque;

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
        // 배포 개수를 담을 queue, 배포일을 담을 int[] 선언
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        int n = progresses.length;
        int[] deploymentDate = new int[n];

        // 배포일을 담아야 함
        // 배포일 : 100 - progress / speed 를 올림하여 int로 계산
        for (int i = 0; i < n; i++) {
            deploymentDate[i] = (int) Math.ceil((100.0 - progresses[i]) / speeds[i]);
        }

        // 마지막 배포일을 처음 값으로 초기화하고 로직 반복
        int lastDate = deploymentDate[0];

        // 배포되는 개수를 담을 변수 선언 
        int count = 0;

        for (int i = 0; i < n; i++) {
            // 마지막 배포일보다 지금 배포일이 작을 경우
            if (lastDate >= deploymentDate[i]) {
                // 마지막 배포일에 같이 배포함으로 배포되는 개수를 1 증가
                count++;

            // 마지막 배포일보다 클 경우
            } else if (lastDate < deploymentDate[i]){
                // 배포되는 개수를 담고 마지막 배포일을 해당 배포일로 변경
                queue.addLast(count);
                lastDate = deploymentDate[i];

                // 마지막 배포될 때 본인도 배포되므로 1로 초기화
                count = 1;
            }
        }

        // 마지막 배포일은 queue에 add 되지 않기 때문에 마지막에 count를 한 번 더 add
        queue.addLast(count);

        return queue.stream().mapToInt(Integer::intValue).toArray();
    }
}
