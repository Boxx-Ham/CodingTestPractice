package PROGRAMMERS.Concept.EssentialSyntaxForCodingTest.PrimitiveTypesAndReferenceTypes;

/*
 * 코딩 테스트 필수 문법
 * 1. 프리미티브 타입과 레퍼런스 타입
 * 3) 레퍼런스 타입
 */

import java.util.*;
public class ReferenceType {
    public static void main(String[] args) {
        // 프리미티브 타입 사용법
        int i = 0;
        long[] longs = new long[10];
        float f = 10.5f;
        double d = 10 / 3.0;

        System.out.println(i);
        System.out.println(Arrays.toString(longs));
        System.out.println(f);
        System.out.println(d);

        // 레퍼런스 타입 사용법 (꼭 필요한 경우가 아니면 권장 X)
        Integer I = 0;
        Long[] Longs = new Long[10];
        Float F = 10.5f;
        Double D = 10 / 3.0;

        System.out.println(I);
        System.out.println(Arrays.toString(Longs));
        System.out.println(F);
        System.out.println(D);

        // 레퍼런스 타입을 쓰는 경우 : 컬렉션 프레임워크에서 사용됨
        List<Integer> arrayList = new ArrayList<>();
        Stack<Long> stack = new Stack<>();
        Queue<Float> queue = new ArrayDeque<>();
        Deque<Double> arrayDeque = new ArrayDeque<>();

        System.out.println(arrayList.toString());
        System.out.println(stack.toString());
        System.out.println(queue.toString());
        System.out.println(arrayDeque.toString());
    }
}
