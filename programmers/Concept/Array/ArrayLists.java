package PROGRAMMERS.Concept.Array;

/*
 * 배열
 * 2. ArrayList 사용법
 */

import java.util.List;
import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        // ArrayList에 데이터 추가 : add
        list.add(1);
        list.add(2);
        list.add(3);

        // 다른 컬렉션의 데이터로부터 초기화
        List<Integer> list2 = new ArrayList<>(list);
        System.out.println(list2);

        // get() 메서드로 인덱스를 통해 데이터에 접근
        System.out.println(list.get(1));    // 1번 인덱스의 값 출력

        // remove() 메서드로 데이터 삭제
        list.remove(list.size() - 1);   // 끝에 있는 데이터 삭제
        System.out.println(list);
    }
}
