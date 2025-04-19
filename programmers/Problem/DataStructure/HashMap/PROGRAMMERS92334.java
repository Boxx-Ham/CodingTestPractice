package PROGRAMMERS.Problem.DataStructure.HashMap;

/*
 * 문제 23 : 신고 결과 받기
 * 권장 시간 : 80분
 * 권장 시간 복잡도 : O(N)
 * 프로그래머스 92334번 (https://school.programmers.co.kr/learn/courses/30/lessons/92334)
 */

import java.util.Arrays;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

public class PROGRAMMERS92334 {
    public static void main(String[] args) {
        String[] id_list1 = {"muzi", "frodo", "apeach", "neo"};
        String[] report1 = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
        int k1 = 2;
 
        String[] id_list2 = {"con", "ryan"};
        String[] report2 = {"ryan con", "ryan con", "ryan con", "ryan con"};
        int k2 = 3;
        
        int[] result1 = solution(id_list1, report1, k1);
        int[] result2 = solution(id_list2, report2, k2);

        System.out.println(Arrays.toString(id_list1) + " / " + Arrays.toString(report1) + " / " + k1 + " -> " + Arrays.toString(result1));
        System.out.println(Arrays.toString(id_list2) + " / " + Arrays.toString(report2) + " / " + k2 + " -> " + Arrays.toString(result2));
    }

    static int[] solution(String[] id_list, String[] report, int k) {
        // 1. 신고 당한 사람, 신고 메일 개수를 담을 Map 선언
        Map<String, HashSet<String>> reportedMap = new HashMap<>();
        Map<String, Integer> reportMailMap = new HashMap<>();

        // 2. 유저의 개수와 신고 메일의 개수를 담은 int 배열 생성
        int userNum = id_list.length;
        int[] answer = new int[userNum];

        // 3. report 배열을 활용해 신고 내용 reportedMap에 넣기
        for (String str : report) {
            String[] content = str.split(" ");  // 0 : 신고자, 1 : 피신고자
            String reporter = content[0];
            String reported = content[1];

            // 3-1. reportedMap에 안들어있으면 HashSet 선언
            if (!reportedMap.containsKey(reported)) {
                reportedMap.put(reported, new HashSet<>());
            }

            reportedMap.get(reported).add(reporter);
        }

        // 4. 신고한 사람의 수가 k를 넘어가면 reportMailMap의 신고한 사람의 메일 개수에 + 1
        for (Map.Entry<String, HashSet<String>> reportEntry : reportedMap.entrySet()) {
            Set<String> reporterSet = new HashSet<>(reportEntry.getValue());

            // 4-1. reporterSet의 개수가 k를 넘어가지 않으면 다음 entry로 넘어감
            if (reporterSet.size() < k) {
                continue;
            }

            // 4-2. 넘어가면 reportMailMap의 신고한 사람의 메일 개수 + 1
            for (String reporter : reporterSet) {
                reportMailMap.put(reporter, reportMailMap.getOrDefault(reporter, 0) + 1);
            }
        }

        // 5. answer에 신고 메일 개수 넣기
        for (int i = 0; i < userNum; i++) {
            if (!reportMailMap.containsKey(id_list[i])) {
                answer[i] = 0;
            } else {
                answer[i] = reportMailMap.get(id_list[i]);
            }
        }

        return answer;
    }
}
