package PROGRAMMERS.Concept.Array;

/*
 * 배열
 * 1. 배열 개념
 */

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        // 1. 배열 선언
        int[] arr1 = {0, 0, 0, 0, 0, 0};
        int[] arr2 = new int[6];

        System.out.println(Arrays.toString(arr1) + " / " + Arrays.toString(arr2));

        // 2. 배열과 차원
        // 2차원 배열 생성
        int[][] arr3 = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(arr3[1][2]); // 1행 2열의 저장된 값 출력

        arr3[1][2] = 7;
        System.out.println(arr3[1][2]);
    }
}
