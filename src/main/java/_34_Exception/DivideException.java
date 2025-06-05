package _34_Exception;

import java.util.Scanner;

public class DivideException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫 번째 수 : ");
        int a = scanner.nextInt();
        System.out.print("두 번째 수 : ");
        int b = scanner.nextInt();

        try {
            int result = a/b;
            System.out.println("결과 : " + result);
        }catch (ArithmeticException e){ // Exception 이 최상위 클래스
            System.out.println("0으로 나눌 수 없습니다." + e.getMessage()); // 보유한 에러 메세지를 출력해줌 = 없으면 정상 종료(finally)만 출력
        } finally {
            System.out.println("프로그램 정상 종료"); // 예외 처리
        }



    }
}
