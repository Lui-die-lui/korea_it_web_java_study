package _21_Class.Dog;

public class DogMain {
    public static void main(String[] args) {
        // 객체 생성하는 방법
        Dog dog = new Dog();

        //생성된 해당 객체 속성 값 대입 또는 변경
        dog.name = "방울이"; //대입
        dog.age = 3;

        dog.name = "호두"; //변경(수정)

        System.out.println(dog.name);
        System.out.println(dog.age + "세");

        // 생성된 객체 메소드 호출
        dog.bark(); // ctrl + 해서 값을 볼 수 있음
        dog.sleep();

        //Student라는 패키지 만들고 안에 Student와 StudentMain 만들고
        //이름, 나이, 이메일, 주소 변수 만들고
        //메소드 showInfo() -> 정보 출력
        //StudentMain에서 객체 생성 후 정보 대입
        //showInfo() 호출해서 정보 출력
    }
}
