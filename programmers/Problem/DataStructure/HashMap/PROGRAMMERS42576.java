package PROGRAMMERS.Problem.DataStructure.HashMap;

/*
 * 문제 19 : 완주하지 못한 선수
 * 권장 시간 : 30분
 * 권장 시간 복잡도 : O(N)
 * 프로그래머스 42576번 (https://school.programmers.co.kr/learn/courses/30/lessons/42576)
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PROGRAMMERS42576 {
    public static void main(String[] args) {
        String[] participant1 = {"leo", "kiki", "eden"};
        String[] completion1 = {"eden", "kiki"};

        String[] participant2 = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion2 = {"josipa", "filipa", "marina", "nikola"};

        String[] participant3 = {"mislav", "stanko", "mislav", "ana"};
        String[] completion3 = {"stanko", "ana", "mislav"};

        String result1 = solution(participant1, completion1);
        String result2 = solution(participant2, completion2);
        String result3 = solution(participant3, completion3);

        System.out.println(Arrays.toString(participant1) + " / " + Arrays.toString(completion1) + " -> " + result1);
        System.out.println(Arrays.toString(participant2) + " / " + Arrays.toString(completion2) + " -> " + result2);
        System.out.println(Arrays.toString(participant3) + " / " + Arrays.toString(completion3) + " -> " + result3);
    }

    static String solution(String[] participant, String[] completion) {
        // 선수이름 - 완주여부를 담을 HashMap선언
        Map<String, Integer> hashMap = new HashMap<>();

        // 완주못한 선수이름을 담을 변수 선언
        String result = "";

        // 동명이인 체크 로직
        for (String name : participant) {
            // 참가자 이름이 hashMap에 이미 존재한다면 동명이인이므로 +1
            if (hashMap.containsKey(name)) {
                hashMap.put(name, hashMap.get(name) + 1);

            // 참가자 이름이 존재하지 않으면 1로 초기화
            } else {
                hashMap.put(name, 1);
            }
        }

        // 완주 여부 체크 로직
        for (String name : completion) {
            // 완주자 명단에 이름이 있으면 -1 해서 완주한 선수는 값이 0이 되도록 한다.
            if (hashMap.containsKey(name)) {
                hashMap.put(name, hashMap.get(name) - 1);
            }
        }

        // 완주하지 못한 선수 체크 로직
        // 값이 1인 키는 완주하지 못한 선수임
        // 참가자 명단에서 1로 초기화되었으나 완주자 체크 로직에서 -1을 받지 못했다는 것은
        // 완주자 명단에 없다는 소리
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue() == 1) {
                result = entry.getKey();
                break;  // 완주하지 못한 선수 찾으면 바로 아웃
            }
        }

        return result;
    }
}