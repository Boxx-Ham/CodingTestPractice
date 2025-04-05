package PROGRAMMERS.Concept.EssentialSyntaxForCodingTest.PrimitiveTypesAndReferenceTypes;

/*
 * 코딩 테스트 필수 문법
 * 1. 프리미티브 타입과 레퍼런스 타입
 * 1) 정수형
 */

public class IntegerType {
    public static void main(String[] args) {
        /*
         * 정수형
         * 양과 음의 정수, 0 포함
         * 더하기, 빼기, 곱하기, 나누기와 같은 사칙 연산 외 많은 연산 가능
         */

        // 정수형 변수 선언
        int a = 13;
        int b = 4;

        // 정수형 산술 연산
        System.out.println(a + b);   // 더하기 : 17
        System.out.println(a - b);   // 빼기 : 9
        System.out.println(a * b);   // 곱하기 : 52
        System.out.println(a / b);   // 나누기 (소수점 버림) : 3
        System.out.println(a % b);   // 모듈러 연산 (소수점 버림) : 1

        // 정수형 비교 연산
        System.out.println(a == b);   // 같은 값인지 비교 : false
        System.out.println(a != b);   // 같지 않은 값인지 비교 : true
        System.out.println(a > b);   // 왼쪽 값이 더 큰지 비교 : true
        System.out.println(a < b);   // 왼쪽 값이 더 작은지 비교 : false
        System.out.println(a >= b);   // 왼쪽 값이 더 크거나 같은지 비교 : true
        System.out.println(a <= b);   // 왼쪽 값이 더 작거나 같은지 비교 : false

        // 정수형 비트 연산
        System.out.println(a & b);   // AND : 4
        System.out.println(a | b);   // OR : 13
        System.out.println(a ^ b);   // XOR : 9
        System.out.println(~a);   // NOT : -14
        System.out.println(a << 2);   // 왼쪽 시프트 (a에 2^2 곱한 것과 동일) : 52
        System.out.println(a >> 1);   // 오른족 시프트 (a에 2^1 나눈 것과 동일) : 6
    }   
}
