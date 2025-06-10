package _35_Lambda;

// 람다식 (Lambda Expression)
// Java 8에서 도입된 '함수형 프로그래밍'을 지원하기 위한 표현식
// 익명 클래스를 사용해 함수처럼 동작하는 코드 (잠깐 정의 후 사용)
// -> 익명 함수    // 익명 함수에 표현되는 표현식

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        Runnable job1 = new Runnable() {
            // 할 일 목록 만듦
            // run() 메소드 밖에 없음

            // 익명 함수에 표현되는 표현식

            @Override // like 익명 클래스 // 람다를 사용 안하면 익명 클래스를 사용해야함
            public void run() {
                System.out.println("익명 클래스 방식");
            }
        };
        job1.run();

        Runnable job2 = () -> System.out.println("람다 방식");
        job2.run();

        // 람다식이 등장한 배경
        /*람다식이 나오기 전에는 함수형 프로그래밍을 하기위해 익명 클래스를 주로 사용
        익명 클래스 방식은 코드가 길어지고, 불필요한 반복이 많아질 수 있었다.
       -> 가독성 저하
        * */

        Comparator<Integer> comparator = new Comparator<Integer>(){ // 람다로 바꾸기 가능
            @Override
            public int compare (Integer o1, Integer o2){
                return o1.compareTo(o2);
            }
            // 두 객체 중 만약 앞의 객체가 더 작다면 음수, 같다면 0, 크다면 양수를 반환
        };
        System.out.println(comparator.compare(10,20));

        Comparator<Integer> comparator1 = (o1, o2) -> o1.compareTo(o2);
        System.out.println(comparator1.compare(20,20));

        // 한줄 - 람다
        // 여러줄 - 익명 클래스

        // 람다식의 장점
        /*
         코드 간결화
         표현력 향상
        * */

        // 람다식의 단점
        /*
        * 디버깅의 어려움
        * 재사용성 낮음 - 익명 클래스의 경우, 계속 사용 가능(내용 추가 가능)
        -> 람다식의 경우, 코드가 한 줄이 아니고 여러줄로 늘어났을대 결국엔 익명 클래스
        * */

        // 주요 함수형 인터페이스 - 메소드가 하나만 있는 인터페이스

        // Supplier - T get(); - Type like 제네릭
        // 매개변수 없이 [값을 반환하는 인터페이스] , 단순히 값을 '공급'하는 역할

        // Consumer - void accept(T t);
        // 값을 [매개변수로 받아서 사용하고, 아무것도 반환하지 않는 인터페이스], 데이터를 '소비' 하는 역할
        // (Consumer 소비자 생각하면 될듯)

        // Function<T , R> - R apply (T t); // T - 매개변수  R - return type
        // '하나의 매개변수'를 받아서, 연산을 수행한 후 결과를 리턴함
        // T는 매개변수 타입, R은 반환 타입

        // Predicate - boolean test(T t);
        // '하나의 매개변수'를 받아서 특정 조건을 검사한 후 true/false를 리턴

        // 1.supplier = 데이터 공급
        Supplier<String> stringSupplier = () -> "Hello, World"; // get - 반환

        // 2.consumer = 데이터 소비
        Consumer<String> stringConsumer = (message) -> System.out.println("메시지 : " + message); // void - 출력하고 끝
        String message = stringSupplier.get(); // 메세지에는 hello world 들어감
        stringConsumer.accept(message);
    }
    // 익명 클래스 -> 즉석해서 해당 클래스나 인터페이스의 메소드를 재정의해서 사용
    // ------ 메소드가 하나일수도 여러개일수도
    // ================================== 람다식 ========================================
    // 람다식 -> *메소드가 하나만 있는 인터페이스*(함수형 인터페이스)를 재정의해서 사용할때의 표현식
    // () -> 한줄 코드;
    // () -> {
    //  여러줄 코드
    //  }
}
