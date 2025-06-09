package _35_Lambda;

public class CalculatorMain {
    public static int operate(int a, int b, Calculator c) {
        return c.calculate(a, b);
    }

    public static void main(String[] args) {
        Calculator add = (x, y) -> x + y; // add라는 이름으로 다시 재정의
        Calculator sub = (x, y) -> x - y;
        Calculator mul = (x, y) -> x * y;
        Calculator div = (x, y) -> x / y;

        // 익명클래스를 사용하는 이유 - 메소드가 여러개일때

        System.out.println("2 + 2 = " + operate(2,2,add)); // add - c 값
        // -> (2, 2) -> 2 + 2;
        System.out.println("2 - 3 = " + operate(2,3,sub));
        System.out.println("2 * 3 = " + operate(2,3,mul));
        System.out.println("2 / 3 = " + operate(2,3,div));

        Calculator div3 = (x, y) -> { // 여러줄 구현 가능
             if (y == 0) {
                 System.out.println("0으로 나눌 수 없습니다.");
                 return 0;
             }
            return x/y;
        };
        System.out.println("2 / 0 = " + operate(2,0,div3));


    }
}
