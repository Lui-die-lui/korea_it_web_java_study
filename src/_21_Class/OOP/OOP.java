package _21_Class.OOP;

import _21_Class.Person.Person;

public class OOP {
    public static void main(String[] args) {
        //OOP -> Object Oriented Programing
        //객체 지향 프로그래밍
        // - 현실 세계의 개념을 코드로 표현
        // - 사람, 동물, 자동차 하나의 객체로 보는 것
        // - 상태(속성)과 동작(기능)을 중심으로 프로그래밍

        //OOP 의 4가지 원칙
        /*
        1. 추상화
        - 복잡한 내부 동작은 감추고, 꼭 필요한 기능만 보여주는 것
        2. 캡슐화
        - 정보 은닉
        =데이터(변수)를 보호하고, 접근을 제한하여 안정성을 높이는 것
        3. 상속
        4. 다형성
        * */

        // 접근 제어자
        // public - 어디서든 접근 가능 = 많이씀*
        // default - 같은 패키지에서만 접근 (명시를 따로 하지않으면 default)
        // protected - 같은 패키지 또는 자식 클래스에서만 접근 가능
        // private - 해당 클래스 내부에서만 접근 가능 // 정보 은닉 = 가장 많이씀*

        Person person = new Person();
        System.out.println(person.name); // public 은 어디서든 가능
//        System.out.println(person.age); // 같은 패키지가 아니기때문에 안됨
//        System.out.println(person.address); // default = 같은 패키지 안에서만이라는 조건때문에 안됨



    }
}
