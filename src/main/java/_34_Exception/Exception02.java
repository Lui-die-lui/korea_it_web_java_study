package _34_Exception;

class LoginFailedException extends Exception { // 예외 클래스 필수!
    public LoginFailedException(String message) { // 2. 두번째 예외 발생 = 객체 생성하고
        super(message);
        System.out.println("예외가 발생했습니다."); // 3. 세번째 예외 발생
    }
}


public class Exception02 {
    public static void login(String id, String pw) throws LoginFailedException { // 4. 책임 전가 할 수 있도록 (여러개 가능)
        // throws - 일종의 책임전가 / 예외처리 - 호출한 곳에서 처리 할 수 있도록
        String correctId = "admin";
        String correctPw = "1q2w3e4r";

        if (!id.equals(correctId) || !pw.equals(correctPw)) {
            // 예외 발생
            throw new LoginFailedException("ID 또는 PW가 틀렸습니다."); // 1. 첫번째 예외 발생 // 새로운 객체 만들어줘야함
        }
    }


    public static void main(String[] args) {
        String inputId = "admin";
        String inputPw = "1234qwer";

        try {
            login(inputId, inputPw); // throws 예외 5. 로그인을 호출 한곳에서 예외가 터짐
        } catch (LoginFailedException e) {
            System.out.println("로그인 실패 : " + e.getMessage());  // 6.
        } finally {
            System.out.println("프로그램 정상 종료");
        }


    }
}
