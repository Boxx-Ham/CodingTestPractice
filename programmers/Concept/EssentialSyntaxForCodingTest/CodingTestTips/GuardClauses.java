package PROGRAMMERS.Concept.EssentialSyntaxForCodingTest.CodingTestTips;

/*
 * 코딩 테스트 필수 문법
 * 4. 코딩 테스트 코드 구현 노하우
 * 2) 보호 구문
 */

import java.util.List;
import java.util.ArrayList;

public class GuardClauses {
    public static void main(String[] args) {
        /*
         * 보호 구문
         * 
         * 본격적인 로직을 진행하기 전 예외 처리 코드를 추가하는 기법
         * e.g., 조건문을 이용하여 초기에 입력값이 유효한지 검사하고 그렇지 않으면 바로 함수 종료하는 보호 구문 사용 가능
         */

        int[] nums = {1, 2, 3, 4, 5};
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            numbers.add(nums[i]);
        }

        System.out.println(calculateAverage(numbers));
    }

    static double calculateAverage(List<Integer> numbers) {
        // null 이면 종료 (예외)
        if (numbers == null) {
            return 0;  
        }

        // 데이터가 없으면 종료 (예외)
        if (numbers.isEmpty()) {
            return 0;
        }

        // 예외 처리 후 기능 구현
        int total = numbers.stream().mapToInt(Integer::intValue).sum();
        return (double) total / numbers.size();
    }
}
