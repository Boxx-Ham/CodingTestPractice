package PROGRAMMERS.Concept.Hash;

/*
 * 해시
 * 1. 해시맵
 */

import java.util.HashMap;
import java.util.Map;

public class Hash {
    public static void main(String[] args) {
        /*
         * 해시맵 
         * HashMap<KeyType, ValueType>
         */

        // 해시맵 선언
        Map<String, Integer> hashMap = new HashMap<>();

        // hashMap에 데이터 추가
        hashMap.put("ABC", 10);
        hashMap.put("BBB", 20);
        hashMap.put("AAA", 30);
        hashMap.put("ABC", 15); // 동일 키의 값을 바꿈

        System.out.println(hashMap.isEmpty());  // 해시맵이 비어있는지. false
        System.out.println(hashMap.get("ABC")); // 키가 "ABC"인 맵의 value 값. 15
        System.out.println(hashMap.containsKey("ABC")); // 해시맵에 "ABC"인 키가 포함되어 있는지. true
        
        hashMap.remove("ABC");
        System.out.println(hashMap.size());

        hashMap.clear();
        System.out.println(hashMap.isEmpty());
    }
}
