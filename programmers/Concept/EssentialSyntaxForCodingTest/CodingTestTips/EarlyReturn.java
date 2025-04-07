package PROGRAMMERS.Concept.EssentialSyntaxForCodingTest.CodingTestTips;

/*
 * 코딩 테스트 필수 문법
 * 4. 코딩 테스트 코드 구현 노하우
 * 1) 조기 반환
 */

public class EarlyReturn {
    public static void main(String[] args) {
        /*
         * 조기 반환
         * 
         * 코드 실행 과정이 함수 끝까지 도달하기 전에 반환하는 기법
         * 이 방식은 코드의 가독성을 높여줄 뿐 아니라 예외를 조금 더 깔끔하고 빠르게 처리 가능
         */

        System.out.println(totalPrice(4, 50));
    }

    static int totalPrice(int quantity, int price) {
        int total = quantity * price;

        if (total > 100) {
            return (int)(total * 0.9);
        }
        return total;
    }
}
