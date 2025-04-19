package PROGRAMMERS.Problem.DataStructure.HashMap;

/*
 * 문제 22 : 베스트앨범
 * 권장 시간 : 60분
 * 권장 시간 복잡도 : O(NlogN)
 * 프로그래머스 42579번 (https://school.programmers.co.kr/learn/courses/30/lessons/42579)
 */

import java.util.Arrays;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class PROGRAMMERS42579 {
    public static void main(String[] args) {
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};

        int[] result = solution(genres, plays);

        System.out.println(Arrays.toString(genres) + " / " + Arrays.toString(plays) + " -> " + Arrays.toString(result));
    }

    static int[] solution(String[] genres, int[] plays) {
        // 1. 장르별 곡 리스트와 장르별 재생횟수를 담을 HashMap 선언
        Map<String, ArrayList<int[]>> genresMap = new HashMap<>();
        Map<String, Integer> playsMap = new HashMap<>();

        // 2. 정답을 담을 ArrayList 선언
        List<Integer> answer = new ArrayList<>();

        // 3. HashMap에 장르별 곡 리스트와 장르별 재생횟수 담기
        for (int i = 0; i < genres.length; i++) {
            String genre = genres[i];
            int play = plays[i];

            // 3-1. ArrayList의 경우 초기화를 해주지 않으면 컴파일 오류 발생함
            if (!genresMap.containsKey(genre)) {
                genresMap.put(genre, new ArrayList<>());
            }

            // 3-2. 데이터 담기
            genresMap.get(genre).add(new int[] {i, play});
            playsMap.put(genre, playsMap.getOrDefault(playsMap.get(genre), 0) + play);
        }

        // 4. playsMap을 entry로 만들고 재생횟수를 기준으로 내림차순 정렬하기
        List<Map.Entry<String, Integer>> categorysEntry = new ArrayList<>(playsMap.entrySet());
        categorysEntry.sort((c1, c2) -> (c2.getValue().compareTo(c1.getValue())));

        // 5. 정렬한 category를 돌면서 answer에 2개씩 고유 번호 넣기
        for (Map.Entry<String, Integer> categorys : categorysEntry) {
            String category = categorys.getKey();

            // 5-1. genresMap에서 장르별 곡 리스트만 가져오기
            List<int[]> songs = new ArrayList<>(genresMap.get(category));

            // 5-2. 재생횟수를 기준으로 내림차순 정렬
            songs.sort((s1, s2) -> (s2[1] - s1[1]));    // 1번 인덱스가 재생횟수

            // 5-3. 하나의 장르에서 최대 2개만 가져올 수 있음
            for (int i = 0; i < Math.min(2, songs.size()); i++) {
                answer.add(songs.get(i)[0]);
            }
        }

        // 6. ArrayList -> Array 후 반환
        return answer.stream().mapToInt(i -> i).toArray();
    }
}
