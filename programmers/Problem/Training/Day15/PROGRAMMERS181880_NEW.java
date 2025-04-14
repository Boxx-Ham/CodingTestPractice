package PROGRAMMERS.Problem.Training.Day15;

import java.util.Arrays;

// 만약 num_list의 원소의 크기가 30 이상이고 범용적으로 처리해야 하는 경우

public class PROGRAMMERS181880_NEW {
    public static void main(String[] args) {
        int[] inputList = {12, 4, 15, 1, 14};

        int output = solution(inputList);

        System.out.println(Arrays.toString(inputList) + " -> " + output);
    }

    public static int solution(int[] num_list) {
        int count = 0;

        for(int i = 0; i < num_list.length; i++) {
            int num = num_list[i];

            // 나누기 연산
            while (num > 1) {
                num /= 2;
                count++;
            }
        }

        return count;
    }    
}
