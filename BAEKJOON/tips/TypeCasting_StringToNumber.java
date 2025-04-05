package BAEKJOON.Tips;

/*
 * 자바에서의 형 변환
 * 형 변환은 자주 사용하는 기술
 */

public class TypeCasting_StringToNumber {
    public static void main(String[] args) {
        // String형 -> 숫자형 (short, int, long, float, double)
        String sNum = "1234";

        short s1 = Short.parseShort(sNum);
        short s2 = Short.valueOf(sNum);
        System.out.println("Short 클래스의 parseInt 메서드 : " + s1);
        System.out.println("Short 클래스의 valueOf 메서드 : " + s2);

        int i1 = Integer.parseInt(sNum);
        int i2 = Integer.valueOf(sNum);
        System.out.println("Integer 클래스의 parseInt 메서드 : " + i1);
        System.out.println("Integer 클래스의 valueOf 메서드 : " + i2);

        long l1 = Long.parseLong(sNum);
        long l2 = Long.valueOf(sNum);
        System.out.println("Long 클래스의 parseInt 메서드 : " + l1);
        System.out.println("Long 클래스의 valueOf 메서드 : " + l2);

        float f1 = Float.parseFloat(sNum);
        float f2 = Float.valueOf(sNum);
        System.out.println("Float 클래스의 parseInt 메서드 : " + f1);
        System.out.println("Float 클래스의 valueOf 메서드 : " + f2);

        double d1 = Double.parseDouble(sNum);
        double d2 = Double.valueOf(sNum);
        System.out.println("Double 클래스의 parseInt 메서드 : " + d1);
        System.out.println("Double 클래스의 valueOf 메서드 : " + d2);
    }
}
