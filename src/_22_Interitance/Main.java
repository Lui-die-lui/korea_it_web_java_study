package _22_Interitance;

public class Main {
    public static void main(String[] args) {
        // 상속 - 기존 클래스(부모클래스)의 속성과 기능(메소드)을 새로운 클래스(자식 클래스)가 물려받는 것
        // 왜 상속을 해야하나?
        // => 코드의 재사용성과 계층 구조 설계를 가능하게 해주는 핵심 개념
        // => 유지 보수 즉 공통 기능이 한 곳(부모클래스)에 있으므로, 수정할 일이 생기면 부모 클래스 하나만 고치면 자식클래스에도 반영이 된다.
        // => 기존 클래스를 수정하지 않고도 새로운 기능을 가진 자식 클래스를 추가할 수 있다(개방 폐쇄 원칙)
        // 개방 폐쇄 원칙 : 확장에는 열려있고, 수정(변경)에는 닫혀있어야 한다.
        // 4대 원칙을 지키기위한 가이드라인(solid - O )

        // 자식클래스는 부모의 코드를 그대로 사용
        // 자식클래스는 부모의 코드를 그래돌 사용하거나, 필요한 기능을 또 추가하거나
        // 부모의 코드(메소드) 변경 가능 -> 오버라이딩*

        Animal animal01 = new Animal();
        animal01.setAnimalName("고양이");
        animal01.setAnimalAge(3);
        animal01.move();
//        animal01.Striped(); 자식이 가지고있는 고유 메소드이기때문에 X

        Tiger tiger1 = new Tiger();
        tiger1.setAnimalName("호랭이");
        System.out.println(tiger1.getAnimalName());
        tiger1.setAnimalAge(3);
        System.out.println(tiger1.getAnimalAge());
        tiger1.move();// animal에서 상속받음 - 오버라이딩으로 부모 메소드도 호출시킴
        tiger1.hunt();
        tiger1.setStriped(true);

        Human human = new Human("LSG", 30);
        System.out.println(human.getAnimalName());
        System.out.println(human.getAnimalAge());
        human.move();
        human.read("불편한 편의점");




    }
}
