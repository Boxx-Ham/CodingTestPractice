package PROGRAMMERS.Training.Day16;

/*
 * replace 메서드를 사용하면 되는데 그걸 몰라서 여러가지로 돌아왔다..
 */

public class PROGRAMMERS181874_NEW {
    public static void main(String[] args) {
        String inputString1 = "abstract algebra";
        String inputString2 = "PrOgRaMmErS";

        String outputString1 = solution(inputString1);
        String outputString2 = solution(inputString2);

        System.out.println(inputString1 + " -> " + outputString1);
        System.out.println(inputString2 + " -> " + outputString2);
    }

    public static String solution(String myString) {
        // 소문자로 변환 후 replace 메서드로 a를 A로 바꾸고 반환
        return myString.toLowerCase().replace("a", "A");
    }
}
