package PROGRAMMERS.Concept.EssentialSyntaxForCodingTest.CollectionFramework;

/*
 * 코딩 테스트 필수 문법
 * 2. 컬렉션 프레임워크
 * 3) 해시맵
 */

import java.util.Map;
import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        // 해시맵 객체 생성
        Map<String, Integer> map = new HashMap<>();

        // 해시맵 값 삽입
        map.put("apple", 1);
        map.put("banana", 2);
        map.put("cherry", 3);

        // map에 없는 키로 설정
        String key = "orange";

        // 키가 해시맵에 있는지 확인
        if (map.containsKey(key)) {
            // 키가 해시맵에 있으면 해당 값 출력
            System.out.println(key + " : " + map.get(key));
        } else {
            // 키가 해시맵에 없으면 오류 메시지 출력
            System.out.println(key + "는 해시맵에 없습니다.");
        }
    }
}
