package _19_VariableScope;

public class VariableScope {
    public static void methodA() {
        String str = "abc";

    }


    public static void main(String[] args) {
        String name = "00"; // 지역변수 - 중괄호 내에서만 사용

        for (int i = 0; i < 10 ; i++) {
            System.out.println(i);
        }
//        System.out.println(i);
    }
}
