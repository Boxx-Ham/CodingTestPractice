package PROGRAMMERS.Concept.QueueConcept;

/*
 * 큐
 * 1. 큐의 개념
 */

import java.util.ArrayDeque;

public class Deque {
    public static void main(String[] args) {
        /*
         * 큐 구현하기
         * 덱을 큐처럼 활용하기
         * 
         * 덱(DEQUE) : Double Ended QUEue의 줄임말
         * 말 그대로 양 끝에서 삽입이나 삭제할 수 있는 큐를 구현한 것
         * 양 끝에서 삽입이나 삭제를 할 수 있다는 특징 때문에 큐를 구현할 때는 덱을 사용하는 것도 좋음
         */

        ArrayDeque<Integer> queue = new ArrayDeque<>();

        // 큐에 데이터 추가
        queue.addLast(1);
        queue.addLast(2);
        queue.addLast(3);

        System.out.println(queue);

        // 큐의 맨 앞 데이터를 제거하면서 반환
        int first = queue.pollFirst();

        System.out.println(first);

        // 큐에 데이터 추가
        queue.addLast(4);
        queue.addLast(5);
        
        System.out.println(queue);

        // 큐의 맨 앞 데이터를 제거하면서 반환
        first = queue.pollFirst();

        System.out.println(first);
    }
}
