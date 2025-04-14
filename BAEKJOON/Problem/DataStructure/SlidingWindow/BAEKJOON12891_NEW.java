package BAEKJOON.Problem.DataStructure.SlidingWindow;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.StringTokenizer;

public class BAEKJOON12891_NEW {

    //추가 메서드에서도 사용할 수 있도록 중요한 변수를 전역 변수로 선언
    static int[] checkArr = new int[4];  // 부분 문자열에 포함되어야 할 최소 개수
    static int[] myArr = new int[4];    // 현재 문자열에 포함된 개수
    static int check = 0;   // 최소 개수를 만족하는지 체크

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // S, P의 길이 각각 입력받기
        StringTokenizer st = new StringTokenizer(br.readLine());
        int lengthS = Integer.parseInt(st.nextToken());
        int lengthP = Integer.parseInt(st.nextToken());

        // DNA 문자열 받아 문자 배열로 변환하기
        char[] S = br.readLine().toCharArray();

        // 부분 문자열에 포함되어야 할 최소 개수
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            checkArr[i] = Integer.parseInt(st.nextToken());

            // 만약에 최소가 0이면 들어가든 말든 0이므로 최소 조건 만족
            if (checkArr[i] == 0) {
                check++;
            }
        }

        // 비밀번호의 종류의 수를 담을 변수
        int result = 0;
        
        // 첫 부분 문자열은 P의 크기만큼 돌아야 함.
        for (int i = 0; i < lengthP; i++) {
            Add(S[i]);
        }

        if (check == 4) {
            result++;
        }

        // 처음 부분 문자열 다음부터는 빠지는 문자열, 더해지는 문자열만 메서드 쓰면 됨
        for (int i = lengthP; i < lengthS; i++) {
            int j = i - lengthP;

            Add(S[i]);  // 새롭게 추가되는 인덱스
            Remove(S[j]);   // 새롭게 추가되면서 삭제되는 인덱스

            if (check == 4) {
                result++;
            }
        }

        System.out.println(result);

    }

    // 새로 들어오는 변수 더하기
    public static void Add(char A) {
        // 들어온 문자를 카운팅해서
        // check를 증가시켜 4가 되는지 체크해야 함.
        switch (A) {
            case 'A':
                myArr[0]++; // A
                if (myArr[0] == checkArr[0]) {
                    check++;
                }
                break;
            case 'C':
                myArr[1]++; // C
                if (myArr[1] == checkArr[1]) {
                    check++;
                }
                break;
            case 'G':
                myArr[2]++; // 2
                if (myArr[2] == checkArr[2]) {
                    check++;
                }
                break;
            case 'T':
                myArr[3]++;
                if (myArr[3] == checkArr[3]) {
                    check++;
                }
                break;
        }
    }

    // 삭제되는 변수 빼기
    public static void Remove(char A) {
        switch(A) {
            case 'A':
                // 최소 개수랑 동일하면 빠지면 만족하지 않음으로 check - 1 해야함.
                if (myArr[0] == checkArr[0]) {
                    check--;
                }
                myArr[0]--; // A
                break;
            case 'C':
                // 최소 개수랑 동일하면 빠지면 만족하지 않음으로 check - 1 해야함.
                if (myArr[1] == checkArr[1]) {
                    check--;
                }
                myArr[1]--; // C
                break;
            case 'G':
                // 최소 개수랑 동일하면 빠지면 만족하지 않음으로 check - 1 해야함.
                if (myArr[2] == checkArr[2]) {
                    check--;
                }
                myArr[2]--; // G
                break;
            case 'T':
                // 최소 개수랑 동일하면 빠지면 만족하지 않음으로 check - 1 해야함.
                if (myArr[3] == checkArr[3]) {
                    check--;
                }
                myArr[3]--; // T
                break;
        }
    }
}
