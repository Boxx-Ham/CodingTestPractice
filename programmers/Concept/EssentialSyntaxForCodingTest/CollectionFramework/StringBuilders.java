package PROGRAMMERS.Concept.EssentialSyntaxForCodingTest.CollectionFramework;

/*
 * 코딩 테스트 필수 문법
 * 2. 컬렉션 프레임워크
 * 4) 문자열
 */

public class StringBuilders {
    public static void main(String[] args) {
        /*
         * StringBuilder
         * 
         * 뮤터블 객체이므로 값을 변경할 때 시간 복잡도 관점에서 훨씬 더 효율적임
         * String의 값을 변경하는 연산이 많을 때는 효율이 높은 StringBuilder 클래스 사용
         */

        // StringBuilder 객체 생성
        StringBuilder sb = new StringBuilder();

        // 문자열 삽입
        sb.append(10);
        sb.append("ABC");

        System.out.println(sb);
        sb.deleteCharAt(3); // 3번 인덱스 문자 삭제 : B
        System.out.println(sb);
        sb.insert(1, 2);    // 1번 인덱스 자리에 2라는 문자 추가
        System.out.println(sb);
    }
}
