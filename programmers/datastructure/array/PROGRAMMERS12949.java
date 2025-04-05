package PROGRAMMERS.DataStructure.Array;

/*
 * 문제 05 : 행렬의 곱셈
 * 권장 시간 : 40분
 * 권장 시간 복잡도 : O(N^3)
 * 프로그래머스 12949번 (https://school.programmers.co.kr/learn/courses/30/lessons/12949)
 */

import java.util.Arrays;

public class PROGRAMMERS12949 {
    public static void main(String[] args) {
        int[][] inputArr11 = {{1, 4}, {3, 2}, {4, 1}};
        int[][] inputArr12 = {{3, 3}, {3, 3}};
        int[][] inputArr21 = {{2, 3, 2}, {4, 2, 4}, {3, 1, 4}};
        int[][] inputArr22 = {{5, 4, 3}, {2, 4, 1}, {3, 1, 1}};

        int[][] outputArr1 = solution(inputArr11, inputArr12);
        int[][] outputArr2 = solution(inputArr21, inputArr22);

        System.out.println(arrayToString(inputArr11) + " / " + arrayToString(inputArr12) + " -> " + arrayToString(outputArr1));
        System.out.println(arrayToString(inputArr21) + " / " + arrayToString(inputArr22) + " -> " + arrayToString(outputArr2));
    }

    public static int[][] solution(int[][] arr1, int[][] arr2) {
        // 곱셈 행렬
        int[][] matrix = new int[arr1.length][arr2.length];

        // 곱셈 로직
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                for (int k = 0; k < arr1[0].length; k++) {
                    matrix[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

        return matrix;
    }

    public static String arrayToString(int[][] arr) {
        StringBuilder sb = new StringBuilder();

        sb.append("[");

        for (int i = 0; i < arr.length; i++) {
            sb.append(Arrays.toString(arr[i]));
            sb.append(", ");
        }
        sb.delete(sb.length() - 2, sb.length());

        sb.append("]");

        return sb.toString();
    }
}
