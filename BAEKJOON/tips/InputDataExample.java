package tips;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.StringTokenizer;

// BufferedReader + StringTokenizer 사용 예시
public class InputDataExample {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 한 줄 입력 받기
        System.out.print("한 줄 입력해보세요 : ");
        String input = br.readLine();

        // 공백을 기준으로 문자열 나누기
        StringTokenizer st = new StringTokenizer(input, " ");

        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
