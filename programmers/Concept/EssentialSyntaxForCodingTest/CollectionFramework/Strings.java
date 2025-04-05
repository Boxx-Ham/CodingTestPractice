package PROGRAMMERS.Concept.EssentialSyntaxForCodingTest.CollectionFramework;

/*
 * 코딩 테스트 필수 문법
 * 2. 컬렉션 프레임워크
 * 4) 문자열
 */

public class Strings {
    public static void main(String[] args) {
        /*
         * 문자열
         * 
         * 문자들을 배열의 형태로 구성한 이뮤터블 객체
         * 이뮤터블 객체는 값을 변경할 수 없는 객체를 의미하고 시간 복잡도 관점에서 사용 시 주의해야 함
         * 문자열은 큰따옴표로 감싸 사용
         * 
         * 문자열은 이뮤터블 객체이므로 추가, 삭제 시 기존 객체를 수정하는 것이 아니라 새로운 객체 반환
         * 
         * 문자열 수정을 위해서는 replace() 메서드 사용
         * replace(A, B) -> 첫 번째 인수에 찾을 문자열을, 두 번째 인수에 변경할 문자열을 넣어 사용
         */

        String string = "Hello, World!";

        System.out.println(string);

        // 문자열 추가, 삭제
        String string1 = "He";
        string1 += "llo";   // 기존 string이 참조하는 "He"와 "llo"를 합쳐 새로운 문자열을 만들고 string은 그 문자열 참조

        System.out.println(string1); 

        // 문자열 수정
        string1 = string1.replace("l", "");   // "l"을 모두 삭제

        System.out.println(string1);
    }
}
