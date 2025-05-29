package _28_Static.Person;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("홍길동");
        Person person2 = new Person("김춘향");

        // instance 메소드
        person1.sayHello();
        person2.sayHello();

        // 클래스 메소드(static) - 객체생성 없이 바로 접근
        Person.showPopulation();

    }
}
