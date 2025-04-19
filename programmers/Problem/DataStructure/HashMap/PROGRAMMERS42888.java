package PROGRAMMERS.Problem.DataStructure.HashMap;

/*
 * 문제 21 : 오픈채팅방
 * 권장 시간 : 60분
 * 권장 시간 복잡도 : O(N)
 * 프로그래머스 42888번 (https://school.programmers.co.kr/learn/courses/30/lessons/42888)
 */

import java.util.Arrays;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class PROGRAMMERS42888 {
    public static void main(String[] args) {
        String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan"};
        
        String[] result = solution(record);

        System.out.println(Arrays.toString(record) + " -> " + Arrays.toString(result));
    }

    static String[] solution(String[] record) {
        // 1. uid, name 담을 HashMap, 출력 메시지 담을 ArrayList 선언
        Map<String, String> userMap = new HashMap<>();
        List<String> msgList = new ArrayList<>();
        
        // 2. 명령어 배열을 돌면서 Enter, Change 일 때만 userMap에 uid, name 담기
        for (String str : record) {
            // 2-1. 명령어를 세 부분으로 나눠 배열로 저장
            String[] cmd = str.split(" ");  // 0 : 명령, 1 : uid, 2 : name

            // 2-2. Enter, Change 일 때만 저장 (Enter, Change는 cmd의 길이가 3)
            if (cmd.length == 3) {
                userMap.put(cmd[1], cmd[2]);
            }
        }
        
        // 3. 최종 닉네임을 메시지와 함계 만들어서 msgList에 담기
        for (String str : record) {
            // 3-1. 명령어를 세 부분으로 나눠 배열에 저장
            String[] cmd = str.split(" ");

            // 3-2. Enter, Leave 일 경우의 메시지를 변수로 미리 지정
            String enterMsg = "님이 들어왔습니다.";
            String leaveMsg = "님이 나갔습니다.";

            // 3-3. Enter, Leave의 경우에 각각 메시지에 담기
            if (cmd[0].equals("Enter")) {
                msgList.add(userMap.get(cmd[1]) + enterMsg);
            } else if (cmd[0].equals("Leave")) {
                msgList.add(userMap.get(cmd[1]) + leaveMsg);
            }
        }

        // 4. List를 Array로 변환하여 반환
        return msgList.toArray(new String[0]);  // new String[0]으로 타입 String[]로 선언
    }
}
