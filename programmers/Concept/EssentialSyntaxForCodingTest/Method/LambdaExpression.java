package PROGRAMMERS.Concept.EssentialSyntaxForCodingTest.Method;

/*
 * 코딩 테스트 필수 문법
 * 3. 메서드
 * 1) 람다식
 */

import java.util.Arrays;

public class LambdaExpression {
    private static class Node {
        int dest;
        int cost;

        public Node(int dest, int cost) {
            this.dest = dest;
            this.cost = cost;
        }
    } 

    public static void main(String[] args) {
        /*
         * 람다식
         * 
         * 코드에서 딱 한 번 실행할 목적으로 사용하거나 함수 자체를 다른 함수의 인수로 전달할 때도 사용 가능
         * 람다식 사용 시 함수를 더 간결하게 표현할 수 있고 가독성이 좋아짐
         */

        // 람다식 정의와 사용
        Node[] nodes = new Node[5];
        nodes[0] = new Node(1, 10);
        nodes[1] = new Node(2, 20);
        nodes[2] = new Node(3, 15);
        nodes[3] = new Node(4, 5);
        nodes[4] = new Node(1, 25);

        Arrays.sort(nodes, (o1, o2) -> (Integer.compare(o1.cost, o2.cost)));

        System.out.print("[");
        for (int i = 0; i < nodes.length; i++) {
            System.out.print("[" + nodes[i].dest + ", " + nodes[i].cost + "]");
            System.out.print(", ");
        }
        System.out.println("]");
    }
}
