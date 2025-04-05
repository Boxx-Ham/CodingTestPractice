package PROGRAMMERS.DataStructure.Array;

/*
 * 문제 07 : 방문 길이
 * 권장 시간 : 40분
 * 권장 시간 복잡도 : O(N)
 * 프로그래머스 49994번 (https://school.programmers.co.kr/learn/courses/30/lessons/49994)
 */

import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

public class PROGRAMMERS49994 {
    public static void main(String[] args) {
        String inputDirs1 = "ULURRDLLU";
        String inputDirs2 = "LULLLLLLU";

        int outputAnswer1 = solution(inputDirs1);
        int outputAnswer2 = solution(inputDirs2);

        System.out.println(inputDirs1 + " -> " + outputAnswer1);
        System.out.println(inputDirs2 + " -> " + outputAnswer2);
    }

    public static int solution(String dirs) {
        // 이동 좌표 및 x, y 초기 세팅
        Map<Character, int[]> locationMap = new HashMap<>();
        locationMap.put('U', new int[]{0, 1});
        locationMap.put('D', new int[]{0, -1});
        locationMap.put('R', new int[]{1, 0});
        locationMap.put('L', new int[]{-1, 0});
        int x1 = 0;
        int y1 = 0;

        // 움직인 경로 담을 중복 제거 위한 HashSet 선언
        Set<String> locationSet = new HashSet<>();

        // 경로 이동
        for (int i = 0; i < dirs.length(); i++) {
            int[] loc = locationMap.get(dirs.charAt(i));
            int x2 = x1 + loc[0];   // 기존 x 좌표에서 locationMap 의 x 좌표 더해줌
            int y2 = y1 + loc[1];   // 기존 y 좌표에서 locationMap 의 y 좌표 더해줌

            // -5, 5 넘어가면 무시
            if (x2 < -5 || x2 > 5 || y2 < -5 || y2 > 5) continue;

            // 안넘어가면 locationSet에 경로 넣고 x1, x2 업데이트
            locationSet.add("(" + x1 + ", " + y1 + ") -> (" + x2 + ", " + y2 + ")");    // (0, 0) -> (1, 0) 이랑
            locationSet.add("(" + x2 + ", " + y2 + ") -> (" + x1 + ", " + y1 + ")");    // (1, 0) -> (0, 0) 은 같은 경로
            x1 = x2;
            y1 = y2;
        }

        // 두 번씩 넣었으니 리턴할 때는 / 2 해서 반환
        return locationSet.size() / 2;
    }
}