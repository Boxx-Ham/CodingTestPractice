package PROGRAMMERS.Concept.Stack;

/*
 * 스택
 * 2. Stack 클래스 사용해보기
 */

import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        /*
         * Stack 클래스 사용해보기
         * 
         * 스택은 최근에 삽입한 데이터를 대상으로 뭔가 연산해야 할 때 사용하면 좋음
         */

        // 스택 객체 생성
        Stack<Integer> stack = new Stack<>();

        // 스택에 데이터 푸시
        stack.push(1);
        stack.push(3);

        // 스택이 비어있는지 확인
        System.out.println(stack.isEmpty());

        // 스택에서 팝(pop : 데이터를 빼내서 반환)
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());

        stack.push(6);
        stack.push(5);

        // 스택에 가장 최근에 푸시한 값(peek : 데이터를 빼내지 않고 반환)
        System.out.println(stack.peek());
        System.out.println(stack.pop());

        // 스택에 들어 있는 데이터의 개수(size)
        System.out.println(stack.size());
        
        stack.push(7);
        stack.push(4);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.size());
    }    
}
