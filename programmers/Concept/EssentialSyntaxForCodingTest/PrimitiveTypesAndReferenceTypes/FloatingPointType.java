package PROGRAMMERS.Concept.EssentialSyntaxForCodingTest.PrimitiveTypesAndReferenceTypes;

/*
 * 코딩 테스트 필수 문법
 * 1. 프리미티브 타입과 레퍼런스 타입
 * 2) 부동소수형
 */

public class FloatingPointType {
    public static void main(String[] args) {
        /*
         * 부동소수형
         * 소수를 저장할 때 사용
         */

        // 부동소수형 사칙 연산과 모듈러 연산
        System.out.println(2.5 + 3.7);   // 더하기 : 6.2
        System.out.println(7.9 - 4.2);   // 빼기 : 3.7
        System.out.println(1.5 * 4.8);   // 곱하기 : 7.199999999999999
        System.out.println(10.0 / 3.2);   // 나누기 : 3.125
        System.out.println(10.0 % 3.2);   // 모듈러 연산 : 0.39999999999999947 != 0.4

        // 앱실론을 포함한 연산에 주의하라
        /*
         * 10.0 % 3.2의 결과가 0.4가 아니라 0.39999999999999947 인 이유는 부동소수형 데이터를 이진법으로 표현하기 대문
         * 
         * 앱실론(epsilon) : 부동소수형 데이터를 표현하는 과정에서 오차가 발생하는 것
         * 코딩 테스트에서 부동소수형 데이터를 다룰 일이 생겼을 때 앱실론을 항상 생각해야 함
         */
    }
}
