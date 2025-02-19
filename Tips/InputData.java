package Tips;

/*
 * Java 입력 처리 클래스
 * 1. BufferedReader + InputStreamReader -> IOException과 함께 사용해야 함
 * 이 두 개의 클래스를 함께 사용하면 빠르고 효율적인 입력 처리 가능
 * 
 * 2. StringTokenizer 
 * 문자열을 특정 구분자를 기준으로 쪼개는 클래스
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class InputData {
    public static void main(String[] args) throws IOException {
        /*
         * InputStreamReader
         * 바이트 스트림(InputStream)을 문자 스트림(Reader)으로 변환
         * e.g., System.in은 바이트 스트림이므로, 이를 문자 스트림으로 변환하기 위해 InputStreamReader 사용
         */
        InputStreamReader isr = new InputStreamReader(System.in);

        /*
         * BufferedReader
         * 입력을 버퍼(Buffer; 임시 저장 공간)에 담아 한 번에 읽을 수 있도록 도와주는 클래스
         * BufferedReader를 사용하면 한 줄씩 읽기 가능하고 입력 속도가 더 빨라짐
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        System.out.println("입력값 : " + input);

        // 입력 스트림 닫기 (필수는 아님. 하지만 권장됨)
        br.close();

        /*
         * StringTokenizer
         * 문자열을 특정 구분자를 기준으로 쪼개는 클래스
         */

        String data = "10 20 30 40 50";

        // 공백(" ")을 기준으로 문자열 나누기
        StringTokenizer st = new StringTokenizer(data, " ");

        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken()); // 하나씩 출력
        }
    }
}