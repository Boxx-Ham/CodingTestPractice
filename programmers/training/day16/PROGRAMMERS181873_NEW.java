package programmers.training.day16;

/*
 * alp가 String이므로 toUpperCase 사용하단걸 잊고 있었음.
 */

public class PROGRAMMERS181873_NEW {
    public static void main(String[] args) {
        String inputString1 = "programmers";
        String inputString2 = "lowercase";

        String inputAlp1 = "p";
        String inputAlp2 = "x";

        String outputString1 = solution(inputString1, inputAlp1);
        String outputString2 = solution(inputString2, inputAlp2);

        System.out.println(inputString1 + " / " + inputAlp1 + " -> " + outputString1);
        System.out.println(inputString2 + " / " + inputAlp2 + " -> " + outputString2);
    }

    public static String solution(String my_string, String alp) {
        // replace로 alp를 toUpperCase로 대문자 변환 후 반환
        return my_string.replace(alp, alp.toUpperCase());
    }
}
