package _06_String;

public class StringCompare {
    public static void main(String[] args) {
        // 문자열 비교
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals(s2)); // 문자열 내용이 같으면 true, 다르면 false - false
        System.out.println(s1.equals("Java")); // 문자열 내용 전체가 괄호 값과 같으면 true, 다르면 false - true
        System.out.println(s2.equals("python")); // 대소문자도 구분해야함
        System.out.println(s2.equalsIgnoreCase("python")); // 대소문자 구분없이 문자열이 같으면 true

        // 문자열 비교 심화
        // 값이 아래 예시처럼 같을 시, 값이 같은 변수들이 하나의 값을 참조함.
        // ex) 식당 화장실의 비밀번호를 손님들에게 따로 메모지 전달 x / 비밀번호를 벽에 붙여놓고 다들 참고하는 방식
        s1 = "1234"; // 벽에 붙은 메모지의 비밀번호 정보 // 참조
        s2 = "1234";
        System.out.println(s1.equals(s2)); // s1의 내용이 s2와 같은지 확인 - true (내용을 비교)
        System.out.println(s1 == s2); // - true (참조 하는것을 비교)

        // new String - 새로 값을 부여해서 데이터가 따로따로 들어가있음. 같은곳에서 참조하지 않음
        s1 = new String("1234");
        s2 = new String("1234");
        System.out.println(s1.equals(s2)); // - true
        System.out.println(s1 == s2); // 다른 메모리 공간에 존재하는 것을 참조하기 때문에 - false
        //*그래서 일반적으로 문자열의 내용을 비교할때는 equals 이용할것!



    }
}