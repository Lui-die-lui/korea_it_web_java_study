package _34_Exception;

class SignUpFailedException extends Exception {
    public SignUpFailedException(String message) {
        super(message);
        System.out.println("예외가 발생했습니다.");
    }
}

//14세 미만 가입 가능


public class SignUpException {
    public static void signUp(String name, int age) throws SignUpFailedException {


        if (age < 14) {
            // 예외 발생
            throw new SignUpFailedException("14세 미만은 가입할 수 없습니다.");
        }

        System.out.println(name + "님, 회원가입 완료되었습니다.");
    }


    public static void main(String[] args) {
        String name = "홍길동";
        int age = 15;

        try {
            signUp(name, age);
        } catch (SignUpFailedException e) {
            System.out.println("회원가입 실패 : " + e.getMessage());
        } finally {
            System.out.println("회원가입 처리 종료");
        }

    }
}
