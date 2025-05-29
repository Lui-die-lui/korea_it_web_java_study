package _21_Class.Person;

public class Person {
    public String name;
    protected int age;
    String address;
    private String id;

    // 접근 제어자
    // public - 어디서든 접근 가능 = 많이씀*
    // default - 같은 패키지에서만 접근 (명시를 따로 하지않으면 default)
    // protected - 같은 패키지 또는 자식 클래스에서만 접근 가능
    // private - 해당 클래스 내부에서만 접근 가능 // 정보 은닉 = 가장 많이씀*
}
