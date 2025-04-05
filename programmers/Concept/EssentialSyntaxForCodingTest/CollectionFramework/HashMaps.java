package PROGRAMMERS.Concept.EssentialSyntaxForCodingTest.CollectionFramework;

/*
 * 코딩 테스트 필수 문법
 * 2. 컬렉션 프레임워크
 * 3) 해시맵
 */

import java.util.Map;
import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {
        /*
         * 해시맵
         * 
         * 키(key)와 값(value) 쌍을 저장하는 해시 테이블로 구현됨
         * 키를 사용하여 값을 검색하는 자료구조
         */

        // 해시맵 초기화
        Map<String, Integer> map = new HashMap<>(); // 키는 문자열로, 값은 32비트 정수형을 저장하는 해시맵

        // 해시맵의 데이터 삽입과 출력
        map.put("apple", 1);
        map.put("banana", 2);
        map.put("orange", 3);

        System.out.println(map);

        // 해시맵의 데이터 검색
        String key = "apple";

        if(map.containsKey(key)) {
            int value = map.get(key);
            System.out.println(key + " : " + value);
        } else {
            System.out.println(key + "는 해시맵에 없습니다.");
        }

        // 해시맵 수정
        map.put("banana", 4);
        System.out.println(map);

        // 해시맵 삭제
        map.remove("orange");
        System.out.println(map);
    }
}
