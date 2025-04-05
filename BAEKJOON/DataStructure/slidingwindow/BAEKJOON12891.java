package BAEKJOON.DataStructure.SlidingWindow;

/*
 * 문제 009 : DNA 비밀번호
 * 시간 제한 2초 (연산횟수 200,000,000)
 * 난이도 : 실버 V
 * 백준 12891번 (https://www.acmicpc.net/problem/12891)
 */

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.StringTokenizer;

public class BAEKJOON12891 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        // S, P 길이 입력받기
        int lengthS = Integer.parseInt(st.nextToken());
        int lengthP = Integer.parseInt(st.nextToken());

        // DNA 문자열 S 입력받기
        String S = br.readLine();

        // int 배열 만들어서 {'A', 'C', 'G', 'T'}의 최소 개수 입력 받기
        // 인덱스 : A = 0, C = 1, G = 2, T = 3
        int[] passwordPattern = new int[4];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < 4; i++) {
            passwordPattern[i] = Integer.parseInt(st.nextToken());
        }

        // 만들 수 있는 비밀번호의 종류의 수 찾는 메서드 
        System.out.println(findDNAPassWord(S, lengthS, lengthP, passwordPattern));
    }

    public static int findDNAPassWord(String S, int lengthS, int lengthP, int[] passwordPattern) {
        // 바로 0이 반환될 수 있는 확인하는 로직
        int[] patternNum = new int[4];

        for (int i = 0; i < lengthS; i++) {
            if (S.charAt(i) == 'A') {
                patternNum[0]++;    // A
            } else if (S.charAt(i) == 'C') {
                patternNum[1]++;    // C
            } else if (S.charAt(i) == 'G') {
                patternNum[2]++;    // G
            } else {
                patternNum[3]++;    // T
            }
        }

        for (int i = 0; i < 4; i++) {
            if (patternNum[i] < passwordPattern[i]) return 0;
        }

        // 투 포인터를 사용해서 P 배열 만들어보기
        String[] P = new String[lengthS - lengthP + 1];
        int p1 = 0;
        int p2 = lengthP;
        int k = 0;
        int passwordCount = 0;

        while (p2 <= lengthS && k < P.length) {
            P[k] = S.substring(p1, p2);

            k++;
            p1++;
            p2++;
        }

        // 부분 문자열 안에 pattern의 최소 개수가 들어있는지 체크
        for (int i = 0; i < P.length; i++) {
            // patternNum을 다시 0으로 초기화해서 다시 재사용
            patternNum = new int[4];

            for (int j = 0; j < P[i].length(); j++) {
                if (P[i].charAt(j) == 'A') {
                    patternNum[0]++;    // A
                } else if (P[i].charAt(j) == 'C') {
                    patternNum[1]++;    // C
                } else if (P[i].charAt(j) == 'G') {
                    patternNum[2]++;    // G
                } else {
                    patternNum[3]++;    // T
                }
            }

            // 비밀번호의 최소 개수가 넘었는지 확인
            int check = 0;

            for (int l = 0; l < 4; l++) {
                if (patternNum[l] >= passwordPattern[l]) {
                    check++;
                }
            }

            // 모두 만족했으면 4가 될 테고 4가 되면 passwordCount를 증가시키면 됨
            if (check == 4) passwordCount++;
        }

        return passwordCount;
    }
}
