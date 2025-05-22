package _18_Overloading;

public class Overloading {
    public static int getPower(int number) {
        return number * number;
    }

    public static int getPower(double doubleNum) { // 자료형 무조건 달라야함 / 이름은 같아도 됨
        int number = (int) doubleNum;
        return number * number;
    }

    public static void main(String args) {
        // 메소드 오버로딩
        // 같은 이름의 메소드가 여러개 선언
        // 매개변수(파라미터)의 타입이 달라야한다 또는 갯수가 달라야한다.
        // 리턴 자료형은 같아야한다
    }

    public static int getPower(String strNum) {
        int number = Integer.parseInt(strNum);
        return number * number;
    }

    //getPowerExp 넣기


//    public static String printInfo(String name) {
//        name = "00";
//    }






    public static void main(String[] args) {
        // 메소드 오버로딩
        // 같은 이름의 메소드가 여러개 선언
        // 매개변수(파라미터)의 타입이 달라야한다 또는 갯수가 달라야한다.

        System.out.println(getPower(3));
        System.out.println(getPower(2.3));
        System.out.println(getPower("4"));

//        System.out.println(getPower(2,4));

        //문제
        //메소드 이름 printInfo()
        //문자열 이름만 전달 -> 이름을 출력
        //문자열 이름, 정수 나이 전달 -> 이름 나이 출력
        //문자열 이름, 정수 나이, 문자열 이메일 -> 이름 나이 이메일 출력


        //메소드 이름 add() -> void
        //int 와 int 덧셈
        //double과 double 덧셈
        //문자열숫자와 문자열숫자 덧셈
        //void
    }
}


//oop
//overloading / overriding
