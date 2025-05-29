package _20_Scanner;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        //Scanner => 입력
        Scanner scanner = new Scanner(System.in);
        //String 문자열을 입력받기
        //next() => 토큰 단위로 읽는다.
        //토큰 : 공백문자(띄어쓰기, 탭, 엔터)
        //nextLine() = 엔터가 입력될때까지

//        String str1 = scanner.next();
//        String str2 = scanner.next();
//        System.out.println("str1은" + str1); // Run 창에서 입력
//        System.out.println("str2은" + str2); // Run 창에서 입력
//

//        String str3 = scanner.nextLine();
//        System.out.println("str3은 "+ str3);

        //int 정수 입력받기
        //nextInt()
//        int num1 = scanner.nextInt();
//        int num2 = scanner.nextInt(); // 정수로 입력 , 다른 변수값 x
//        System.out.println("num1은" + num1); //next와 같이 토큰단위
//        System.out.println("num2은" + num2); //next와 같이 토큰단위
//
//        int num = scanner.nextInt(); // 123\n (enter) => 123
//        scanner.nextLine(); // 일종의 방패역할을 해줌
//        String str = scanner.nextLine(); //\n = 컴퓨터 입장에서 넘겨버림
//        System.out.println("num은 " + num + "str은 " + str);

        int age;
        String name;
        // 두개 입력받고 출력

        System.out.println("나이를 출력해주세요>>>>>>");
         age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("이름을 입력해주세요>>>>>>");
        name = scanner.next();
//        System.out.println("나이는 " + age + "이름은" + name );










    }
}
