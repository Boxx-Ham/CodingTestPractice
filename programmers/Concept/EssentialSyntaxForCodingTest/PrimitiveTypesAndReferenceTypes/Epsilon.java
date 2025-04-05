package PROGRAMMERS.Concept.EssentialSyntaxForCodingTest.PrimitiveTypesAndReferenceTypes;

/*
 * 코딩 테스트 필수 문법
 * 1. 프리미티브 타입과 레퍼런스 타입
 * 2) 부동소수형
 */

public class Epsilon {
    public static void main(String[] args) {
        /*
         * 앱실론 예시
         * 
         * 부동소수형 데이터를 활용하는 문제는 오차 허용 범위를 언급하는 경우가 많음
         * 문제를 분석할 때 꼭 이 부분 체크해야 함
         * 오차 허용 범위를 epsilon으로 넣으면 됨
         */
        
        double epsilon = 1E-5;  // float 타입 또는 간단한 비교에는 1E-5가 앱실론으로 쓰임

        // 앱실론 출력
        System.out.println(epsilon);    // 1.0E-5

        // 부동소수점 수 오차 검사
        double a = 0.1 + 0.2;
        double b = 0.3;
        System.out.println(a - b);  // 0을 기대하지만 5.551115123125783E-17 임

        if (a == b) {
            System.out.println("a와 b는 같은 값입니다.");
        } else {
            System.out.println("a와 b는 다른 값입니다.");   // 이 코드 출력됨
        }

        if (Math.abs(a - b) < epsilon) {    // 이렇게 비교해야 a와 b가 같다고 인식함
            System.out.println("a와 b는 같은 값입니다.");   // 이 코드 출력
        } else {
            System.out.println("a와 b는 다른 값입니다.");
        }
    }   
}
