package PROGRAMMERS.Concept.EssentialSyntaxForCodingTest.CollectionFramework;

/*
 * 코딩 테스트 필수 문법
 * 2. 컬렉션 프레임워크
 * 1) 배열
 */

import java.util.Arrays;    // Arrays 클래스의 toString() 메서드를 사용해 배열 요소 쉽게 출력 가능

public class Array {
    public static void main(String[] args) {
        /*
         * 배열
         * 
         * 기초 자료형
         * 저장할 데이터의 개수가 정해져 있을 때 사용하기 유용
         * 
         * 생성 이후에는 배열 크기 변경 불가
         * 따라서 배열 생성 후 새 데이터를 삽입하거나 삭제하는 것은 할 수 없고, 기존 데이터의 변경만 할 수 있음
         * 인덱스를 이용한 배열 요소에 대한 접근, 변경의 시간 복잡도 : O(1)
         */

        int[] array = {1, 2, 3, 4, 5};
        int[] array2 = new int[]{1, 3, 5, 7, 9};
        int[] array3 = new int[5];

        array3[0] = 0;
        array3[1] = 2;
        array3[2] = 4;
        array3[3] = 6;
        array3[4] = 8;

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array3));


        // 배열의 인덱스
        int[] myArray = {1, 4, 2, 5, 3};

        // 2번째 값을 7로 변경
        myArray[1] = 7;
        System.out.println(Arrays.toString(myArray));

        // 1번째 값에 접근 및 출력
        System.out.println(myArray[0]);

        // 5번째 값을 3번째 값으로 변경
        myArray[4] = myArray[2];
        System.out.println(Arrays.toString(myArray));
    }
}
