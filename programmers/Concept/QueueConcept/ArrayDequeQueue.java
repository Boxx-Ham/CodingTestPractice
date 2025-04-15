package PROGRAMMERS.Concept.QueueConcept;

/*
 * 큐
 * 1. 큐의 개념
 */

import java.util.ArrayDeque;
import java.util.Queue;

public class ArrayDequeQueue {
    public static void main(String[] args) {
        /*
         * 큐 구현하기
         * Queue 인터페이스 사용하기
         * 
         * 일반적인 코딩 테스트에서는 LinkedList 보다는 ArrayDeque를 더 많이 사용
         */

        // 큐를 구현한 ArrayDeque 객체 생성
        Queue<Integer> queue = new ArrayDeque<>();

        // 큐에 데이터 추가
        queue.add(1);
        queue.add(2);
        queue.add(3);

        System.out.println(queue);

        // 큐의 맨 앞 데이터를 제거하면서 반환
        int first = queue.poll();
        System.out.println(first);


        // 큐에 데이터 추가
        queue.add(4);
        queue.add(5);

        // 큐의 맨 앞 데이터를 제거하면서 반환
        first = queue.poll();
        System.out.println(first);
    }
}