package _21_Class.Person;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.name); // public 이기 때문에 접근 가능
        System.out.println(person.age); // protected 이기 때문에 (같은 패키지) 접근 가능
        System.out.println(person.address); // default
//        System.out.println(person.id); // private가 걸려있기 때문에 안됨 - 접근 불가능
    }
}
