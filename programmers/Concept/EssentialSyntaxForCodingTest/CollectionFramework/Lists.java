package PROGRAMMERS.Concept.EssentialSyntaxForCodingTest.CollectionFramework;

/*
 * 코딩 테스트 필수 문법
 * 2. 컬렉션 프레임워크
 * 2) 리스트
 */

import java.util.List;
import java.util.ArrayList;

public class Lists {
    public static void main(String[] args) {
        /*
         * 리스트
         * 
         * 코딩 테스트 기준으로는 일반적으로 ArrayList 의미
         * 배열은 크기가 고정되어 있어 데이터 삭제, 삽입 불가능하지만 ArrayList는 가변 크기이므로 새 데이터의 삽입 혹은 기존 데이터의 삭제 가능
         * 
         * 새 데이터를 맨뒤에 추가할 때는 평균 시간 복잡도 : O(1)
         * 기존 데이터의 삭제 혹은 데이터를 중간에 삽입할 때의 시간 복잡도 : O(N)
         */

        // 리스트 객체 생성
        List<Integer> list = new ArrayList<>();

        // 값 추가
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(6);

        System.out.println(list.get(2));    // 2번 인덱스로 값에 접근
        System.out.println(list);
    }
}
