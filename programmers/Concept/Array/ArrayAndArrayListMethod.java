package PROGRAMMERS.Concept.Array;

/*
 * 배열
 * 3. 유용한 배열, ArrayList 연관 메서드
 */

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayAndArrayListMethod {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 3};

        // 배열의 전체 데이터 개수를 가진 length 변수
        System.out.println(arr.length);

        // 배열의 모든 데이터를 정렬하는 Arrays 클래스의 sort() 메서드
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 4, 5, 3));
        
        // ArrayList의 전체 데이터 개수를 반환하는 size() 메서드
        System.out.println(list.size());

        // ArrayList에 저장된 데이터가 없는지 여부를 반환하는 isEmpty() 메서드
        System.out.println(list.isEmpty());

        // ArrayList의 모든 데이터를 정렬하는 Collections 클래스의 sort() 메서드
        Collections.sort(list);
        System.out.println(list);
    }
}
