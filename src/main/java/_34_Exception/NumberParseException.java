package _34_Exception;


import java.util.Scanner;

/*
* 사용자로부터 문자열 형태의 입력을 받습니다
* 입력된 문자열을 Integer.parseInt()를  사용하여 정수로 변환합니다.
* 변환된 숫자를 촐력합니다.
* 만약 변환하는 과정에서 입력값이 숫자가 아니라면 예외발생 -> 예외처리 후 "숫자가 아닌 값을 입력하셨습니다."
 */
public class NumberParseException {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 : ");
        String input = scanner.nextLine();

        try {
            int number = Integer.parseInt(input);
            System.out.println("입력한 숫자는 : " + number);
        } catch (NumberFormatException e) {
            System.out.println("숫자가 아닌 값을 입력하셨습니다.");
        } finally {
            System.out.println("프로그램 정상 종료");
        }

//
//        int i = Integer.parseInt("123");
//
//
//        try { // 예외가 뜨는 코드
//            int i = "";
//            System.out.println("결과 : " + i);
//        } catch (ArithmeticException e) { // Exception 이 최상위 클래스
//            System.out.println("숫자가 아닌 값을 입력하셨습니다." + e.getMessage()); // 보유한 에러 메세지를 출력해줌 = 없으면 정상 종료(finally)만 출력
//        } finally {
//            System.out.println("프로그램 정상 종료"); // 예외 처리
//        }
    }
}


