package _34_Exception;

// 오류
// 에러(Error) - 시스템적 오류 (JVM이 감당 못함)
// Exception - 개발자가 처리 가능한 오류

// 예외(Exception)
// - 프로그램 실행 중 발생할 수 있는 비정상적인 상황을 <객체(class)>로 표현한 것
public class Exception01 {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
//        int result = a / b;
        //Exception in thread "main" java.lang.ArithmeticException: / by zero
//        System.out.println(result);

        // 예외처리를 해줘야하는 이유
        /*Java의 특성상 예외가 하나라도 발생하면 전체 컴파일이 실패함
        * 개발자에게 빨간색으로 오류 뜸
        * 예외처리를 했을때 예외 상황에 대한 적절한 대응이 가능
        * */

        /* 예외처리 하는 법
        * try - catch - finally 구문 / throws, throw 키워드
         try {
         예외가 발생할 수 있는 코드
          } catch(ExceptionType e - 예외타입 + 객체) {
          예외가 발생했을때 처리할 코드
          } finally {
          예외가 발생을 하던 말던 무조건 실행되는 코드
          }*/

        try { // 예외가 뜨는 코드
            int result = a / b; //10, 0일때
            System.out.println("결과 : " + result);
        } catch (ArithmeticException e) { // Exception 이 최상위 클래스
            System.out.println("0으로 나눌 수 없습니다." + e.getMessage()); // 보유한 에러 메세지를 출력해줌 = 없으면 정상 종료(finally)만 출력
        } finally {
            System.out.println("프로그램 정상 종료"); // 예외 처리
        }

        // 배열 인덱스 예외
        int[] numbers = {1, 2, 3};
//        System.out.println(numbers[5]);
        try {
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(); // 트리거
            // throw = 이미 정의된 예외 클래스를 이용해서 의도적으로 예외를 발생(던지는)시킴
            // 반드시 new 키워드를 통해 예외 클래스의 객체를 생성해야 한다.

        }
    }

}
