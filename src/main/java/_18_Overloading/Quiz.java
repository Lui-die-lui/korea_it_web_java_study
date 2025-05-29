package _18_Overloading;

public class Quiz {

    //문제
    //메소드 이름 printInfo()
    //문자열 이름만 전달 -> 이름을 출력
    //문자열 이름, 정수 나이 전달 -> 이름 나이 출력
    //문자열 이름, 정수 나이, 문자열 이메일 -> 이름 나이 이메일 출력

    public static void pirntInfo(String name) {
        System.out.println("이름은" + name);
    }

    public static void pirntInfo(String name, int age) {
        System.out.println("이름은" + name + "나이는" + age);
    }

    public static void pirntInfo(String name, int age, String email) {
        System.out.println("이름은" + name + "나이는" + age + "이메일은" + email);
    }


    //메소드 이름 add() -> void
    //int 와 int 덧셈
    //double과 double 덧셈
    //문자열숫자와 문자열숫자 덧셈
    //void

    public static void add(int a, int b) {
        System.out.println(a + "+"+ b +"="+(a+b));

    }

    public static void add(double a, double b){
        System.out.println(a + "+"+ b +"="+(a+b));
    }
//
    public static void add(String strnum1, String strnum2) {
        System.out.println(strnum1 + "+" + strnum2 + "=" + (Integer.parseInt(strnum1) + Integer.parseInt(strnum2)));
    }


    public static void main(String[] args) {

        pirntInfo("00");
        pirntInfo("00",99);

        add(2,1);
        add(1.2,3.4);
//        add(문자열);

    }
}
