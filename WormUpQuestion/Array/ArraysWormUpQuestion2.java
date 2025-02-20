package WormUpQuestion.Array;

/*
 * 몸풀기 문제 2
 * 배열 제어하기
 * 
 * 권장 시간 : 10분
 * 권장 시간 복잡도 : O(NlogN)
 * 
 * 정수 배열을 하나 받습니다.
 * 배열의 중복값을 제거하고 배열 데이터를 내림차순으로 정렬해서 반환하는 solution() 함수를 구현하세요.
 * 
 * 제약 조건
 * 1. 배열 길이는 2 이상 1,000 이하
 * 2. 각 배열의 데이터 값은 -100,000 이상 100,000 이하
 * 
 * 입출력 예시 (입력 / 출력)
 * [4, 2, 2, 1, 3, 4]       /   [4, 3, 2, 1]
 * [2, 1, 1, 3, 2, 5, 4]    /   [5, 4, 3, 2, 1]
 */

import java.util.Arrays;
import java.util.Collections;

public class ArraysWormUpQuestion2 {
    public static void main(String[] args) {
        int[] input1 = {4, 2, 2, 1, 3, 4};
        int[] input2 = {2, 1, 1, 3, 2, 5, 4};

        int[] output1 = solution(input1);
        int[] output2 = solution(input2);

        System.out.println(Arrays.toString(input1) + " -> " + Arrays.toString(output1));
        System.out.println(Arrays.toString(input2) + " -> " + Arrays.toString(output2));
    }

    public static int[] solution(int[] array) {
        // stream 사용을 위해 Integer 배열 result 선언하기
        // Integer 배열 result를 stream을 사용해 중복값 제거하기
        
        /*
         * stream 설명
         * Arrays 클래스의 stream() 메서드로 array를 stream으로 변환
         * stream의 프리미티브 타입인 IntStream의 데이터를 boxed() 메서드를 통해 레퍼런스 타입인 Integer로 변환
         * distinct() 메서드로 중복 제거
         * toArray(Integer[]::new)로 Integer형 배열로 중복 제거된 데이터 반환
         */
        Integer[] result = Arrays.stream(array).boxed().distinct().toArray(Integer[]::new);

        // Integer 배열을 내림차순 정렬하기
        // Collections 클래스의 reverseOrder() 메서드로 내림차순 정렬
        // Arrays 클래스의 sort() 메서드는 기본값이 오름차순 정렬
        Arrays.sort(result, Collections.reverseOrder());

        // Integer 배열을 int 배열로 형변환하여 변환하기
        return Arrays.stream(result).mapToInt(Integer::intValue).toArray();
    }
}