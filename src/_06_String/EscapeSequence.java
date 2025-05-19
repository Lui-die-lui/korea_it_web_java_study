package _06_String;

public class EscapeSequence {
    public static void main(String[] args) {

    // 특수문자, 이스케이프 문자 (Escape Sequence, Escape Character, Special Character)

        System.out.println("자바가");
        System.out.println("너무");
        System.out.println("재밌어요");

    // \n : 줄바꿈
        System.out.println("자바가\n너무\n재밌어요"); // 위와 같은 결과


    // \t : tab을 누른것처럼 값이 정렬됨
    // 해물파전  9000원
    // 김치전   8000원
    // 부추전  8000원
        System.out.println("해물파전\t9000원\n김치전\t8000원\n부추전\t8000원");
    //연달아서 사용도 가능
        System.out.println("해물파전\t\t9000원\n\n김치전\t\t8000원\n\n부추전\t\t8000원");

//        System.out.println("C:Program Files\Java"); \J 자체로 읽혀서 실행 안됨
          System.out.println("C:\\Program Files\\Java"); // \ = 폴더 경로나 파일 경로는 역슬래시 2번 \\ 으로 표현

    // \" : 문자 " 로 출력
    //단비가 "냐옹" 이라고 했어요
//        System.out.println("단비가 "냐옹" 이라고 했어요"); // "를 끝나는 값으로 인식해서 실행이 안됨
        System.out.println("단비가 \"냐옹\" 이라고 했어요"); // 단비가 "냐옹" 이라고 했어요

    // \' : 문자 ' 로 출력
    //단비가 '뭘 봐?' 라는 표정을 지었어요
        System.out.println("단비가 \'뭘 봐?\' 라는 표정을 지었어요"); // 단비가 '뭘 봐?' 라는 표정을 지었어요
        System.out.println("단비가 '뭘 봐?' 라는 표정을 지었어요"); // ''는 문자열이 끝나는게 아니기 때문에 같은 값

    char c = 'A'; //문자 하나, ''로 감싸서 표현
//        c = '''; '를 끝나는 값으로 인식해서 실행이 안됨
    c = '\'';
        System.out.println(c); // ' 출력됨









}
}


