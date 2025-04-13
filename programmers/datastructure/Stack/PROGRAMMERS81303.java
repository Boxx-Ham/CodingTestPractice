package PROGRAMMERS.DataStructure.Stack;

/*
 * 문제 14 : 표 편집
 * 권장 시간 : 80분
 * 권장 시간 복잡도 : O(N)
 * 프로그래머스 81303번 (https://school.programmers.co.kr/learn/courses/30/lessons/81303)
 */

import java.util.Stack;

public class PROGRAMMERS81303 {
    // Node
    static class Node {
        Node prev;
        Node next;
        boolean deleted;
    }

    static Node[] NodeArr = new Node[1000000];    // n의 최대 크기 : 1,000,000

    public static void main(String[] args) {
        int n = 8;
        int k = 2;
        String[] cmd1 = {"D 2", "C", "U 3", "C", "D 4", "C", "U 2", "Z", "Z"};
        String[] cmd2 = {"D 2", "C", "U 3", "C", "D 4", "C", "U 2", "Z", "Z", "U 1", "C"};

        String result1 = solution(n, k, cmd1);
        String result2 = solution(n, k, cmd2);

        System.out.println(n + " / " + k + " / " + quotedArray(cmd1) + " -> " + result1);
        System.out.println(n + " / " + k + " / " + quotedArray(cmd2) + " -> " + result2);
    }

    static String quotedArray(String[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append("\"").append(arr[i]).append("\"");
            if (i != arr.length - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
    
    static String solution(int n, int k, String[] cmd) {
        // 1. 노드를 담을 배열과 삭제된 노드를 담을 Stack 생성
        for (int i = 0; i < n; i++) {
            NodeArr[i] = new Node();
        }
        for (int i = 1; i < n; i++) {
            NodeArr[i].prev = NodeArr[i -1];
            NodeArr[i - 1].next = NodeArr[i];
        }

        Stack<Node> deletedStack = new Stack<>();

        // 현재 가리키는 노드
        Node curr = NodeArr[k];

        // cmd 시작
        for (int i = 0; i < cmd.length; i++) {
            char c = cmd[i].charAt(0);

            // U
            if (c == 'U') {
                // 이동횟수 확인
                int m = Integer.parseInt(cmd[i].substring(2));

                for (int j = 0; j < m; j++) {
                    curr = curr.prev;
                }

            // D
            } else if (c == 'D') {
                // 이동횟수 확인
                int m = Integer.parseInt(cmd[i].substring(2));

                for (int j = 0; j < m; j++) {
                    curr = curr.next;
                }

            // C
            } else if (c == 'C') {
                // stack에 추가 및 deleted true 표시
                deletedStack.push(curr);
                curr.deleted = true;

                Node up = curr.prev;
                Node down = curr.next;

                if (up != null) {
                    up.next = down;
                }

                if (down != null) {
                    down.prev = up;
                    curr = down;

                // 맨 밑의 Node 삭제 시 밑으로 가는게 아니라 위로 curr 설정
                } else {
                    curr = up;
                }

            // Z
            } else {
                // 스택에서 뽑아와야 함
                Node restore = deletedStack.pop();

                Node up = restore.prev;
                Node down = restore.next;

                restore.deleted = false;

                if (up != null) {
                    up.next = restore;
                }
                if (down != null) {
                    down.prev = restore;
                }
            }
        }

        // 삭제된 행은 X, 삭제되지 않은 행은 0
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            if (NodeArr[i].deleted) {
                sb.append("X");
            } else {
                sb.append("O");
            }
        }

        return sb.toString();
    }
}