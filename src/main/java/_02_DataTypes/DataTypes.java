package _02_DataTypes;
public class DataTypes {
    public static void main(String[] args) {
        System.out.println("hello"); //""있으면 문자열
        System.out.println(123); //""없으면 정수
        //변수
        //자료형 변수명 = 데이터;
        //정수 - int, long
        int num = 123;
        int num1;
        num1 = 234;
        num1 = 456;
        //변수 선언-값넣고-수정
        //결론적으로 456
        System.out.println(num1);
        System.out.println("num1은" + num1);
        long l = 1_000_000_000_000L; //뒤에 L 꼭 붙여서 long 이라는것을 표현 해줘야함 _(언더바)는 코드 내에서만 보임
        System.out.println("l은" + l);

        //실수 - float, double (실사용-더블 사용 많음)
        float f = 3.14f; //long 이랑 같음 f 붙이기 대소문자 상관없음
        double d = 3.14123456123456; //실수 더 길게 들어감
        // *부동 소수점의 오류

        //문자 - char(캐릭터)
        char a = 'a';//''=문자  ""=문자열
        char b = 'b';
        System.out.println(a + b); //아스키 코드 때문에 숫자 더해진 상태로 들어감
        System.out.println("" + a + b );//""=문자열로 인식하기 때문

        //문자열 - String
        String str = "안녕하세요"; //Sting=자료형 X / java class
        System.out.println(str);

        //논리 자료형 - boolean 참/거짓 값 중 나옴
        boolean isEmpty;
        isEmpty = true;
        isEmpty = false; // 마지막에 false로 변경된것임
        System.out.println(isEmpty);

      String name = "이슬기";
      int age = 30;
      String hobby = "00";
      String mbti = "entj";

        System.out.println("제 이름은" + name +"입니다. 제 나이는" + age + "살 이고,");
        System.out.println("취미는" + hobby + "입니다.");
        System.out.println("제 mbti는 " + mbti + "입니다");


















    }
}





