package wormipquestion.array;

/*
 * 몸풀기 문제 1
 * 문제 01 : 배열 정렬하기
 * 
 * 권장 시간 : 10분
 * 권장 시간 복잡도 : O(NlogN)
 * 
 * 정수 배열을 정렬해서 반환하는 solution() 함수를 완성하세요.
 * 
 * 제약 조건
 * 1. 정수 배열의 길이는 2 이상 10^5 이하
 * 2. 정수 배열의 각 데이터 값은 -100,000 이상 100,000 이하
 * 
 * 입출력 예시(입력 / 출력)
 * [1, -5, 2, 4, 3]         /   [-5, 1, 2, 3, 4]
 * [2, 1, 1, 3, 2, 5, 4]    /   [1, 1, 2, 2, 3, 4, 5]
 * [6, 1, 7]                /   [1, 6, 7]
 */

import java.util.Arrays;

public class ArraysWormUpQuestion1 {
    public static void main(String[] args) {
        int[] input1 = {1, -5, 2, 4, 3};
        int[] input2 = {2, 1, 1, 3, 2, 5, 4};
        int[] input3 = {6, 1, 7};

        int[] output1 = solution(input1);
        int[] output2 = solution(input2);
        int[] output3 = solution(input3);

        System.out.println(Arrays.toString(input1) + " -> " + Arrays.toString(output1));
        System.out.println(Arrays.toString(input2) + " -> " + Arrays.toString(output2));
        System.out.println(Arrays.toString(input3) + " -> " + Arrays.toString(output3));
    } 

    public static int[] solution(int[] array) {
        // 입력받는 배열을 복사한다.
        int[] cloneArray = array.clone();

        // 복사한 배열을 정렬한다.
        Arrays.sort(cloneArray);

        // 정렬한 배열을 반환한다.
        return cloneArray;
    }
}
