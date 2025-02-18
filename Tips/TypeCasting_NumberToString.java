package Tips;

/*
 * 자바에서의 형 변환
 * 형 변환은 자주 사용하는 기술
 */

public class TypeCasting_NumberToString {
    public static void main(String[] args) {
        // 숫자형 (short, int, long, float, double) -> String형
        short s = 1234;
        String s1 = String.valueOf(s);
        String s2 = Short.toString(s);
        System.out.println("String 클래스의 valueOf 메서드 : " + s1);
        System.out.println("Short 클래스의 toString 메서드 : " + s2);

        int i = 1234;
        String i1 = String.valueOf(i);
        String i2 = Integer.toString(i);
        System.out.println("String 클래스의 valueOf 메서드 : " + i1);
        System.out.println("Integer 클래스의 toString 메서드 : " + i2);

        long l = 1234;
        String l1 = String.valueOf(l);
        String l2 = Long.toString(l);
        System.out.println("String 클래스의 valueOf 메서드 : " + l1);
        System.out.println("Long 클래스의 toString 메서드 : " + l2);

        float f = (float) 1.23;
        String f1 = String.valueOf(f);
        String f2 = Float.toString(f);
        System.out.println("String 클래스의 valueOf 메서드 : " + f1);
        System.out.println("Float 클래스의 toString 메서드 : " + f2);

        double d = 1.23;
        String d1 = String.valueOf(d);
        String d2 = Double.toString(d);
        System.out.println("String 클래스의 valueOf 메서드 : " + d1);
        System.out.println("Double 클래스의 toString 메서드 : " + d2);
    }
}
